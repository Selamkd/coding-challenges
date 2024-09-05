export function order(words: string): string {
    let result = "";
    let highest = 0;
    for (let i = 0; i < words.length; i++) {
        const word = words[i];
        for (let j = 0; j < word.length; j++) {
            if (isNum(word[j])) {
                const num = Number.parseInt(word[j]);
                if (num > highest) {
                    highest = num;
                }
            }
            result += word[i];
        }
    }
    return result;
}

function isNum(char: string): boolean {
    const numPattern = /^[+-]?(\d+(\.\d*)?|\.\d+)$/;
    return numPattern.test(char);
}