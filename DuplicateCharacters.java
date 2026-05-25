package java_coding_challenges;

// import the map methods from java.utils library
import java.util.Map;
import java.util.HashMap;

// create a DuplicateCharacters class to hold the character counting logic
public class DuplicateCharacters {

    // design a method that uses a map data structure to store each character against its freq
    public Map<Character, Integer> countDuplicateCharacters(String text) {

        // create a map object. The map uses character and integer as key, value pairs
        Map<Character, Integer> map = new HashMap<>();

        // loop through the text 
        for (int i = 0; i < text.length(); i++) {

            // extract each character from the text
            char character = text.charAt(i);

            // for each character key, compute the corresponding integer value
            map.compute(character, (key, value) -> (value == null) ? 1 : ++value);
        }
        // return the map object
        return map;
    }
}
// this is where our code runs
class DuplicateCharactersDriver {
    // the main method is the driver code that runs the duplicate character object
    public static void main(String[] args) {

        // create a duplicate characters object
        DuplicateCharacters dc = new DuplicateCharacters();

        // call the count duplicate character method on the duplicate character's object
        Map<Character, Integer> result = dc.countDuplicateCharacters("hello");
        
        // diplay the result 
        System.out.println(result);
    }
}