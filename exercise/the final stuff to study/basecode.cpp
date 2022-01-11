// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	Buffet - C++
Variables
Integers
	-int x = 0;
Characters
-char x = ‘a’;
String
	-it can be the char’s input
Input
-stuff going in, <<
Output
-stuff going out, >>
Branches
If
	-if(x == y) {}
else if
	-else if(x == z) {}
	-can separate an if statement into parts
	-ex: if{} else{} if else{} (part 2) else{}
Else
	-else {}
Gotoxy
Static numbers
	-gotoxy(1,2);
Counters
	-gotoxy(i,i)
How outputting characters/numbers works
	-you gotoxy first then cout
Loops
While loops
Forever Loops
		-while(true)
Break
		-while(true){ if(condition){break;}}
Counter Loops
		-while(true){ counter = counter + 1 if(counter = condition){break} }
For loops
All 3 parts!
		-call variable, make condition(x <, >, <=, >=, != to # or other variable), make counter(a++)
How loops work with gotoxy
-after you loop and stuff the endl; is changed and stuff


Nested Loops
What’s the difference between 1 and 2 loops?
	-one does one thing over and over, two makes the thing go over and over like more
	-ex; one does a line, the other does the line multiple times, making a box or smn
What does the inner loop represent? Outer?
	-inner loop represents the horizontal line, outer makes a box
With gotoxy
	-to print out multiple times in the same area
Random
-cout<<random(x);
-ex; 5, all numbers 0-5
Getch
-not require hitting enter, does not see the character entered
-ex: cout<<”hello what name”<<endl;
-char appleseed = getch(); (appleseed contains the character)
Kbhit
-returns zero if no character hits, will give non-zero value
-ex; while(kbhit()==0){ cout<<”happy birthday”<<endl;}






}
