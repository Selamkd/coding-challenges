export function getOrDefault<K, V>(map: Map<K, V>, key: K, defaultValue: V): V {
    return map.has(key) ? map.get(key)! : defaultValue;
}