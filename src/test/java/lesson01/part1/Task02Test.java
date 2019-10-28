package lesson01.part1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import util.SystemOutGatewayUtil;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class Task02Test {
    @Test
    public void main() {
        /**
         * Требования:
         * 1. Программа должна выводить текст.
         * 2. Текст должен начинаться с "Hello".
         * 3. Текст должен заканчиваться на "!".
         * 4. Текст должен состоять из 3 строк.
         * 5. Попробуй удалить метод main, в пустом месте написать psvm и нажать tab.
         */
        SystemOutGatewayUtil.setCustomOut();
        ByteArrayOutputStream out = SystemOutGatewayUtil.getOutputArray();
        try {
            out.flush();
        }catch (IOException e)
        {
            System.out.println(e.toString());
        }
        Task02.main(null);
        //Условия
        Assert.assertFalse("Пусто", out.toString().isEmpty());

        Assert.assertTrue("не начинается с Hello", out.toString().startsWith("Hello"));
        Assert.assertTrue("не заканчивается на !", out.toString().endsWith("!"));

        String[] hells = out.toString().split("\n");
        Assert.assertEquals("Не 3 строки", 3, hells.length);
        for (String hell: hells) {
            Assert.assertEquals("Hello World!", hell);
        }

        //ПРОВЕРКА ЕЩЕ ОДНОЙ ПУСТОЙ СТРОКИ ИЗ-ЗА println()
        Assert.assertFalse("Не одна строка (println в конце)" , out.toString().endsWith("\n"));

        out.reset();
    }

}