//use std::env;
/*use std::fs::File;
use std::io::prelude::*;*/
////////use std::mem;
/*fn main() {
    // --snip--
    //println!("In file {}", filename);

    let mut f = File::open("texto.txt").expect("file not found");
	let lista=[1,2,3];
    let mut contents = String::new();
    
    f.read_to_string(&mut contents)
        .expect("something went wrong reading the file");

    println!("With text:\n{}", contents);

    
    for i in 0..3 {
    	println!("{}",lista[i]);
    }
*/
//use std::env;
use std::fs::File;
use std::io::prelude::*;

fn main() {
    //Leer archivos
    let mut f = File::open("text.txt").expect("file not found");

    let mut contents = String::new();
    f.read_to_string(&mut contents)
        .expect("something went wrong reading the file");

    println!("With text:\n{}", contents);

    let g_index = my_string.find("x"); 
}/*
use std::string::String;
fn main() {
    let s = String::from("initial contents");
    println!("{}", s);
}*/




