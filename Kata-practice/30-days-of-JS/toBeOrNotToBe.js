var expect = function (val) {
  return {
    toBe: function (value) {
      if (value !== val) {
        throw new Error('Not Equal');
      }
      return true;
    },
    notToBe: function (value) {
      if (value === val) {
        throw new Error('Equal');
      }
      return false;
    },
  };
};

console.log(expect(5).toBe(5));
