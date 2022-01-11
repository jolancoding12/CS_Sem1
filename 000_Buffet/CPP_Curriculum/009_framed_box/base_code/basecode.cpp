// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	char ans = 'a';
int ans2 = 0;
int ans3 = 0;
int x = 0;
int y = 0;
cout<<"endter symbol"<<endl;
cin>>ans;
cout<<"thiccness"<<endl;
cin>>ans2;
cout<<"tall"<<endl;
cin>>ans3;

int table = 0;
for(x = 0; x != ans3; x++)
{
	cout<<endl;
	if(table<1||table>ans3-2)
	{
		for(y=0; y != ans2;y = y + 1)
		{
			cout<<ans;
		}
	}
	else
	{
		cout<<ans;
		for(y=0;y!=ans2-2;y = y+1)
		{
			cout<<" ";
		}
		cout<<ans;
	}
	table++;
}
	
}
