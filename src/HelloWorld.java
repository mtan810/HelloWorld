/**
 * Created by user on 9/11/2016.
 */
public class HelloWorld {
    public static void main(String[] args) {
        if (args.length == 0 || args.length > 1) {
            System.out.println("Enter your name! (one word only)");
        }
        else {
            System.out.println("Hello, " + args[0] + "!");
        }
    }
}
