// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	char flake = 'a';
	
	cout<<"yo giv symblo"<<endl;
	cin>>flake;
	for(int x = 0; x < 5; x++){
		gotoxy(10,7+x);
		cout<<flake<<endl;
		sleep(1);
		gotoxy(10,7+x);
		cout<< " " <<endl;
	}
}