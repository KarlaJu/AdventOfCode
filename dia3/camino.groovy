String s = new File('caminos.txt').text

/****Variables de pruebas***/
/*def s = "<<^v>^"
def s = "<<"*/
def coo=[x:[0],y:[0]]

int x=0, y=0
def a
List lista = []

lista << "${coo.x[0]} ${coo.y[0]}"
s.each{ q -> 

    switch (q) {
        case "<":
            x=x-1
            coo.x << x
            a=coo.x.size()
            coo.y[a-1]?coo.y[a-1]:(coo.y << coo.y[a-2])
            lista << "${coo.x[a-1]} ${coo.y[a-1]}"
            break
        case ">":
            x=x+1
            coo.x << x
            a=coo.x.size()
            coo.y[a-1]?coo.y[a-1]:(coo.y << coo.y[a-2])
            lista << "${coo.x[a-1]} ${coo.y[a-1]}"
            break
        case "^":
            y=y+1
            coo.y << y
            a=coo.y.size()
            coo.x[a-1]?coo.x[a-1]:(coo.x << coo.x[a-2])
            lista << "${coo.x[a-1]} ${coo.y[a-1]}"
            break
        case "v":
            y=y-1
            coo.y << y
            a=coo.y.size()
            coo.x[a-1]?coo.x[a-1]:(coo.x << coo.x[a-2])
            lista << "${coo.x[a-1]} ${coo.y[a-1]}"
            break
        default:
            result = 'Default'
            break
    }  
}

println lista.unique().size()

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