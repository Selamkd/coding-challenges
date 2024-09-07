
 function  disemvowel(str: string): string {
        return str.replace(/[AEIOUaeiou]/g, "");
    }
    console.log(disemvowel("This website is for losers LOL!"));