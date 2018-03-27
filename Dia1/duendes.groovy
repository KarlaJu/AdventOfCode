String s = new File('regalos.txt').text
 
//def s = """2x3x4
//1x1x10"""

def l = []
int a, b, c, sum, cont
int p1=0, p2=0, p3=0

s.eachLine{i->
     l << i.split('x').collect{it as Integer}
}
l.each{a=it[0]
       b=it[1]
       c=it[2]
       lista= [a,b,c]       
       p1=2*(a*b)
       p2=2*(b*c)
       p3=2*(a*c)
       if(lista.max()==a)
       sum= p1+ p2+ p3 +(b*c)
       if(lista.max()==b)
       sum= p1+ p2+ p3 +(a*c)
       if(lista.max()==c)
       sum= p1+ p2+ p3 +(a*b)
       cont=cont+ sum
      }
println cont
 