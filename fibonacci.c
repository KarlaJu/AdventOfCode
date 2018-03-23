#include <stdio.h>


int main ()
{
	int x, y, z, cont;
	x=0;
	y=1;
 
	for (int i=1; i<=32; i++)
	{
    	z=x+y;
    	printf("%d\n",z);
    	cont=cont+z;
    	x=y;
    	y=z;
	} 	  
	printf("La suma total es de: %d\n", cont);
	return 0;
}

