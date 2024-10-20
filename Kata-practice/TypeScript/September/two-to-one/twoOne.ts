function longest (s1: string, s2: string):string{
    const s1Set = new Set<string>(s1 + s2);


    return Array.from(s1Set).sort().join("");
}

console.log(longest("aretheyhere", "yestheyarehere"));