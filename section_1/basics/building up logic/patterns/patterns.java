
/**
 * LOGIC FOR PATTERNS
 * 
 * (1) For the outer loop count the number of lines
 * (2) For the inner loop, focus on the columns, connect them to the rows
 * (3) Whatever you're printing, should be done inside inner for Loop
 * (4) Observe symmetry
 */


public class patterns {
    

    // PATTERN - 1
    /*
     * *****
     * *****
     * *****
     * *****
     * *****
     */
    
    public static void printPattern1(int n) {


        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }       
    }

    // PATTERN - 2
    /*
     * *
     * **
     * ***
     * ****
     * *****
     */

    public static void printPattern2(int n) {
       

        String row = "";
         for(int i = 0; i < n; i++) {
            row += "* ";
            System.out.println(row);    
         }
    }

    // PATTERN - 3
    /*
     * 1
     * 12
     * 123
     * 1234
     * 12345
     */

     public static void printPattern3(int n) {

        String row = "1";
        int sum = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(row);
            sum++;
            row += sum+" ";
        }
    }

    public static void nTriangle(int n) {
        // Write your code here
        String extra = "";
        int row2 = 1;
        int sum2 = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(row2);
            sum2++;
            row2++;
            row2+=sum2;
        }

    
    }
    
    public static void nTriangle2(int n) {
        // Write your code here
        int number = 1;
        String row = "";

        for (int i = 1; i <= n; i++) {
            row += number + " ";
            System.out.println(row);
            number++;
        }
    }


    public static void main(String[] args) {
        printPattern1(5);
        printPattern2(5);
        printPattern3(5);
        nTriangle2(3);
    }

}
