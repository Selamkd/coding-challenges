var createCounter = function (n) {
  let called = n;
  return function () {
    return called++;
  };
};
const counter = createCounter(10);

console.log(counter());
console.log(counter());
console.log(counter());
