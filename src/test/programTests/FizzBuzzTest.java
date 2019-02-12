package programTests;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import program.FizzBuzz;

import java.util.List;
import java.util.Random;

public class FizzBuzzTest {
    private FizzBuzz fb;
    private List<String> fizzBuzzList;
    @Before
    public void setUp() throws Exception {
        fb = new FizzBuzz();
    }

    @Test
    public void returnFizzWhenNumberDividedByThree() {
        fizzBuzzList = fb.getFizzBuzzList();
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 15 !=0) {
                Assert.assertEquals("Fizz", fizzBuzzList.get(i - 1));
            }
        }
    }
    @Test
    public void returnBuzzWhenNumberDividedByFive() {
        fizzBuzzList = fb.getFizzBuzzList();
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 15 !=0) {
                Assert.assertEquals("Buzz", fizzBuzzList.get(i - 1));
            }

        }
    }
    @Test
    public void returnFizzBuzzWhenNumberDividedByFifteen() {
        fizzBuzzList = fb.getFizzBuzzList();
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                Assert.assertEquals("FizzBuzz", fizzBuzzList.get(i - 1));
            }

        }
    }
    @Test
    public void returnsItselfWhenNotDividedByThreeOrFive(){
        Random random = new Random();
        List<String> fizzBuzzList = fb.getFizzBuzzList();
        for (int i=0; i<100; i++) {
            Integer k = random.nextInt(100);
            if (!(k % 3 ==0 || k % 5 ==0)) {
                Assert.assertEquals(fizzBuzzList.get(k-1), k.toString());
            }
        }
    }
    @Test
    public void listContains100Items() {
        List<String> fizzBuzzList = fb.getFizzBuzzList();
        Assert.assertEquals(fizzBuzzList.size(),100);
    }

}
