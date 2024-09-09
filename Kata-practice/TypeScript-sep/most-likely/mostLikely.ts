
export function mostLikely(prob1: string, prob2: string): boolean {
    prob1 = prob1.replace(":", "/");
    prob2 = prob2.replace(":", "/");
    return eval(prob1) > eval(prob2);
}

console.log(mostLikely("1:3", "1:2"));