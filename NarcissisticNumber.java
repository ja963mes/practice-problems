public static boolean NarcissisticNumber(int number){
    int dummy = number;
    int sum = 0;
   int length = String.valueOf(Math.abs(number)).length();
   while(dummy != 0){
        sum += Math.pow((dummy % 10), length);
        dummy = dummy / 10;
   }

    if(sum == number){
        return True;
    }
    return False;
}