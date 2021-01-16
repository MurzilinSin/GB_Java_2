package Lesson_2;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Main {
    //1. Напишите метод, на вход которого подается двумерный строковый массив размером 4х4,
    // при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
    //2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
    // Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
    // должно быть брошено исключение MyArrayDataException – с детализацией, в какой именно ячейке лежат неверные данные.
    //3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException
    // и MyArrayDataException и вывести результат расчета.

    public static void main(String[] args) {
        String[][] arrayCorrect =          {{"4","1","8","12"},
                                            {"5","2","3","11"},
                                            {"4","2","7","8"},
                                            {"1","19","2","76"}};

        String[][] arrayIncorrectString =  {{"4","1","8","12"},
                                            {"5","2","3","11"},
                                            {"4","pew","7","8"},
                                            {"1","s","2","76"}};

        String[][] arrayIncorrectLength =  {{"4","1","8","12"},
                                            {"5","2","3","11"},
                                            {"1","s","2","76"}};

        System.out.println(arrayException(arrayCorrect));
    }

    public static int arrayException(String[][] array) {
        int sum = 0;
        if(array.length != 4){throw new MyArraySizeException("НЕВЕРНОЕ ЗНАЧЕНИЕ МАССИВА");}
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                }
                catch(NumberFormatException e) {
                    throw new MyArrayDataException("Не все значения массива являются числами!");
                }
            }
        }
        return sum;
    }
}
