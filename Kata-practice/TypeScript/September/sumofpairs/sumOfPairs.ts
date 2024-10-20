export function sumPairs(ints: number[], s: number): [number, number] | void {
   const possiblePairs: number[][] = getPossiblePairs(ints);
   for(const pair of possiblePairs) {
       const sum = pair[0] + pair[1];
       if(sum === s){
          return [pair[0], pair[1]];
       }
   }
    return undefined;
}


sumPairs([1,2,3,5,5,7,8],8)
function getPossiblePairs(numArr: number[]){
    const result:number[][] = [];
    for(let i= 0; i < numArr.length; i++){
        for(let j = i; j < numArr.length -1; j++){
            result.push([numArr[i], numArr[j + 1]]);
        }
    }
    return result;
}