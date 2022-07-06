package lesson3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] arrayString = {
                "Iguana", "Chamelion", "Mouse", "Spider", "Horse",
                "Cat", "Dog", "Mouse", "Bird", "Horse",
                "Chamelion", "Dog", "Spider", "Bird", "Horse"
        };

        Map<String, Integer> mapString = new HashMap<String, Integer>();

        for (String string : arrayString) {
            if (!mapString.containsKey(string)) {
                mapString.put(string, 1);
            } else {
                mapString.put(string, mapString.get(string) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : mapString.entrySet()) {
            System.out.println(entry.getKey() + "            кол-во в списке " + entry.getValue());
        }
        System.out.println("-----------------------------------------");

        Phonebook phonebook = new Phonebook();
        phonebook.add("Kate", "+7 912 100-20-30");
        phonebook.add("Kate", "+7 912 100-20-31");
        phonebook.add("Kate", "+7 912 100-20-32");
        phonebook.add("Igor", "+7 912 100-20-40");
        phonebook.add("Igor", "+7 912 100-20-42");
        phonebook.add("Igor", "+7 912 100-20-44");
        phonebook.add("Igor", "+7 912 100-20-46");

        phonebook.get("Kate");
        phonebook.get("Igor");
    }
}

