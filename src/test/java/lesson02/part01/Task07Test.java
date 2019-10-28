package lesson02.part01;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.net.JarURLConnection;

import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class Task07Test {
@Test
    public void main(){
    try {
        Assert.assertEquals(Task07.Protoss.class.getDeclaredFields().length, 1);
        Assert.assertEquals(Task07.Terran.class.getDeclaredFields().length, 1);
        Assert.assertEquals(Task07.Zerg.class.getDeclaredFields().length, 1);
    }catch(Exception e){
        Assert.fail("Классы изменять нельзя");
    }
}
}