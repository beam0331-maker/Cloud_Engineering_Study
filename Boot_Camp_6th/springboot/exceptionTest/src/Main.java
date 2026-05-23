import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Test{

    public void a() {
        System.out.println("a");
        b();
    }
    public void b() {
        System.out.println("b");
        int n = 10;
        int result = n/0;
    }

}

public class Main {
    public static void main(String[] args) {

        System.out.println("Start");
        Test test = new Test();
        try {
            test.a();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("End");
    }
}