const arr = ["a", "b", "c", "d", "e"];

arr.push("e"); // O(1)
arr.pop(); // O(1)

// Unshift
arr.unshift("x"); // O(n)

// Splice
const arr2 = arr.splice(2, 0, "alien"); // O(n/2)
console.log(arr);
