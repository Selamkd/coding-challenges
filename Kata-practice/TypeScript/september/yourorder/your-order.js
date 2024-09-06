import { logger } from "../../utils/logger";
export function order(words) {
    let result = "";
    let highest = 0;
    for (let i = 0; i < words.length; i++) {
        const word = words[i];
        if (isNum(word[i])) {
            const num = parseInt(word[i]);
            if (num > highest) {
                highest = num;
            }
        }
        result += word[i];
    }
    return result;
}
logger.info(order("this1 i3 a te4st"));
function isNum(char) {
    const numPattern = /^[+-]?(\d+(\.\d*)?|\.\d+)$/;
    return numPattern.test(char);
}
