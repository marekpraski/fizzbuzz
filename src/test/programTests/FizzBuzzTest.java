package programTests;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import program.FizzBuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FizzBuzzTest {
    private FizzBuzz fb;
    @Before
    public void setUp() throws Exception {
        fb = new FizzBuzz();
    }

    @Test
    public void returnFizzWhenNumberDividedByThree(){
        int[] numbers = {3, 9, 15};
        for (int number : numbers) {
            Assert.assertTrue(fb.isDividedByThree(number));
        }
    }
    @Test
    public void returnBuzzWhenNumberDividedByFive(){
        int[] numbers = {5, 10, 15};
        for (int number : numbers) {
            Assert.assertTrue(fb.isDividedByFive(number));
        }

    }
    @Test
    public void returnsItselfWhenNotDividedByThreeOrFive(){
        Random random = new Random(100);
        List<String> fizzBuzzList = fb.getFizzBuzzList();
        for (int i=0; i<50; i++) {
            Integer k = random.nextInt()+1;
            if (!(k % 3 ==0 || k % 5 ==0)) {
                Assert.assertEquals(fizzBuzzList.get(k), k.toString());
            }
        }
    }
    @Test
    public void listContains100Item() {
        List<String> fizzBuzzList = fb.getFizzBuzzList();
        Assert.assertEquals(fizzBuzzList.size(),100);
    }

}
