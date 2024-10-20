export function solve(s: string) {
const vowels = "aeiouAEIOU";
let max_count = 0;
let current_count = 0;
    for(let i = 0; i < s.length; i++) {
       if(vowels.includes(s[i])){
           current_count++;
       }else{
           if(current_count > max_count){
               max_count = current_count;
           }
           current_count = 0;
       }

       if(current_count > max_count){
           max_count = current_count;
       }

    }
    return max_count;
}

console.log(solve("codewarriors"))