import java.util.Scanner;

class Program {
    public static void main(final String args[]) {
    Scanner in = new Scanner(System.in);
    String current = in.nextLine();
    char[] arr = current.toCharArray();
    char[] words = new char[arr.length];
    int[][] count;
    int max;
    int vse;
    
    if (arr.length > 0)
    {
        int i = 0;
        for (int j = 0; j < arr.length; j++){
            boolean a = false;
            for (int k = 0; k < words.length; k++)
            {
            if (words[k] == arr[j])
                 a = true;
            }
            a = (a == true) ? a : false;
            if (!a)
            {
                words[i] = arr[j];
                i++;
            }
        }
        count = new int[2][i];
        for (int j = 0; j < i; j++){
            count[0][j] = (int)words[j];
        }
        for (int k = 0; k < i; k++){
            for(int j = 0; j < arr.length; j++)
            {
                if (arr[j] == (char)count[0][k])
                    count[1][k]++;
            }
        }
        //сортировка
        for(int k = count[0].length-1 ; k > 0 ; k--){
            for(int j = 0 ; j < k ; j++){
                if( count[1][j] < count[1][j+1] ){
                    int tmp = count[1][j];
                    int tmp1 = count[0][j];
                    count[1][j] = count[1][j+1];
                    count[0][j] = count[0][j+1];
                    count[1][j+1] = tmp;
                    count[0][j+1] = tmp1;
                }
            }
        }
        max = count[1][0];
        vse = (count[0].length <= 10) ? count[0].length : 10;
        int[][] answer = new int[13][vse];
        int k;
        for (int j = 0; j < vse; j++)
        {
            k = 0;
            answer[11][j] = count[0][j];
            while (k < (int)count[1][j]*10/max){
                answer[10 - k][j] = '#';
                k++;
            }
            answer[10 - k][j] = count[1][j];
        }

        for (int c = 0; c < count.length; c++) {
            System.out.println();
            for (int j = 0; j < count[c].length; j++) {
                if (c == 0)
                System.out.print((char)count[c][j]+" ");
                else
                System.out.print(count[c][j]+" ");
            }}
            System.out.println();


        int r;
        for (int j = 0; j < vse; j++)
        {
            int c = count[1][j];
            r = 0;
            while (c > 0){
                r++;
                c /= 10;
            }
            answer[12][j] = r;
        }
        int con;
        for (int c = 0; c < answer.length - 1; c++) {
            System.out.println();
            for (int j = 0; j < answer[c].length; j++) {
                if (c == 11 || answer[c][j] == 0)
                    {
                        con = answer[12][j];
                        while(con > 1){
                            System.out.print(" ");
                            con--;
                        }
                        System.out.print("   " + (char)answer[c][j]);
                    }
                    
                else if (c == 0 || answer[c-1][j] == 0)
                    System.out.print("   " + answer[c][j]);
                else
                {
                    con = answer[12][j];
                    while(con > 1){
                        System.out.print(" ");
                        con--;
                    }
                System.out.print("   "+(char)answer[c][j]);
                }
            }}
            System.out.println();
    }
    in.close();
}
}