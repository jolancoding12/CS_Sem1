// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
for(int y = 0; y < 3; y++){
	for(int x = 0; x < 5; x++){
		gotoxy(x+10,y+6);
		cout<<"*";
	}
	cout<<endl;
}
	
	}

