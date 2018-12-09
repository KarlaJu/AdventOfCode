//use std::env;
use std::fs::File;
use std::io::prelude::*;

fn main() {
    //Leer archivos
    let mut f = File::open("texto.txt").expect("file not found");

    let mut contents = String::new();
    f.read_to_string(&mut contents)
        .expect("something went wrong reading the file");

    println!("With text:\n{}", contents);
    //3x4x5\n4x5x6

    //Lista para guardar los elementos del archivo
    let l:[i32; 3];
    l=[0,1,2];
    
    for i in 0..3 {
    	println!("{}",l[i]);
    }
}