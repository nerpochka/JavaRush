package com.javarush.test.level09.lesson11.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Locale localeEN = new Locale("en", "EN");
        SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, Y", localeEN);

        //Вариант 1
        /*
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");

        String dateInString = reader.readLine();
        try
        {
            Date date =  format.parse(dateInString);
            System.out.println(formatter.format(date).toUpperCase());
        }*/

        //Вариант 2
        try
        {
            System.out.println(formatter.format(new Date(reader.readLine())).toUpperCase());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
