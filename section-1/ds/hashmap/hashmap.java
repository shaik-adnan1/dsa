import java.util.HashMap;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> empIds = new HashMap<>();
        // 

        empIds.put("I", 1);
        empIds.put("IV", 4);
        empIds.put("IX", 9);
        empIds.put("V", 5);
        empIds.put("X", 10);
        empIds.put("XL", 40);
        empIds.put("XC", 90);
        empIds.put("L", 50);
        empIds.put("C", 100);
        empIds.put("CD", 400);
        empIds.put("CM", 900);
        empIds.put("D", 500);
        empIds.put("M", 1000);

        System.out.println(empIds);

        System.out.println(empIds.get("Shaik"));


    }

    public static int romanToInt(String s) {
        int sum = 0;
        
        for(int i = 0; i < s.length() - 1; i++) {
            String subPair = s[i] + s[i + 1];
            if(empIds.containsKey())
        }
    }

}
