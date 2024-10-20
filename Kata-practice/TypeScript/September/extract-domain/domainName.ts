function domainName(url:string):string{
   /*
   * (/.+\/\/|www.|\..+/g, '') matches:
   * (/.+\/\/)- a protocol prefix like http:// or https://
   *  (www) - part of the url
   * (\..+) - domain extension like .com, .org..etc
   *   url = url.replace("https://", '');
       url = url.replace("http://", '');
       url = url.replace("www.", '');
       return url.split('.')[0];
   *
   *
   * */
    return url.replace(/.+\/\/|www.|\..+/g, '');
}

console.log(domainName("http://google.com"));
console.log(domainName("http://google.co.jp"));
console.log(domainName("www.xakep.ru"), "xakep");
console.log(domainName("http://www.zombie-bites.com"));
console.log(domainName("https://www.cnet.com"));