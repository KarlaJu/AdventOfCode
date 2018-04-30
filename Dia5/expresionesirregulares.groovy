def nice = 0
def txt = new File("cadenas.txt").eachLine{ linea ->
    Integer vocales = 0
    Integer errores = 0
    Integer doble = 0
    linea.size().times{
        if(linea[it] == 'a'|| linea[it] == 'e'|| linea[it] == 'i'|| linea[it] == 'o'|| linea[it] == 'u'){
            vocales ++
        }
        /*if( it != linea.size()-1 ){
            if( linea[it] == linea[it+1]){
                doble++
            }
    //ver que el par no sea ab cd pq xy
              if( (linea[it]+linea[it+1]) == 'ab'|| (linea[it]+linea[it+1]) == 'cd'||(linea[it]+linea[it+1]) == 'pq'||(linea[it]+linea[it+1]) == 'xy'){
                errores++
            }
        }
    }*/    
    // aa, bb, cc, or dd
    def w
        if(linea.findAll(~/([a-z])\1/)){
             w=linea.findAll(~/([a-z])\1/)
             if(w.contains("aa")||w.contains("bb")||w.contains("cc")||w.contains("dd")){
             doble++
             }
        }
        //ver que el par no sea ab, cd, pq, or xy
        if(linea.findAll(~/ab|cd|pq|xy/)){
            errores++
        }
        if (vocales >= 3 && doble >0 && errores == 0){
            nice++
        }    
    }
}

println nice