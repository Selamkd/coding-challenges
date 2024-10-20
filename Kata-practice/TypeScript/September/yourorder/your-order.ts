import logger from "../../utils/logger.ts"
export function order(words: string): string {
  const wordsArr: string[] = words.split(" ");
  return wordsArr.sort((a, b) => getNum(a) - getNum(b)).join(" ");
}

export function getNum(word: string): number {
  const num = word.match(/\d+/);
  return num ? parseInt(num[0], 10) : 0;
}
logger.info(order("m1 m5 m3 m2"));