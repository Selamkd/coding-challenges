import {test, expect} from 'vitest';
import {cuckooClock} from "../September/cuckoo-clock/cuckooClock.ts"

test("Basic test", () =>{
    const inputTimes =  ["07:22", "12:22", "01:30", "04:01", "03:38"];
    const chimes = [1, 2, 2, 10, 19];
    const expectedOutput = ["07:30", "12:45", "01:45", "05:30", "06:00"];
    for(let i =0 ; i < inputTimes.length ; i++){
        const actualOutput = cuckooClock(inputTimes[i], chimes[i]);
        expect(actualOutput).toEqual(expectedOutput[i]);
    }
});
test("Starting on the hour", () =>{
    const inputTimes =  ["10:00", "10:00", "10:00", "10:00", "10:00"];
    const chimes = [1, 10, 11, 13, 20];
    const expectedOutput = ["10:00", "10:00", "10:15", "10:45", "11:00"];
    for(let i =0 ; i < inputTimes.length ; i++){
        const actualOutput = cuckooClock(inputTimes[i], chimes[i]);
        expect(actualOutput).toEqual(expectedOutput[i]);
    }
});
test("Crossing Twelve", () =>{
    const inputTimes = ["12:30", "12:30", "12:30", "12:30", "09:53"];
    const chimes = [1, 2, 3, 4, 50];
    const expectedOutput = ["12:30", "12:45", "01:00", "01:15", "02:30"];
    for(let i =0 ; i < inputTimes.length ; i++){
        const actualOutput = cuckooClock(inputTimes[i], chimes[i]);
        expect(actualOutput).toEqual(expectedOutput[i]);
    }
});

test("Around the Clock", () => {
    const inputTimes = ["08:17", "08:17", "08:17", "08:17", "08:17"];
    const chimes = [113, 114, 115, 150, 200];
    const expectedOutput = ["08:00", "08:15", "08:30", "11:00", "05:45"];
    for (let i = 0; i < inputTimes.length; i++) {
        const actualOutput = cuckooClock(inputTimes[i], chimes[i]);
        expect(actualOutput).toEqual(expectedOutput[i]);
    }
})