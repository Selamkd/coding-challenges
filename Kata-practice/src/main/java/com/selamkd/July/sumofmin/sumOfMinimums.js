function sumOfMinimums(arr) {
    let sum = 0;

    arr.forEach(row => {
        let min = Math.min(...row);
        sum = sum + min;
    })

    return sum;
}
let i = 1;
function getFileName() {
    return `Testing_create_file - ${i++}`
}
console.log(getFileName())
console.log(getFileName())
console.log(getFileName())
console.log(getFileName())