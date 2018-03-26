String levels = new File('/Users/makingdevs/Desktop/Programas/Santa floor.txt').text
//String levels ="()())"

int cont=0
int nivel=0

//Forma 1 de resolverlo

for(int i=0; i<levels.size();i++)
{

    if(levels[i]=="(")
        cont++
    else{
        cont--
        if(cont==-1)
        return i+1}

}

//Forma más sencilla
/*levels.each{ floor ->
    if(floor=="(")
        cont++
    else
        cont--
}*/

println cont
println nivel