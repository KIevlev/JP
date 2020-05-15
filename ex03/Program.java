import java.util.Scanner;
//import java.util.regex.Pattern;

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
                //in.nextLine();
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
                if(check) {
                in.nextLine();
                while (small > 0){
                    answer+="=";
                    small--;
                }
                answer+=">\n";
            }
               // in.findInLine("Week " + count))current.equals("Week " + count)
            }
            else
                check = false;          
        }
        in.close();
        if (answer != "") System.out.print(answer);
    }
}