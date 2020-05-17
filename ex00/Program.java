class Program{
    public static void main(String args[]) {
        int input = 479598;
        int res = 0;
        res += input % 10;
        input /= 10;
        res += input % 10;
        input /= 10;
        res += input % 10;
        input /= 10;
        res += input % 10;
        input /= 10;
        res += input % 10;
        input /= 10;
        res += input % 10;
        System.out.println(res);
    }
}