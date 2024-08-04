function sumOfMinimums(arr) {
    let sum = 0;

    arr.forEach(row => {
        let min = Math.min(...row);
        sum = sum + min;
    })

    return sum;
}
