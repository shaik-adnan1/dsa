// TAKING USER INPUT FROM TERMINAL USING PROMPT SYNC

const ps = require("prompt-sync");
const prompt = ps();

const result = prompt("What is you name: ");
console.log(`Hey ${result}`);