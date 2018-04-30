#include <stdio.h>


int main ()
{
	int con=0;
	printf("\nEste es un programa qeu saca los numeros naturales multiplos de 3 o 5 menores a 1000\n");

		for (int i = 0; i < 1000; i++)
		{
			if(i%3==0 || i%5==0)
				{
					
					con=con+i;
				}
		}
	printf("La suma de los numeros naturales es: %d\n", con);
	return 0;

}