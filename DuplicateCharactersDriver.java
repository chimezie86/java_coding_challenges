package java_coding_challenges;

// import the map methods from java.utils library
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

// this is where our code runs
public class DuplicateCharactersDriver {
    // the main method is the driver code that runs the duplicate character object
    public static void main(String[] args) {

        // create a duplicateCharacter object
        DuplicateCharactersV2 duplicateCharacters = new DuplicateCharactersV2();

        // call the countDuplicateCharacters method on the duplicate character's object
        Map<Character, Long> result = duplicateCharacters.countDuplicateCharacters("hello");

        // diplay the result 
        System.out.println(result);
    }
}