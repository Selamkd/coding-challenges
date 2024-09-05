export function addLength(str: string): string[]{
    // your code here
    let result: string[]  = [];
    let word = str.split(' ');
  for (let i = 0; i < word.length; i++) {
     result.push(word[i] + " " + word[i].length);
}

console.log(result)
    return result;
}