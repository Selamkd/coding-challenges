var createHelloWorld = function () {
  return function (...args) {
    // clear all arguments
    args.length = 0;

    // add hello world str
    args.push('Hello');
    args.push('World');

    // convert and return back as a string
    return args.join(' ');
  };
};
