// DATA TYPES

/**
 *Problem statement
Data type refers to the type of value a variable has and the way the computer interprets it.



Each data type has a different size. You’ve studied 5 different data types and the sizes of the data types:

Integer: 4 bytes
Long: 8 bytes
Float: 4 bytes
Double: 8 bytes
Character: 1 byte


You’re given a data type. Print its size in bytes.



Example :
Input: Long

Output: 8

Explanation: The size of a Long variable is given as 8 bytes.
 */
const checkTypeInJava = type => {
  switch (type) {
    case "Integer":
      return 4;
    case "Long":
      return 8;
    case "Float":
      return 4;
    case "Double":
      return 8;
    case "Character":
      return 1;
    default:
      return -1;
  }
};

// PRIMITIVE DATA TYPES
// String
let Name = "Shaik";
// NUMBER
let age = 19;
// BOOLEAN
let isMarried = false;
// UNDEFINED =>  Represents a variable that has been declared but not assigned a value.
// Null: Represents the intentional absence of any object value.
// Symbol: Represents a unique identifier.

// COMPOSITE DATA TYPES

// OBJECTS
const aboutMe = {
  Name: "Shaik",
  age: 19,
  isMarried: false,
};

// ARRAYS
const prs = [17, 100, 110, 10];

// MAPS
/**
 * Map: Map is a built-in JavaScript data structure that allows storing key-value pairs. Unlike objects, keys in a Map can be of any data type, and the order of entries is maintained.
 */

const map = new Map();
map.set("name", "Shaik");
map.set("name", "Shaik"); // No duplicates found
console.log(map);

// SET
/**
 * Set: Set is a collection of unique values. It can store any type of value (primitive values or object references) and automatically removes duplicates.
 */

const set = new Set();
set.add(1);
set.add(1);
set.add(2);
set.add(3);
console.log(set);
