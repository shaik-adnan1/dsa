let name = "Bro code";

// .charAt()
const nameCharAt = name.charAt(0);
console.log(nameCharAt);

// .indexOf() => returns the first occurence of an element
const nameInd = name.indexOf("o")
console.log(nameInd);

// .length
const nameLen = name.length;
console.log(nameLen);

// .trim()
const nameT = name.trim();
console.log(nameT);

// .toUpperCase()
const nameUpperC = name.toUpperCase()
console.log(nameUpperC);

// .toLowerCase()
const nameLowerC = name.toLowerCase()
console.log(nameLowerC);

// .repeat()
const nameR = name.repeat(5);
console.log(nameR);

// StartsWith
const nameSW = name.startsWith("B")
console.log(nameSW);

// .endsWith()
const nameEW = name.endsWith("B")
console.log(nameEW);

// .includes()
const nameIncludes = name.includes("B");
console.log(nameIncludes);

// .replaceAll()
const phoneN = "123-456-7890";
console.log(phoneN.replaceAll("-", ""));
const nameRA = name.replaceAll("o", "a");
console.log(nameRA);

// padStart()
const nameP = name.padStart(15, "-");
console.log(nameP);

// padEnd()
const nameE = name.padEnd(15, "-");
console.log(nameE);