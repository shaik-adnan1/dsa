import java.util.HashMap;

public class hashmap {
    public static int romanToInt(String s) {
        HashMap<String, Integer> rMap = new HashMap<>();
        rMap.put("I", 1);
        rMap.put("IV", 4);
        rMap.put("IX", 9);
        rMap.put("V", 5);
        rMap.put("X", 10);
        rMap.put("XL", 40);
        rMap.put("XC", 90);
        rMap.put("L", 50);
        rMap.put("C", 100);
        rMap.put("CD", 400);
        rMap.put("CM", 900);
        rMap.put("D", 500);
        rMap.put("M", 1000);

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            String currentSymbol = String.valueOf(s.charAt(i)); // Convert character to string
            String nextSymbol = i < s.length() - 1 ? String.valueOf(s.charAt(i + 1)) : null; 

            if (nextSymbol != null && rMap.get(currentSymbol) < rMap.get(nextSymbol)) {
                sum -= rMap.get(currentSymbol);
            } else {
                sum += rMap.get(currentSymbol);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("XI")); 
    }
}


// Faster solution 

class Solution {
    public int romanToInt(String s) {
        int res = 0;
        int index = 0;
        int i = 0;
        while (i < s.length()) {
            char curr = s.charAt(i);
            if (curr == 'I') {
                if (i + 1 < s.length()) {
                    if (s.charAt(i + 1) == 'V') {
                        res = res + 4;
                        i = i + 2;
                        continue;
                    } else if (s.charAt(i + 1) == 'X') {
                        res = res + 9;
                        i = i + 2;
                        continue;
                    }
                }
                res = res + 1;
                i = i + 1;
            } else if (curr == 'X') {
                if (i + 1 < s.length()) {
                    if (s.charAt(i + 1) == 'L') {
                        res = res + 40;
                        i = i + 2;
                        continue;
                    } else if (s.charAt(i + 1) == 'C') {
                        res = res + 90;
                        i = i + 2;
                        continue;
                    }
                }
                res = res + 10;
                i = i + 1;
            } else if (curr == 'C') {
                if (i + 1 < s.length()) {
                    if (s.charAt(i + 1) == 'D') {
                        res = res + 400;
                        i = i + 2;
                        continue;
                    } else if (s.charAt(i + 1) == 'M') {
                        res = res + 900;
                        i = i + 2;
                        continue;
                    }
                }
                res = res + 100;
                i = i + 1;
            } else if (curr == 'V') {
                res = res + 5;
                i = i + 1;
            } else if (curr == 'L') {
                res = res + 50;
                i = i + 1;
            } else if (curr == 'D') {
                res = res + 500;
                i = i + 1;
            } else if (curr == 'M') {
                res = res + 1000;
                i = i + 1;
            }
            index = index + 1;
        }
        return res;
    }
}