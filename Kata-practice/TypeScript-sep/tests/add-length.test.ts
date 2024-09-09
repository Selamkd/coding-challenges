import { expect, test } from 'vitest'
import {addLength} from "../addLength /add-length.ts";

test("given 'you will win' should return 'you 3' , 'will 4', 'win 3' ", () => {
    const expected: string[] = ["you 3", "will 4", "win 3"];
const actual = addLength("you will win");
expect(actual).toEqual(expected);
})

test("given 'apple ban' should return a str array of word + length", ()=>{
    const expected: string[] = ["apple 5", "ban 3"];
    const actual = addLength("apple ban");
    expect(actual).toEqual(expected);
})