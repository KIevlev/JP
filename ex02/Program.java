import java.util.Scanner;

class Program{
    public static void main(final String args[]) {
        final Scanner in = new Scanner(System.in);
        int count = 0;
        int num;
        int sum;
        boolean check = true;
        while(check){
            sum = 0;
            num = in.nextInt();
            if (num == 42)
                check = false;
            while (num > 0){
                sum+=num%10;
                num=num>>1;
            }
            if (simple(sum)){
                count++;
            }
        }
        in.close();
        System.out.printf("Count of coffee-request - %d\n", count);
    }
    static boolean simple(final int num){

            for (int i = 2; i <= num/i; i++){
                if (num % i == 0){
                    return false;
                }
            }
            return true;
    }
}