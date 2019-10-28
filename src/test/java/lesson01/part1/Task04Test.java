package lesson01.part1;

import jdk.internal.org.objectweb.asm.ClassReader;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import util.SystemOutGatewayUtil;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class Task04Test {
@Test
    public void main(){
    /**
     * Требования:
     * 1. Программа должна выводить на экран надпись "9 умножить на 3 равно 27"
     * 2. Нужно раскомментировать одну строку.
     * 3. Нельзя изменять (добавлять, удалять) строки с кодом.
     */
    ByteArrayOutputStream out = SystemOutGatewayUtil.getOutputArray();

    int rowsCount = 0;
    int commentsCount = 0;
    String output = out.toString().trim();
    output = output.replace("\r","");
    Assert.assertEquals("расскоментируйте 1 строку", 6, commentsCount);
    Assert.assertEquals("нельзя добавлять/удалять код", 33, rowsCount);
    Assert.assertTrue("not 25" , output.contains("25"));
    Assert.assertTrue("not 26", output.contains("26"));

    out.reset();
}
}