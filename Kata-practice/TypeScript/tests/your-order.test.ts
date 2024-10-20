import { expect, test } from 'vitest'
import {order} from "../September/yourorder/your-order.ts";


test("given 'my2 find1 horse3' should return 'find1 my2 horse3'", () => {
    const expected= "find1 my2 horse3";
    const actual = order("my2 find1 horse3");
    expect(actual).toEqual(expected);
})

test("given 'is2 Thi1s T4est 3a' should return 'Thi1s is2 3a T4est'", () => {
    const expected= "Thi1s is2 3a T4est";
    const actual = order("is2 Thi1s T4est 3a");
    expect(actual).toEqual(expected);
})

test("given '4of Fo1r pe6ople g3ood th5e the2' should return 'Fo1r the2 g3ood 4of th5e pe6ople'", ()=>{
    const expected = "Fo1r the2 g3ood 4of th5e pe6ople";
    const actual = order("4of Fo1r pe6ople g3ood th5e the2");
    expect(actual).toEqual(expected);
})