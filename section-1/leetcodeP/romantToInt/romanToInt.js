/**
 * 13. Roman to Integer
Easy
Topics
Companies
Hint
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
 */

// Using an Object

const romanToInt = s => {
  const romansObj = {
    I: 1,
    IV: 4,
    IX: 9,
    V: 5,
    X: 10,
    XL: 40,
    XC: 90,
    L: 50,
    C: 100,
    CD: 400,
    CM: 900,
    D: 500,
    M: 1000,
  };
  let sum = 0;
  if (s > 3999 || s < 1) {
    return;
  }

  //   for (let i = 0; i < s.length; i++) {
  //     if (romansObj[s[i]]) {
  //     //   switch (s[i]) {
  //     //     case s[i] === "I" && s[i + 1] === "V":
  //     //       sum += romansObj["IV"];
  //     //       i += 1;
  //     //     case s[i] === "I" && s[i + 1] === "X":
  //     //       sum += romansObj["IV"];
  //     //       i += 1;
  //     //     case s[i] === "X" && s[i + 1] === "L":
  //     //       sum += romansObj["XL"];
  //     //       i += 1;
  //     //     case s[i] === "X" && s[i + 1] === "C":
  //     //       sum += romansObj["XC"];
  //     //       i += 1;
  //     //     case s[i] === "C" && s[i + 1] === "D":
  //     //       sum += romansObj["CD"];
  //     //       i += 1;
  //     //     case s[i] === "C" && s[i + 1] === "M":
  //     //       sum += romansObj["CM"];
  //     //       console.log("True");
  //     //       i += 1;
  //     //     default:
  //     //       sum += romansObj[s[i]];
  //     //   }
  //     }
  //   }

  for (let i = 0; i < s.length; i++) {
    if (i < s.length - 1 && romansObj[s[i] + s[i + 1]]) {
      sum += romansObj[s[i] + s[i + 1]];
      i++;
    } else {
      sum += romansObj[s[i]];
    }
  }

  return sum;
};

console.log(romanToInt("MCMXCIV"));

// Using a Map

function romanToInt2(s) {
  const conversions = new Map([
    ["I", 1],
    ["IV", 4],
    ["IX", 9],
    ["V", 5],
    ["X", 10],
    ["XL", 40],
    ["XC", 90],
    ["L", 50],
    ["C", 100],
    ["CD", 400],
    ["CM", 900],
    ["D", 500],
    ["M", 1000],
  ]);

  let sum = 0;

  for (let i = 0; i < s.length; i++) {
    const subPair = s[i] + s[i + 1];

    if (conversions.has(subPair)) {
      sum += conversions.get(subPair);
      i++;
    } else {
      sum += conversions.get(s[i]);
    }
  }
  return sum;
}

console.log(romanToInt2("MCMXCIV"));