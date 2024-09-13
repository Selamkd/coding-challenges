import logger from "../utils/logger.ts"

export function spinWords(words: string): string {
    const wordArray = words.split(" ");
    let result = "";
    for (let word of wordArray) {
        logger.info("Entering loop ...." + word);
        if (word.length >= 5) {
            logger.info("greater than 5 chars ->" + word);
            let reversedWord = word.split('').reverse().join('')
            result += reversedWord + " ";
            logger.info("Reversed word -> " + reversedWord);
        } else {
            logger.info("less than 5 chars  ->" + word);
            result += word + " ";
        }
    }
    return result.trim();
}

spinWords("This is another test");