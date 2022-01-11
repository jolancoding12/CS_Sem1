// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
		char ans = 'a';
int ans2 = 0;
int gh =8;
int ans3 = 0;
int x = 0;
int y = 0;
int domainx = 0;
int rangey = 0;
cout<<"endter symbol"<<endl;
cin>>ans;
cout<<"thiccness"<<endl;
cin>>ans2;
cout<<"tall"<<endl;
cin>>ans3;
cout<<"x coord"<<endl;
cin>>domainx;
cout<<"y coord"<<endl;
cin>>rangey;
int table = 0;
for(x = 0; x != ans3; x++)
{
	cout<<endl;
	gotoxy(domainx,rangey+gh++);
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
