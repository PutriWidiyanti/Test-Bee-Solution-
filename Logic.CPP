#include <stdio.h>
#include <conio.h>

main(){

//Nomor 1.
int h;
printf("Input : ");scanf("%d",&h);
for (int a=1;a<=h;a++){
	for(int b=1;b<=a;b++){
   	printf("*");
   }
   printf("\n");
}
for(int x=h-1;x>=1;x--){
	for(int y=x;y>=1;y--){
   	printf("*");
   }
   printf("\n");
}


//Nomor 2.
char ab='A';
for(int p=0;p<36;p++){
	if(p>=10 && p<36){
   	printf("000%c\n",ab);
      ab++;
   }else{
   	printf("000%d\n",p);
   }
}

getch();
}