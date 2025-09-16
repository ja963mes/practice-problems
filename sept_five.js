const prevMultOfThree = n => {
  while (n > 0){
    if(n % 3 == 0){
      return n;
    }else{
      n = Math.floor(n / 10)
    }
  }
  return null;
}