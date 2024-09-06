export function order(words) {
    const wordsArr = [];
    const result = wordsArr.sort((a, b) => getNum(a) - getNum(b)).join(" ");
    return result;
}
function getNum(word) {
    const num = word.match(/\d+/);
    return num ? parseInt(num[0], 10) : 0;
}
console.log(order("this1 i3 a te4st"));
