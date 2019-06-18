import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {

    @Test
    public void test01(){
        Main main = new Main();
        assertEquals(3, main.countArgs(1,2,3));
    }

    @Test
    public void test02(){
        Main main = new Main();
        assertEquals(3, main.countArgs(1, 2, "uhsaf uas"));
    }

    @Test
    public void test03(){
        Main main = new Main();
        assertEquals(4, main.countArgs('a', 865, "asfhgajsf", new BigInteger("123456")));
    }

    @Test
    public void test04(){
        Main main = new Main();
        assertEquals(0, main.countArgs());
    }

    @Test
    public void test05(){
        Main main = new Main();
        assertEquals(1, main.countArgs(1));
    }




}
