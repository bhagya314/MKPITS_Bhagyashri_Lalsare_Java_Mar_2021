//wap to print the pattern as given below
//1 1 1
//2 2 2
//3 3 3
//using nested for loop.

#include<stdio.h>
int main()
{
	int rowcount,columncount;
	for(rowcount=1;rowcount<=3;rowcount++)
{
//inside loop for column
 for(columncount=1; columncount<=3;columncount++)
{
 	printf("%d\t",rowcount);
}
 	printf("\n");
}

 return 0;
}
