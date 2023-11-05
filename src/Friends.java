import java.util.ArrayList;
import java.util.Collections;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class Friends {
    // Український алфавіт
    public static final Comparator<String> UKRAINIAN_ALPHABETICAL_ORDER = new Comparator<String>() {
        private Collator collator = Collator.getInstance(new Locale("uk", "UA"));

        @Override
        public int compare(String s1, String s2) {
            return collator.compare(s1, s2);
        }
    };

    public static void main(String[] args) {
        ArrayList<String> friendList = new ArrayList<>();

        // Додавання імен друзів у список
        friendList.add("Анна");
        friendList.add("Петро");
        friendList.add("Олена");
        friendList.add("Іван");
        friendList.add("Марія");

        // Виведення списку друзів до сортування
        System.out.println("Список друзів:");
        for (String friend : friendList) {
            System.out.println(friend);
        }

        // Сортування списку друзів за українським алфавітом
        Collections.sort(friendList, UKRAINIAN_ALPHABETICAL_ORDER);

        // Виведення відсортованого списку друзів
        System.out.println("\nСписок друзів після сортування:");
        for (String friend : friendList) {
            System.out.println(friend);
        }
    }
}
