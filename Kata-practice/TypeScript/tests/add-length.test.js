import { expect, test } from 'vitest';
import { addLength } from "../september/addLength /add-length";
test("given 'you will win' should return 'you 3' , 'will 4', 'win 3' ", () => {
    const expected = ["you 3", "will 4", "win 3"];
    const actual = addLength("you will win");
    expect(actual).toEqual(expected);
});
test("given 'apple ban' should return a str array of word + length", () => {
    const expected = ["apple 5", "ban 3"];
    const actual = addLength("apple ban");
    expect(actual).toEqual(expected);
});