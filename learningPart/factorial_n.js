const factorialOfN = function (n) {
  let factorial = 1;
  for (let i = 2; i <= n; i++) {
    factorial *= i;
  }
  return factorial;
};

console.log(factorialOfN(0));
