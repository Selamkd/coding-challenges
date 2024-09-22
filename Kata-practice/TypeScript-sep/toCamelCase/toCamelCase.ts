function toCamelCase(str:string):string{
    //convert dash into camel casing
    //first word should only be capitilized if the original word was capitalized
    // the next word should  always be capitilized
    const newStr= str.replace(/_/g, '').split(',')
    const result = newStr.map(word=>{
        const capitilizedWord = word.charAt(0).toUpperCase()+ word.slice(1)
        console.log(capitilizedWord)
    })
   return result.join('');
}
