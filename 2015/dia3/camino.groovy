String s = new File('caminos.txt').text

/****Variables de pruebas***/
//def s = "<<^v>^"
//def s = "<<"*/
def coo=[x:[0],y:[0]]
def coor=[x:[0],y:[0]]

int x=0, y=0, x1=0, y1=0
def a, cont=0
def listas
List lista = []
List listaR = []

lista << "${coo.x[0]} ${coo.y[0]}"
listaR << "${coor.x[0]} ${coor.y[0]}"
s.each{ q -> 
    cont++ 
    switch (q) {
        case "<":
        if(cont%2==0)
        {
            x1=x1-1
            coor.x << x1
            a=coor.x.size()
            coor.y[a-1]?coor.y[a-1]:(coor.y << coor.y[a-2])
            listaR << "${coor.x[a-1]} ${coor.y[a-1]}"
            break
        }
        else
        {
            x=x-1
            coo.x << x
            a=coo.x.size()
            coo.y[a-1]?coo.y[a-1]:(coo.y << coo.y[a-2])
            lista << "${coo.x[a-1]} ${coo.y[a-1]}"
            break
        }
        case ">":
        if(cont%2==0)
        {
            x1=x1+1
            coor.x << x1
            a=coor.x.size()
            coor.y[a-1]?coor.y[a-1]:(coor.y << coor.y[a-2])
            listaR << "${coor.x[a-1]} ${coor.y[a-1]}"
            break
        }
        else
        {
            x=x+1
            coo.x << x
            a=coo.x.size()
            coo.y[a-1]?coo.y[a-1]:(coo.y << coo.y[a-2])
            lista << "${coo.x[a-1]} ${coo.y[a-1]}"
            break
        }
        case "^":
        if(cont%2==0)
        {
            y1=y1+1
            coor.y << y1
            a=coor.y.size()
            coor.x[a-1]?coor.x[a-1]:(coor.x << coor.x[a-2])
            listaR << "${coor.x[a-1]} ${coor.y[a-1]}"
            break
        }
        else
        {
            y=y+1
            coo.y << y
            a=coo.y.size()
            coo.x[a-1]?coo.x[a-1]:(coo.x << coo.x[a-2])
            lista << "${coo.x[a-1]} ${coo.y[a-1]}"
            break
        }
        case "v":
        if(cont%2==0)
        {
            y1=y1-1
            coor.y << y1
            a=coor.y.size()
            coor.x[a-1]?coor.x[a-1]:(coor.x << coor.x[a-2])
            listaR << "${coor.x[a-1]} ${coor.y[a-1]}"
            break
        }
        else
        {
            y=y-1
            coo.y << y
            a=coo.y.size()
            coo.x[a-1]?coo.x[a-1]:(coo.x << coo.x[a-2])
            lista << "${coo.x[a-1]} ${coo.y[a-1]}"
            break
        }
        default:
            result = 'Default'
            break
    }
     
}
listas=lista+listaR
println listas.unique().size()

/******Algunas pruebas con mapas******/

/*mapa = [x:[0,1,1,1],y:[0,0,1,0]]
println lista.unique()
l.each{a=it[0]
       b=it[1]
       c=it[2]
       lista= [a,b,c]   */


/*mapa = [x:[01,10,20,30,40,50], y:[01,10,20,30,40,50]]
def variable
//mapa.x << 6
variable = mapa.x.size()
println variable

println mapa.y[variable]?mapa.y[variable]:(mapa.y << mapa.y[variable-1])*/