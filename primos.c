#include <stdio.h>


int main ()
{
	long numero=600851475143;
	int fact[100];
	int indice=0;
 
	int i=2; 
	while(i<=numero)
		{
			if(numero%i==0)
			{
				fact[indice]=i;
				numero=numero/i;
				indice++;
				continue;
			}
			i++;
		}
	for (int j = 0; j < indice; j++)
	{
		printf("Los factores del numero son: %d\n", fact[j]);
	}
	return 0;
}

