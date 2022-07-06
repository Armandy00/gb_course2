package lesson3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Phonebook {
    private Map<String, TreeSet<String>> phonebook = new HashMap<String, TreeSet<String>>();

    public void add(String lastname, String phoneNumber) {
        if (phonebook.containsKey(lastname)) {
            phonebook.get(lastname).add(phoneNumber);

        } else {
            phonebook.put(lastname, new TreeSet<String>(Arrays.asList(phoneNumber)));
        }
    }

    public  void get(String lastname) {
        System.out.println(lastname);
        System.out.println(phonebook.get(lastname));
        System.out.println("-----------------------------------------");
    }
}

