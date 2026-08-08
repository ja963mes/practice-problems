 public class Factorial {
  public int factorial(int n) {
    int product = 1;
    if(n >= 0 && n <= 12){
      for(int i = 1; i <= n; i++){
        product *= i;
      }
    }else{
      throw new IllegalArgumentException("n must be between 0 and 12");
    }
    return product;
  }
}