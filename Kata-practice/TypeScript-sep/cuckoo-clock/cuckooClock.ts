export function cuckooClock(inputTime: string, chimes:number):string {
/// chicken chimes at beginning of each hour, quarter-hour, halfhour and three-quarter hour
    // given current time and a num determine when the chicken has chimes num times
    // return: the time when the bird has chimed n times
    // if chicken chimes at initial time - include in count
    //

    for(let i = 0; i < chimes; i++){
        const[hour, minutes] = inputTime.split(':');
        let totalMinutes = parseInt(hour) * 60 + parseInt(minutes) ;
        totalMinutes += 15;

        const updatedHour =  Math.floor(totalMinutes / 60) % 24;
        const updatedMinutes = parseInt(minutes) % 60;

        inputTime =  `${updatedHour.toString().padStart(2,'0')}:${updatedMinutes.toString().padStart(2,'0')}`;
    }
    return inputTime
}
cuckooClock("7:20",10);