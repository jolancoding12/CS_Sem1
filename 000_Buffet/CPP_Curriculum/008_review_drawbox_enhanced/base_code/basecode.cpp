// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
char ans = 'a';
int ans2 = 0;
int ans3 = 0;
int x = 0;
int y = 0;
int ans4 = 0;
int ans5 = 0;
cout<<"endter symbol"<<endl;
cin>>ans;
cout<<"thiccness"<<endl;
cin>>ans2;
cout<<"tall"<<endl;
cin>>ans3;
cout<<"domain"<<endl;
cin>>ans4;
cout<<"range"<<endl;
cin>>ans5;
for(x = 0; x!=ans2;x=x+1){
	cout<<endl;
gotoxy(ans4,ans5+12);
for(y = 0; y != ans3; y = y + 1 ){
	cout<<ans;
	}
}

}
