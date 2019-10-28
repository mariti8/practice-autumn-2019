package lesson01.part2;

import org.junit.Assert;
import org.junit.Test;
import util.SystemOutGatewayUtil;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.*;

public class Task13Test {
@Test
    public void main(){
    SystemOutGatewayUtil.setCustomOut();
    ByteArrayOutputStream out = SystemOutGatewayUtil.getOutputArray();
    out.reset();

    String testString = "test";

    Task13.print3(testString);

    String[] output = out.toString().trim().split("\n");

    Assert.assertEquals(3, output.length);

    for (String outString: output) {
        Assert.assertEquals(testString, outString.trim());
    }

    out.reset();
    Task13.main(null);

    Assert.assertEquals(3, out.toString().trim().split("\n").length);

}
}