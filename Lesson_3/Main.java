package Lesson_3;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    //1. Создать массив с набором слов (10-20 слов, среди которых должны встречаться повторяющиеся).
    //   Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
    //   Посчитать, сколько раз встречается каждое слово.
    //2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
    //   В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона по фамилии.
    //   Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.

    public static void main(String[] args) {
        //Задание 1.
        String[] words = {"kiwi", "orange", "apple", "apricot", "apple", "avocado", "lemon", "lemon", "orange",  "pearl"};
        HashSet<String> doubleWords = new HashSet<>(Arrays.asList(words));
        System.out.println(doubleWords);
        for (String word : doubleWords){
            int count = 0;
            for(String wordToCompare : words){
                if(word.equals(wordToCompare)){
                    count++;
                }
            }
            System.out.println(word + ": " + count);
        }
        System.out.println("-----------------------");
        //Задание 2.
        Phonebook phonebook = new Phonebook();
        // Добавляем
        phonebook.add("Макс", "89995554321");
        phonebook.add("Александр", "89004567892");
        phonebook.add("Макс", "89996662233");
        phonebook.add("Алексей", "84657893341");
        phonebook.add("Алексей", "89034485500");
        phonebook.add("Макс", "89015558974");
        phonebook.add("Макс", "89015558974"); // добавляю такой же номер
        // Выводим
        phonebook.get("Аркадий");// вывод несуществующего пользователя
        phonebook.get("Макс");
        phonebook.get("Алексей");
        phonebook.get("Александр");
        System.out.println();

        phonebook.print(phonebook);
    }
}
