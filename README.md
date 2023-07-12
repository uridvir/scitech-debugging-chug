# scitech-debugging-chug
A debugging elective for the summer camp I worked at in the summer of 2019

To try out the challenges, clone the repository and open in something like Eclipse. Only edit code in the src/problems folder.
There are 15 problem files, in ascending difficulty, which I wrote to teach campers how to go about the code debugging process.
All problems have a number of test cases, to automate the process of "grading" the students' work.
When I ran this workshop in 2019, I had 3 campers and they finished around 10 of the problems given 5-6 hours over a week.
The last few problems are tricky, even for experienced programmers.

To implement this I used Java's Reflections library extensively. The debugging problems mostly teach things like off-by-one,
stack overflow, etc. The increase in difficulty comes from multi-layered problems which hide increasingly subtle typos and bugs,
and problems with more than one "bug" in the code.
