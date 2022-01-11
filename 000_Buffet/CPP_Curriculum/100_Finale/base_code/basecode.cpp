// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int trunkheight = 0;
	int trunkwidth = 0; 
	int table = 0;
	int x = 0;
	int y = 0;
	int z = 0;
	int counter = 1;
	cout<<"hey we're making a present bro how long you want it"<<endl;
	cin>>trunkheight;
	cout<<"and how big you want it"<<endl;
	cin>>trunkwidth;

for(y = 0; y < trunkheight; y ++)
{
	for(x = 0; x < trunkwidth; x ++){
		gotoxy(x+2,y+8);
		cout<<"0";
	}
}
for(y = 0; y < trunkheight-2; y ++)
{
	for(x = 0; x < trunkwidth-2; x ++){
		gotoxy(x+3,y+9);
		cout<<"%";
	}
}

gotoxy(trunkwidth + 10,6);
cout<<"     /\\	CHRISTMAS	"<<endl;
gotoxy(trunkwidth + 10,7);
cout<<"    /  \\	TREE	"<<endl;
gotoxy(trunkwidth + 10,8);
cout<<"   / o  \\	BABYY	"<<endl;
gotoxy(trunkwidth + 10,9);
cout<<"  /    o \\			"<<endl;
gotoxy(trunkwidth + 10,10);
cout<<"  \\ o   /			"<<endl;
gotoxy(trunkwidth + 10,11);
cout<<"    -----					   \\______/	"<<endl;
gotoxy(trunkwidth + 10,12);
cout<<"     | |		reindeer	   	   | 0 0 |       "<<endl;
gotoxy(trunkwidth + 10,13); 
cout<<"     | |					/'''''''\\    "<<endl;
gotoxy(trunkwidth + 10,14);
cout<<"     | |					|\\    ||   "<<endl;


	
}

	