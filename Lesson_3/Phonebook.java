package Lesson_3;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Phonebook {
    private HashMap<String, ArrayList<String>> book;

    public Phonebook(){
        this.book = new HashMap<>();
    }

    public void add(String surname, String number){
        if(book.containsKey(surname)){
            List<String> numbers = book.get(surname);
            if(!numbers.contains(number)) {
                numbers.add(number);
            }
            else {
                System.out.println("Номер уже есть в базе.");
            }
        }
        else {
            book.put(surname, new ArrayList<>(Arrays.asList(number)));
        }
    }

    public void get(String surname) {
        if(book.containsKey(surname)) {
            System.out.println(surname + ": " + book.get(surname));
        }
        else {
            System.out.println("Такого пользователя нет");
        }
    }


    public void print(Phonebook phonebook){
        book.forEach((surname,number) -> System.out.println(MessageFormat.format("Имя: {0}, номер: {1}", surname, number)));
    }



}
