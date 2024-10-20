function toCamelCase(str:string):string{
    const camelCaseStr = str.split('_').map((word, index) => {
        return index === 0 ? word : word.charAt(0).toUpperCase() + word.slice(1);
    }).join('');
   return camelCaseStr;
}
