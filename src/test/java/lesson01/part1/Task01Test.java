package lesson01.part1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import util.SystemOutGatewayUtil;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class Task01Test {
    @Test
    public void test01(){
        SystemOutGatewayUtil.setCustomOut();
        Task01.main(null);
        ByteArrayOutputStream out = SystemOutGatewayUtil.getOutputArray();
        String output = out.toString();
        /**
         * Hello World!
         * Напиши программу, которая выводит на экран надпись:
         * Hello World!
         * Требования:
         * 1. Программа должна выводить текст.
         * 2. Текст должен начинаться с "Hello".
         * 3. Текст должен заканчиваться на "!".
         * 4. Текст должен состоять из 12 символов, включая пробелы и знаки препинания.
         * 5. Текст должен состоять из одной строки.
         */

        //Проверка по условиям
        Assert.assertFalse("пусто", output.isEmpty());
        Assert.assertTrue("не начинается Hello", output.startsWith("Hello"));
        Assert.assertTrue("Не заканчивается на !", output.endsWith("!"));
        Assert.assertEquals("Не 12 символов",12, output.length());
        Assert.assertEquals("Не одна строка (в строке)" ,1, output.split("\n").length);

        //ПРОВЕРКА ЕЩЕ ОДНОЙ ПУСТОЙ СТРОКИ ИЗ-ЗА println()
        Assert.assertFalse("Не одна строка (println в конце)" , output.endsWith("\n"));

        //Итог
        Assert.assertEquals("Hello World!", output);

        out.reset();
    }

}