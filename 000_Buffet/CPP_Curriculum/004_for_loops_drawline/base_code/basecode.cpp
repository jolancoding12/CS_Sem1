// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	char ans = 'a';
	char ans2 = 'b';
	int ans3 = 0;
	cout<<"giv me symbol for me to make line"<<endl;
	cin>>ans;
	cout<<"also give me if you wanna make it verticle(v) or horozontal(h)"<<endl;
	cin>>ans2;
	cout<<"how many time"<<endl;
	cin>>ans3;
	if(ans2 == 'v')
	{
	for(int x = 0;x < ans3; x = x + 1)
	{
	cout<<ans<<endl;
	}
	}
	else if(ans2 == 'h')
	{
			for(int x = 0;x < ans3; x = x + 1){
	cout<<ans;}
	}

}
