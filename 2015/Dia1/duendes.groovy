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
      /*
      *****Primera parte *****
       p1=2*(a*b)
       p2=2*(b*c)
       p3=2*(a*c)*/
       if(lista.max()==a)
       sum=(b+b+c+c)+(a*b*c)
       if(lista.max()==b)
       sum=(a+a+c+c)+(a*b*c)
       if(lista.max()==c)
       sum=(a+a+b+b)+(a*b*c)
       cont=cont+ sum
      }
println cont
 