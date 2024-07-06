import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addEntry("Sanji", "12345");
        phoneBook.addEntry("Sanji", "67890");
        phoneBook.addEntry("Luffy", "54321");
        phoneBook.addEntry("Luffy", "12345");
        phoneBook.addEntry("Luffy", "98765");
        phoneBook.addEntry("Zoro", "54321");

        List<Map.Entry<String, Set<String>>> sortedEntries = phoneBook.getSortedEntries();

        for (Map.Entry<String, Set<String>> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }


}
