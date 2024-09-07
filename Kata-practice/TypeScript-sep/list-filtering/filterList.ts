export function filter_list(l:Array<any>):Array<number> {
    // Return a new array with the strings filtered out
    let result: Array<number> = new Array<number>();
    result =  l.filter((item) =>  typeof item === "number");
    return result;
}

console.log(filter_list([1,2,'aasf','1','123',123]));