class Program{
    public static void main(String args[]) {
        int i = 199817;
        int k = 100000;
        int res = 0;
        int temp = 0;
        while (k > 0){
            res+=i/k;
            temp = i/k;
            i = i - k*temp;
            k/=10;
        }
        System.out.println(res);
    }
}