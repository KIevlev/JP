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
                num /= 10;
            }
            int prov = 1;
            for (int i = 2; i <= sum/i; i++){
                if (sum % i == 0){
                    prov = 0;
                    break;
                }
            }
            count = (prov == 1) ? count + 1 : count;
        }
        in.close();
        System.out.printf("Count of coffee-request - %d\n", count);
    }
}