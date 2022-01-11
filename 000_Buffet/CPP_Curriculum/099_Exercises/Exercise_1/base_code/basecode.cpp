// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
int beezus = 5;
int jollibee = 15;
while(true)
{
	cout<<beezus<<endl;
	if(beezus==25)
	{
		break;
	}
	beezus = beezus + 1;
}




while(true)
{
	cout<<jollibee<<endl;
	if(jollibee==5)
	{
		break;
	}
	jollibee = jollibee - 1;
}

for(int f = 15; f >= 5; f = f - 1)
{
	cout<< f << endl;
}
for(int a = 123; a <= 200; a= a + 2)
{
	cout<< a << endl;
}	

}
