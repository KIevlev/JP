import java.util.Scanner;


class Program {
    public static void main(final String args[]) {
        int[][] calendar = new int[2][30];
        String[] days = {"Mo", "Tu", "We", "Th", "Fr", "Sa", "Su"};
        int day = 1;
        int dots = 0;
        String pupils = "";
        String lessons = "";
        for (int i = 1; i < 31; i++)
        {
            calendar[0][i-1] = i;
            if (day == 7)
                day = 0;
            calendar[1][i-1] = day;
            day++;
        }
        Scanner in = new Scanner(System.in);
        String current;
        while (true)
        {
            current = in.nextLine();
            while (current != "."){
                pupils+=current + " ";
                current = in.nextLine();
            }
            in.nextLine();
            current = in.nextLine();
            while (current != "."){
                in.nextInt()
                current = in.nextLine();
            }
        }

    }
}