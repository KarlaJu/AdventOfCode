/*
operacion= """2x4x3
              1x2x3"""

for(int i=0;i<2;i++)
{
    lista=operacion.split('x')
    lista.each { println it}
    lista.collect{lista}
// }*/
 
def s = """2-3-4
1-1-10"""

def l = []
int a, b, c, sum
int p1=0, p2=0, p3=0

s.eachLine{i->
     l << i.split('-')
     //println i.split('-')
     //println i
     //i.collect{s}
    /* println l[0][0]
     for(int q=0;q<2;q++){
     a=l[0][0]
     b=l[0][1]
     c=l[0][2]
     d=2*(a*b)
     println d
     }*/
     //l.each{it.each{println it}}
    
}
l.each{a=it[0].toInteger()
       b=it[1].toInteger()
       c=it[2].toInteger()       
       p1=2*(a*b)
       println p1
       p2=2*(b*c)
       println p2
       p3=2*(a*c)
       println p3
       sum= p1+ p2+ p3 +(a*b)
       println sum
       println "******"
      }
 
