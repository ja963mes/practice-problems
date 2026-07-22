public class Kata{
  public static int sumDigits(int number){
    number = Math.abs(number);
    int sum = 0;
    int dummy = 0;
    while(number != 0){
      dummy = number % 10;
      sum  += dummy;
      number = number/10;
    }
    return sum;
  }
}