
import {expect, test} from "vitest";
import {generateHashtag} from "../September/hashtag-generator/theHashTagGenerator.ts"

test("given an empty str - should return false'", () => {
    const expected= false;
    const actual = generateHashtag(" ");
    expect(actual).toEqual(expected);
})
test("given an empty str x 200 - should return false'", () => {
    const expected= false;
    const actual = generateHashtag(" ".repeat(200));
    expect(actual).toEqual(expected);
})
test("given str input - should return #DoWeHaveAHashtag", () => {
    const expected= "#DoWeHaveAHashtag";
    const input = "Do We have A Hashtag"
    const actual = generateHashtag(input);
    expect(actual).toEqual(expected);
})
test("given str input - should return #Codewars", () => {
    const expected= "#Codewars";
    const input = "#Codewars"
    const actual = generateHashtag(input);
    expect(actual).toEqual(expected);
})
test("given str input - should return #CodewarsIsNice", () => {
    const expected= "#Codewars Is Nice";
    const input = "#CodewarsIsNice"
    const actual = generateHashtag(input);
    expect(actual).toEqual(expected);
})
test("given str length < 140 chars- should return false", () => {
    const expected= false;
    const input = "Looooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooong Cat"
    const actual = generateHashtag(input);
    expect(actual).toEqual(expected);
})



