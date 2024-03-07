import java.util.Scanner;

public class input_output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char character = sc.next().charAt(0);

        System.out.println(checkChar(character));

    }
    // Method to check the character

    public static int checkChar(char character) {
        if (character >= 'A' && character <= 'Z') {
            return 1;
        } else if (character >= 'a' && character <= 'z') {
            return 0;
        }
        else {
            return -1;
        }
    }
}