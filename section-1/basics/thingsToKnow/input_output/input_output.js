// TAKING USER INPUT FROM TERMINAL USING PROMPT SYNC

/**
 * Problem statement
Write a program that takes a character as input and prints 1, 0, or -1 according to the following rules.



1, if the character is an uppercase alphabet (A - Z).
0, if the character is a lowercase alphabet (a - z).
-1, if the character is not an alphabet.


Example:
Input: The character is 'a'.

Output: 0

Explanation: The input character is lowercase, so our answer is 0.
 */

const promptSync = require("prompt-sync");
const prompt = promptSync();

const result = prompt("What is you name: ");
console.log(`Hey ${result}`);