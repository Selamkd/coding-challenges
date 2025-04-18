function toWeirdCase(string){
   let result = "";
   let strArr = string.split(" ");

    for(let i = 0; i < strArr.length; i++){
        let word = strArr[i];
        for(let j = 0; j < word.length; j++){
            if(j % 2 === 0){
                result+=word[j].toUpperCase() + " ";
            }else{
                result+=word[j].toLowerCase() + " ";
            }
        }

        if(i < strArr.length - 1){
            result+=" ";
        }

    }
    return result;
}
toWeirdCase("ThIs Is A TeSt");
