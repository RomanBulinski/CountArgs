import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {

    @Test
    public void test01(){
        Main main = new Main();
        assertEquals(3, main.countArgs(1,2,3));
    }

    



//    public class SolutionTest {
//        @Test
//        public void sampleTest() {
//            assertEquals(3, Arguments.countArgs(1, 2, 3));
//            assertEquals(3, Arguments.countArgs(1, 2, "uhsaf uas"));
//            assertEquals(1, Arguments.countArgs(1));
//            assertEquals(4, Arguments.countArgs('a', 865, "asfhgajsf", new BigInteger("123456")));
//            assertEquals(0, Arguments.countArgs());
//        }
//    }

}
