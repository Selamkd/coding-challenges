import {expect, test} from "vitest";
import {mostLikely} from "../most-likely/mostLikely.js";

test("given 1:3 and 1:2 should return false'", () => {
    const expected= false;
    const actual = mostLikely("1:3" , "1:2");
    expect(actual).toEqual(expected);
})
test("given 1:2 and 1:3 should return false'", () => {
    const expected= true;
    const actual = mostLikely("1:2" , "1:3");
    expect(actual).toEqual(expected);
})
test("given 0 and 1:2 should return false'", () => {
    const expected= false;
    const actual = mostLikely("0" , "1:2");
    expect(actual).toEqual(expected);
})



