// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	 int num1 = 0;
	 int num2 = 0;
	 char add = '+';
	 char minus = '-';
	 char times = '*';
	 char divide = '/';
	 char op;
	 cout<< "give me a nlumber" << endl;
	 cin>>num1;
	 cout<< "mor" << endl;
	 cin>>num2;
	 cout<< "wot operation" << endl;
	 cin>>op;
	 if(op == add)
	 {
	 	cout<< num1 + num2 << endl;
	 }
	 else if(op == minus)
	 {
	 	cout<< num1 - num2 << endl;
	 }
	 else if(op == times)
	 {
	 	cout<< num1 * num2 << endl;
	 }
	 else if(op == divide)
	 {
		cout << num1 / num2 << endl;
	 }
}