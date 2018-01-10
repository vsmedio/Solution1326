/* 
Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.

Пример ввода:
5
8
11
3
2
10

Пример вывода:
2
8
10


Требования:
1. Программа должна считывать данные с консоли.
2. Программа должна создавать FileInputStream для введенной с консоли строки.
3. Программа должна выводить данные на экран.
4. Программа должна вывести на экран все четные числа считанные из файла отсортированные по возрастанию.
5. Программа должна закрывать поток чтения из файла(FileInputStream).
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader conReader = new BufferedReader(new InputStreamReader (System.in));
        ArrayList<Integer> vect = new ArrayList<>();

        try {
            BufferedReader fileReader = new BufferedReader((new InputStreamReader(new FileInputStream(conReader.readLine()))));

            while (fileReader.ready()) {
                vect.add(Integer.parseInt(fileReader.readLine()));
            }
            fileReader.close();
        }catch (FileNotFoundException e){
            System.out.println("File Not Found!");
        } catch (IOException e) {
            System.out.println("Can't read File");
        }

        Collections.sort (vect);

        for (Integer i : vect) {
            if (i % 2 == 0)
                System.out.println(i);
        }



    }
}