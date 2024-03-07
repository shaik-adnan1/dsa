const students = [
  { name: "Alice", age: 20, major: "Computer Science" },
  { name: "Bob", age: 21, major: "Mathematics" },
  { name: "Charlie", age: 19, major: "Physics" },
];

// FILTER
// filter returns an array of filtered objects

const filterM = students.filter((item) => {
    return item.age > 20;
})

// FIND
// returns the items itself

const findM = students.find((item) => {
    return item.age > 20;
}) 

console.log(findM)

console.log(filterM)

// MAP
// loops over a function where we have access to current element, index and the whole array
const mapM = students.map((item, i, arr) => {
    console.log(item.name);
})

// forEach
// 
const forEachM = students.forEach((item) => {
  console.log(item.name);
});

// SOME
// returns true or false if an specified condition is true/false
const someM = students.some((item) => {
    return item.major === 'Physics';
})
console.log(someM);

// REDUCE
const reduceM = students.reduce((currentTotal, item) => {
  return item.age + currentTotal;
}, 0);

console.log(reduceM);

// INCLUDES

const arr = [1,2,3,4,5,6,7,8,9,10,11,12,13,14];
const includes2 = arr.includes(2);
console.log(includes2);
console.log(arr.toString());
