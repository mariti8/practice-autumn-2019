package lesson01.part2;

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
    SystemOutGatewayUtil.setCustomOut();
    ByteArrayOutputStream out = SystemOutGatewayUtil.getOutputArray();
    out.reset();

    int a = 1;
    int b = 2;


    boolean foundA = false;
    boolean foundB = false;
    String clString = "";
    //ClassReader reader = ClassReader.openClass(lesson02.part02.Task04.class);



    Task04.main(null);
    String[] output = out.toString().trim().split("\n");

    assertEquals(2, output.length);
    assertEquals(a + b, Integer.parseInt(output[0].trim()));
    assertEquals(a * b, Integer.parseInt(output[1].trim()));

}
}