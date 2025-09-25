function maxedOut(arr) {
    let MAX_INT = 9007199254740991;
    let sum = 0;
    for(let i=0; i < arr.length; i++){
      sum = sum + (arr[i] * arr[i] * arr[i]);
    }
  
    if(sum < MAX_INT){
      return sum
    }else{
          return "You've pushed me to the max!";
    }
}