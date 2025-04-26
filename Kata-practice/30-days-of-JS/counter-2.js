var createCounter = function (init) {
  // given init integer
  // should return {} with three functions
  // 1. increment - increases current value by 1 and returns it
  // 2. decrement - reduces current value by 1 and returns it
  // 3. reset - sets the current value to init and returns it

  return {
    increment: function () {
      let incremented = init + 1;

      return incremented;
    },
    decrement: function () {
      let decremented = init - 1;
      return decremented;
    },
    reset: function () {
      return init;
    },
  };
};

const counter = createCounter(5);
console.log(counter.increment());
console.log(counter.reset());
console.log(counter.decrement());
