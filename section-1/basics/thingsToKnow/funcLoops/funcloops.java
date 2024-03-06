
public class funcloops {

    public static void main(String[] args) {
        String name = "Shaik";
        hello(name);
        hello(name);
        
        // for loops

        for(int i = 10; i > 0; i--) {
            System.out.println("Hey there it's: " + i);
        }

        // While loop
        int i = 20;
        while(i < 10) {
            System.out.println("Not less than 10");
            i -= 5;
        }

        System.out.println(add(2,3));
    }

    // methods
    // void is the return type of the method!
    static void hello(String n) {
        System.out.println("Hello" + n);
    }

    static int add(int x, int y) {
        return x + y;
    }
}
