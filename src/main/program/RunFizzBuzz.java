package program;

public class RunFizzBuzz {
    public static void main (String[] args) {
        FizzBuzz fb = new FizzBuzz();
        for (String item : fb.getFizzBuzzList()) {
            System.out.println(item);
        }
    }
}
