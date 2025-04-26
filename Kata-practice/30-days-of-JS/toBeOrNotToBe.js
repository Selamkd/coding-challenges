var expect = function (val) {
  // takes in any value
  // returns an object with two functions

  // to be: accepts another value and returns true if the two values === eachother. If not should throw error "Not equal"

  // not to be: returns true if the two values !== eachother. If not should throw error "equal"

  return {
    toBe: function (value) {
      if (value === val) {
        return true;
      } else {
        throw new Error('Not Equal');
      }
    },
    notToBe: function (value) {
      if (value !== val) {
        return false;
      } else {
        throw new Error('Equal');
      }
    },
  };
};

console.log(expect(5).toBe(5));
