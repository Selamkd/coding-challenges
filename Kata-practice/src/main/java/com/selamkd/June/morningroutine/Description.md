### Morning Routine                                                                           
[MorningRoutine](https://www.codurance.com/katas/morning-routine-kata)

#### 21 Jun 2024
As a forgetful person, I need to remember my morning routine. Because of this, I have created a program that, depending on the time of day, will tell me what I should be doing:

From 06:00 to 06:59 - Do exercise
From 07:00 to 07:59 - Read and study
From 08:00 to 08:59 - Have breakfast

Scenario 1: Display "Do exercise" between 06:00 and 06:59

Given the current time is between 06:00 and 06:59
When I request the routine activity
Then the system should display "Do exercise"

Scenario 2: Display "Read and study" between 07:00 and 07:59

Given the current time is between 07:00 and 07:59
When I request the routine activity
Then the system should display "Read and study"

Scenario 3: Display "Have breakfast" between 08:00 and 08:59

Given the current time is before 05:59 or after 09:00
When I request the routine activity
Then the system should display "No activity"

From 06:00 to 06:59 - Do exercise

From 07:00 to 07:29 - Read

From 07:30 to 07:59 - Study

From 08:00 to 08:59 - Have breakfast

From 06:00 to 06:44 - Do exercise

From 06:45 to 06:59 - Take a shower

From 07:00 to 07:29 - Read

From 07:30 to 07:59 - Study

From 08:00 to 09:00 - Have breakfast


~~