

function count(str: string): {[key:string] : number}{
    let countMap: Map<string, number> = new Map();
    if(!str){
        return {};
    }
    for(let char of str){
        countMap.set(char, getOrDefault(countMap,char, 0 ) + 1)
    }
    return Object.fromEntries(countMap);
}

function getOrDefault<K,V> (map: Map<K, V>, key: K, defaultValue:V): V {
    return map.has(key) ? map.get(key)! : defaultValue;
}