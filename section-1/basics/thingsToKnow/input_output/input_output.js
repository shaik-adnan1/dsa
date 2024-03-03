// TAKING USER INPUT FROM TERMINAL USING PROMPT SYNC

const promptSync = require("prompt-sync");
const prompt = promptSync();

const result = prompt("What is you name: ");
console.log(`Hey ${result}`);