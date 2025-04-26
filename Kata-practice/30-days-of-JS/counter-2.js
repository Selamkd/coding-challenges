var createCounter = function (init) {
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
