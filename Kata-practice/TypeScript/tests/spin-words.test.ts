import { expect, test } from 'vitest'
import {spinWords} from "../September/spin-words/spinWords.ts";


test("given 'Hey fellow warriors' should return 'Hey wollef sroirraw'", () => {
    const expected= "Hey wollef sroirraw";
    const actual = spinWords("Hey fellow warriors");
    expect(actual).toEqual(expected);
})
test("given 'This is a test' should return 'This is a test'", () => {
    const expected= "This is a test";
    const actual = spinWords("This is a test");
    expect(actual).toEqual(expected);
})
test("given 'This is another test' should return 'This is rehtona test'", () => {
    const expected= "This is rehtona test";
    const actual = spinWords("This is another test");
    expect(actual).toEqual(expected);
})




