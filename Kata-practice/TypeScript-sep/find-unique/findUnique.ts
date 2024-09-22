import {getOrDefault} from "../utils/helpers.ts"

function findUnique(arr: any[]) {
    const uniqueMap: Map<number, number> = new Map();
    let result;
    for (const num of arr) {
        uniqueMap.set(num, getOrDefault(uniqueMap, num, 0) + 1)
    }
    for (let [key, value] of uniqueMap) {
        if (value == 1) {
            result = key;
        }
    }
    return result;
}

