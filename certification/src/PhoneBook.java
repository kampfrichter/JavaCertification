import java.util.*;

public class PhoneBook {
    private Map<String, Set<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void addEntry(String name, String phone) {
        phoneBook.computeIfAbsent(name, k -> new HashSet<>()).add(phone);
    }

    public List<Map.Entry<String, Set<String>>> getSortedEntries() {
        List<Map.Entry<String, Set<String>>> entries = new ArrayList<>(phoneBook.entrySet());
        entries.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));
        return entries;
    }
}
