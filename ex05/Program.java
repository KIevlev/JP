import java.util.Scanner;


class Program {
    public static void main(final String args[]) {
        int[][] calendar = new int[2][30];
        String[] days = {"Mo", "Tu", "We", "Th", "Fr", "Sa", "Su"};
        int day = 1;
        int dots = 0;
        String[] pupils = new String[10];
        int lessons[][] = new int[7][7];
        for (int i = 0; i < 7; i++){
            lessons[0][i] = i;
        }
        for (int i = 1; i < 31; i++)
        {
            calendar[0][i-1] = i;
            if (day == 7)
                day = 0;
            calendar[1][i-1] = day;
            day++;
        }
       /* for (int i = 0; i < calendar.length; i++){
        {
            for (int j = 0; j < calendar[0].length; j++)
            {
                System.out.print(calendar[i][j] + " ");
            }
            System.out.println();
        }
        }*/
        Scanner in = new Scanner(System.in);
        String current;
        boolean check = true;
        int count = 0;
        while (check){
            current = in.nextLine();
            if (!current.equals(".") && count < 10){
                    current = current.trim();
                    if (current.length() > 0 && current.length() < 11)
                    {
                        pupils[count] = current;
                        count++;
                    }
                    else
                    {
                        check = false;
                    }
            }
            else{
                check = false;
            }
        }
            dots++;
            int i = 0;
            while (pupils[i] != null)
            {
                System.out.println(pupils[i]);
                i++;
            }
            
//            in.nextLine();
            int time;
            String day1;
            count = 0;
            current = in.nextLine();
            while (!current.equals(".") && count < 6){
                time = Integer.parseInt(current.trim().split(" ")[0]);
                day1 = current.trim().split(" ")[1];
                for (int j = 0; j < days.length; j++)
                {
                    if (days[j].equals(day1))
                    {
                        int k = 1;
                            while (k < 7 && lessons[k][j] != 0){
                                k++;
                                if (k == 7)
                                {
                                    check = false;
                                    break;
                                }
                            }
                            if (time > 0 && time < 7)
                                lessons[k][j] = time;
                            else{
                                check = false;
                                break;
                            }
                    }
                }
                count++;
                current = in.nextLine();
            }
            //проверочка
            for (int k = 0; k < lessons.length; k++){
                {
                    for (int j = 0; j < lessons[0].length; j++)
                    {
                        System.out.print(lessons[k][j] + " ");
                    }
                    System.out.println();
                }
            }
            /*
       for (int j = 1; j < 7; j++)
                {
                    for(int k = 0 ; k < j ; k++){
                        if (lessons[j][k] == 0)
                            continue;
                        if (lessons[j][k] > lessons[j][k+1] ){
                            int tmp = lessons[j][k];
                            lessons[j][k] = lessons[j][k+1];
                            lessons[j][k+1] = tmp;
                            }
                        }
                    }
        
                System.out.printf("\n check = %b\n", check);
            for (int k = 0; k < lessons.length; k++){
                    for (int j = 0; j < lessons[0].length; j++)
                    {
                        System.out.print(lessons[k][j] + " ");
                    }
                    System.out.println();
                }*/
                
            
    }
}