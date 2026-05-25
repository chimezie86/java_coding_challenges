
// the goal of this code is to count the occurrence of duplicate characters in a string
// The program achieves this by creating a Map data structure that stores each character as
// a key and the corresponding freq as a value and then compares  each character with 
// every other character before it. It loops through the input string and counts each character
// It then prints out the object containing the freq of the characters
package java_coding_challenges;

// import the map methods from java.utils library
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

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

