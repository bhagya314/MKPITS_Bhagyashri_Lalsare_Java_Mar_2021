//- wap to accept age from the user and display wheter he is eligible to vote or not.

#include<stdio.h>

int main()
{
	
int age;
printf("Enter your age\n");
scanf("%d",&age);
if(age>=18)
{
	printf(" you are eligible to vote\n");
}
else
{
	printf(" you are not eligible for vote\n");
}

}
