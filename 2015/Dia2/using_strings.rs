
fn main(){
  let s = "1x2x3\n";
  let v: Vec<&str> = s.split("x").collect();
  let numbers: Vec<i16> = v.into_iter().map(|x| x.parse::<i16>().unwrap()).collect();
  
  //println!("{:?}",v);
  println!("{:?}",numbers);
}

