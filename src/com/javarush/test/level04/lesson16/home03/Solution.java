package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader c = new BufferedReader(new InputStreamReader(System.in));

        int suma = 0;
        int a = Integer.parseInt (c.readLine());

        while (a != -1)
        {
            suma += a;
            a = Integer.parseInt (c.readLine());
        }
        System.out.println (suma-1);
    }
}
