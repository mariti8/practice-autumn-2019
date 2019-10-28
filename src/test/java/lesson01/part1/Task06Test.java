package lesson01.part1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import util.SystemOutGatewayUtil;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class Task06Test {
@Test
    public void main(){
    /* Требования:
     * 1. В методе printCircleLength нужно вывести длину окружности, рассчитанную по формуле: 2 * Pi * radius.
     * 2. Метод main должен вызывать метод printCircleLength с параметром 5.
     * 3. Метод main не должен вызывать команду вывода текста на экран.
     * 4. Программа должна выводить длину окружности с радиусом 5.
     */
    SystemOutGatewayUtil.setCustomOut();
    Task06.printCircleLength(5);

    ByteArrayOutputStream out = SystemOutGatewayUtil.getOutputArray();
    String rawout = out.toString();
    String output = out.toString().trim();
    Assert.assertEquals(Double.toString(2 * Math.PI * 5), output);
    try {
        out.reset();
        Task06.main(null);
        Assert.assertTrue(out.toString().equals(rawout));
    }catch(Exception e)
    {
        System.out.println(e.toString());
    }

    out.reset();
}
}