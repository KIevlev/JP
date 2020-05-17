import java.util.Scanner;

class Program{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0;
        boolean check = true;
        if (num < 2){
            System.out.println("Illegal Argument");
        }
        else{
            for (int i = 2; i <= num/i; i++){
                count++;
                if (num % i == 0){
                    System.out.printf("false %d\n", count);
                    check = false;
                    break;
                }
            }
            if (check)
                System.out.printf("true %d\n", count);
        }
        in.close();
    }
}