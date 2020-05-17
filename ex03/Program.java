import java.util.Scanner;

class Program{
    public static void main(String args[]) {
        int count = 0;
        boolean check = true;
        int small;
        int next = 0;
        String answer = "";
        String current;
        Scanner in = new Scanner(System.in);
        while (check && (count < 19)){
            count++;
            current = in.nextLine();
            small = 10;
            if(current.equals("42"))break;
            if (current.equals("Week " + String.valueOf(count)))
            {
                answer += current + " ";
                for (int i = 0; i < 5; i++)
                {
                    next = in.nextInt();
                    if (next > 0 && next < 10)
                    {
                        if (next < small)
                            small = next;
                    }
                    else{
                        check = false;
                        break;
                    }
                }
                if (in.hasNextInt())
                {
                    check = false;
                }
                if(check) {
                in.nextLine();
                while (small > 0){
                    answer+="=";
                    small--;
                }
                answer+=">\n";
            }
            }
            else
                check = false;          
        }
        in.close();
        if (check) System.out.print(answer);
    }
}