function gimme (triplet) {
  const min = Math.min(...triplet);
  const max = Math.max(...triplet);
  
  for(let i=0; i < 3; i++){
    if(triplet[i] > min && triplet[i] < max){
      return i;
    }
  }
}