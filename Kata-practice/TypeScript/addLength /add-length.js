export function addLength(str) {
    // your code here
    let result = [];
    let word = str.split(' ');
    for (let i = 0; i < word.length; i++) {
        result.push(word[i] + " " + word[i].length);
    }
    return result;
}
