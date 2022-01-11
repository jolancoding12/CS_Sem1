// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	char ans = 'a';
	int ans3 = 0;
	int ans4 = 0;
	int ans5 = 0;
	cout<<"giv me symbol for me to make line"<<endl;
	cin>>ans;
	cout<<"how many time"<<endl;
	cin>>ans3;
	cout<<"x coordinate"<<endl;
	cin>>ans4;
	cout<<"y coordinate"<<endl;
	cin>>ans5;
	gotoxy(4,ans5+12);
	for(int x = 0;x < ans3; x = x + 1){
	cout<<ans;}
}
