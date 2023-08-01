public class Main {
    public static int sumDigits(int number){

        if(number < 0){
            return -1;
        }
        int result = 0;
        while(number>0){
            int rem = number % 10;
            number /= 10;
            result = result + rem;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of the digits in the number 12456 is " + sumDigits(12456));
        System.out.println("The sum of the digits in the number -1256 is " + sumDigits(-1256));
        System.out.println("The sum of the digits in the number 6579 is " + sumDigits(6579));
        System.out.println("The sum of the digits in the number 1000 is " + sumDigits(1000));
    }
}