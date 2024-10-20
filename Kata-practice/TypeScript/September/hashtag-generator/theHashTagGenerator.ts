export function generateHashtag (str:string){
 str = str.trim();
  if(!str || str.trim().length >= 140) {
      return false;
  }
  const resultStr = str.split(" ").map((word,index)=>{
      return  index === 0 ? word: word.charAt(0).toUpperCase() + word.slice(1).toLowerCase();
  }).join("");

  return "#"+resultStr;

}

console.log(generateHashtag("Codewars"));

