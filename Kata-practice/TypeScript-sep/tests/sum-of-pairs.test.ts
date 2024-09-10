import {sumPairs} from "../sumofpairs/sumOfPairs.ts";
import {test, expect} from "vitest";
const list1:number[] = [1, 4, 8, 7, 3, 15],
      list2:number[] = [1, -2, 3, 0, -6, 1],
      list3:number[] = [20, -13, 40],
      list4:number[] = [1, 2, 3, 4, 1, 0],
      list5:number[] = [4, -2, 3,  3, 4],
      list6:number[] = [0, 2, 0],
      list7:number[] = [5, 9, 13, -3] ;

test("Basic: list 1 should return [1, 7] for sum = 8", ()=>{
    const expectedOutput:number[] = [1,7];
    const actualOutput:number[] | void = sumPairs(list1, 8);
    expect(expectedOutput).toEqual(actualOutput);
})

test("Negatives: list 2 should return undefined for sum = -7", ()=>{
    const expectedOutput:number[] = [0,-6];
    const actualOutput:number[] | void = sumPairs(list2, -6);
    expect(expectedOutput).toEqual(actualOutput);
})

test("No match: list 3 should return [0, -6] for sum = -6", ()=>{
    const expectedOutput:number[]| void = undefined;
    const actualOutput:number[] | void = sumPairs(list3, -6);
    expect(expectedOutput).toEqual(actualOutput);
})

test("First match from left: list 4 should return [1, 1] for sum = 2", ()=>{
    const expectedOutput:number[]| void = [1,1];
    const actualOutput:number[] | void = sumPairs(list4, 2);
    expect(expectedOutput).toEqual(actualOutput);
})
test("Duplicates: list 5 should return [4, 4] for sum = 8", ()=>{
    const expectedOutput:number[]| void = [4,4];
    const actualOutput:number[] | void = sumPairs(list5, 8);
    expect(expectedOutput).toEqual(actualOutput);
})
test("Zeroes: list6 should return [0, 0] for sum = 0", ()=>{
    const expectedOutput:number[]| void = [0,0];
    const actualOutput:number[] | void = sumPairs(list6, 0);
    expect(expectedOutput).toEqual(actualOutput);
})
test("Zeroes: list6 should return [0, 0] for sum = 0", ()=>{
    const expectedOutput:number[]| void = [0,0];
    const actualOutput:number[] | void = sumPairs(list6, 0);
    expect(expectedOutput).toEqual(actualOutput);
})
test("Subtraction: list7 should return [13, -3] for sum = 10", ()=>{
    const expectedOutput:number[]| void = [13,-3];
    const actualOutput:number[] | void = sumPairs(list7, 10);
    expect(expectedOutput).toEqual(actualOutput);
})



