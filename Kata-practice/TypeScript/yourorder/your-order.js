import logger from "../utils/logger.ts";
export function order(words) {
    const wordsArr = words.split(" ");
    return wordsArr.sort((a, b) => getNum(a) - getNum(b)).join(" ");
}
function getNum(word) {
    const num = word.match(/\d+/);
    return num ? parseInt(num[0], 10) : 0;
}
logger.info(order("m1 m5 m3 m2"));
