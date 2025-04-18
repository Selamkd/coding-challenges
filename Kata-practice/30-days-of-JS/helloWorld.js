var createHelloWorld = function () {
  return function (...args) {
    args.length = 0;
    args.push('Hello');
    args.push('World');

    return args.join(' ');
  };
};
