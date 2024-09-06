export function order(words: string): string {
  const wordsArr: string[] = [];
  const result = wordsArr.sort((a, b) => getNum(a) - getNum(b)).join(" ");

  return result;
}

function getNum(word: string): number {
  const num = word.match(/\d+/);
  return num ? parseInt(num[0], 10) : 0;
}
console.log(order("this1 i3 a te4st"));
