function domainName(url:string):string{
    //your code here
    // All names come before a dot
    // some of them are prifexed by d

    return url.substring(url.indexOf("/") + 2, url.indexOf("."));
}

console.log(domainName("http://google.com"));