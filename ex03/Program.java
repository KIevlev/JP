import java.util.Scanner;
//import java.util.regex.Pattern;

class Program{
    public static void main(String args[]) {
        int count = 0;
        boolean check = true;
        int small;
        int next = 0;
        String answer = "";
        Scanner in = new Scanner(System.in);
        while (check){
            count++;
            String current = in.nextLine();
            small = 10;
            if(current.equals("42"))break;
            if (in.findInLine("Week " + String.valueOf(count)) != "")
            {
                in.nextLine();
               // in.findInLine("Week " + count))current.equals("Week " + count)
            }
            for (int i = 0; i < 5; i++)
            {
                next = in.nextInt();
                if (next < small)
                    small = next;
            }
            while (small > 0){
                answer+="=";
                small--;
            }
            answer+=">\n";
           
        }
        in.close();
        System.out.println(answer);
    }
}