package lesson02.part01;

import jdk.internal.org.objectweb.asm.ClassReader;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import util.SystemOutGatewayUtil;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class Task03Test {
@Test
    public void main(){
    SystemOutGatewayUtil.setCustomOut();
    ByteArrayOutputStream out = SystemOutGatewayUtil.getOutputArray();
    out.reset();

    Task03.main(null);
    String[] output = out.toString().trim().split("\n");
    Assert.assertEquals(2, output.length);

    out.reset();
    Assert.assertEquals(2 * 1.11, Task03.convertEurToUsd(2, 1.11), 0);
    Assert.assertTrue(out.toString().isEmpty());
}
}