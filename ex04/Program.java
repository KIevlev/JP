import java.lang.reflect.Array;
import java.util.Scanner;

class Program {
    public static void main(final String args[]) {
    Scanner in = new Scanner(System.in);
    String current = in.nextLine();
    char[] arr = current.toCharArray();
    //char[] words = new char[arr.length];
    int[][] count = new int[2][arr.length];
    char[][] answer = new char[10][12];
    if (arr != null)
    {
        count[0][0] = arr[0];
        int i = 0;
        for (int j = 0; j < arr.length; j++){
            if (!mass(count[0], arr[j]))
            {
                count[0][i] = (int)arr[j];
                count[1][i] = 1;
                i++;
            }
            else{
                count[1][i]= count[1][i] + 1;
            }
        }
    }

    in.close();
    for (int i = 0; i < count.length; i++) {
        System.out.println();
        for (int j = 0; j < count[i].length; j++) {
            if (i == 0)
                System.out.print((char)count[i][j]+" ");
            else
                System.out.print(count[i][j]+" ");
        }
    }
     System.out.println();
}
    static boolean mass(int[] words, char a){
        for (int i = 0; i < words.length; i++)
        {
            if ((char)words[i] == a)
                return true;
        }
        return false;
    }
}