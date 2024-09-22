function domainName(url:string):string{
   /*
   * (/.+\/\/|www.|\..+/g, '') matches:
   * (/.+\/\/)- a protocol prefix like http:// or https://
   *  (www) - part of the url
   * (\..+) - domain extension like .com, .org..etc
   * */
    return url.replace(/.+\/\/|www.|\..+/g, '');
}

console.log(domainName("http://google.com"));
console.log(domainName("http://google.co.jp"));
console.log(domainName("www.xakep.ru"), "xakep");
console.log(domainName("http://www.zombie-bites.com"));
console.log(domainName("https://www.cnet.com"));