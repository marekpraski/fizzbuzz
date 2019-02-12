package program;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {


    public List<String> getFizzBuzzList() {
        List<String> fizzBuzzList = new ArrayList();
        for (Integer i=1; i<101; i++) {
            if (isDividedByFifteen(i))
            fizzBuzzList.add("FizzBuzz");
            else {
                if (isDividedByFive(i))
                    fizzBuzzList.add("Buzz");
                else if (isDividedByThree(i))
                    fizzBuzzList.add("Fizz");
                else fizzBuzzList.add(i.toString());
            }
        }
        return fizzBuzzList;
    }

    private boolean isDividedByFive(Integer number) {
        return (number % 5 == 0);
    }

    private boolean isDividedByThree(Integer number) {
        return (number % 3 == 0);
    }
    private boolean isDividedByFifteen(Integer number) {
        return (number % 15 == 0);
    }

}
