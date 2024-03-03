const fibonacci = function (n) {
  // take the n value and if n = 1, then array = [0], elseIF n = 2, the array === [0, 1]

  // n > 2. n = 5
  //

  arr = [];
  if (n === 0 || n === 1) {
    return alert("minimum 'n' value is 2");
  } else if (n === 2) {
    arr = [0, 1];
  } else {
    arr = [0, 1];
    for (let i = 0; i <= n; i++) {
      nxtEle = arr[i] + arr[i + 1];
      arr.push(nxtEle);
    }
  }

  return arr;
};
console.log(fibonacci(50));
