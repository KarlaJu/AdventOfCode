//use std::env;
use std::fs::File;
use std::io::prelude::*;

fn main() {
    // --snip--
    //println!("In file {}", filename);

    let mut f = File::open("texto.txt").expect("file not found");

    let mut contents = String::new();
    f.read_to_string(&mut contents)
        .expect("something went wrong reading the file");

    println!("With text:\n{}", contents);

    let lista=[1,2,3];
    for i in 0..3 {
    	println!("{}",lista[i]);
    }
}



