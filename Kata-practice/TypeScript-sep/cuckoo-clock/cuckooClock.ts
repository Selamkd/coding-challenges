export function cuckooClock(inputTime: string, chimes:number):string {
    for(let i = 0; i < chimes; i++){
        const[hour, minutes] = inputTime.split(':');
        let totalMinutes = parseInt(hour) * 60 ;
        totalMinutes = totalMinutes += 15;

        const updatedHour =  Math.floor(totalMinutes / 60) % 24;
        const updatedMinutes = parseInt(minutes) % 60;

        inputTime =  `${updatedHour.toString().padStart(2,'0')}:${updatedMinutes.toString().padStart(2,'0')}`;
    }
    return inputTime
}
console.log(cuckooClock("7:22",10));