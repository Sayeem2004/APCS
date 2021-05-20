import java.util.*;

public class UserName {
    private ArrayList<String> possibleNames;

    // Part A
    public UserName(String firstName, String lastName) {
        possibleNames = new ArrayList<String>();
        for (int i = 1; i <= firstName.length(); i++) {
            possibleNames.add(lastName+firstName.substring(0,i));
        }
    }

    public boolean isUsed(String name, String[] arr) {
        // Not Implemented
    }

    // Part B
    public void setAvailableUserNames(String[] usedNames) {
        for (int i = 0; i < possibleNames.size(); i++) {
            if (isUsed(possibleNames.get(i), usedNames)) {
                possibleNames.remove(i);
                i--;
            }
        }
    }
}
