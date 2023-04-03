import com.digital.Calc;
import com.digital.SomeClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.*;

import static org.testng.Assert.*;

public class CalculatorTest {


    SoftAssert softAssert = new SoftAssert();
        @Test
        public void addTwoNumbersTest(){
            assertEquals(Calc.add(3,4),7);

        }


        @Test
        public void testSoftAssert(){
            softAssert.assertEquals(Calc.add(3,4),7);
            softAssert.assertEquals(Calc.add(3,4),3);
            softAssert.assertEquals(Calc.add(3,4),3);
            softAssert.assertEquals(Calc.add(3,4),7);
            softAssert.assertAll();
        }

        @Test

        public void testAssertTrue(){
            assertTrue(SomeClass.isFunne(true));
            assertTrue(SomeClass.isFunne(false));
        }

        @Test

    public void test123(){
            Object obj = new Object();
            obj = "Erlan";
            assertNotNull(null);
        }



}
