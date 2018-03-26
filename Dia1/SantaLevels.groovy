String levels = new File('/Users/makingdevs/Desktop/Programas/Santa floor.txt').text

int cont=0
/*
Forma 1 de resolverlo

for(int i=0; i<levels.size();i++)
{
    if(levels[i]=="(")
        cont++
    else
        cont--
}*/

//Forma más sencilla
levels.each{ floor ->
    if(floor=="(")
        cont++
    else
        cont--
}

println cont