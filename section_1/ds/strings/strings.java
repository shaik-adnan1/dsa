public class strings {

    public static void main(String[] args) {
        // STRING = a reference data type that can store one or more characters
        //          reference sata types have access to useful methods
        
        String name = "Shaik Adnan";

        // string.equals() -> case Sensitive
        boolean nameEq = name.equals("Shaik adnan");
        System.out.println(nameEq);  // true if both are same,\
        
        // String.equalsIgnoreCase() -> !Case sensitive
        boolean nameEqIg = name.equalsIgnoreCase("Shaik adnan");
        System.out.println(nameEqIg); // true if both are same,

        // .length()
        int nameLen = name.length();
        System.out.println(nameLen);

        // .charAt()
        char nameChar = name.charAt(6);
        System.out.println(nameChar);

        // .indexOf()
        int nameIndex = name.indexOf("A");
        System.out.println(nameIndex);

        // .isEmpty()
        boolean nameIsEmpty = name.isEmpty();
        System.out.println(nameIsEmpty);

        // .toUpperCase
        String nameUpperC = name.toUpperCase();
        System.out.println(nameUpperC);

        // .toUpperCase
        String nameLowerC = name.toLowerCase();
        System.out.println(nameLowerC);

        // trim()
        String nameT = name.trim();
        System.out.println(nameT);

        // .replace
        String nameReplace = name.replace("a", "o");
        System.out.println(nameReplace);
    }
}