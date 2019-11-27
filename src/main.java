public class main {
    public static void main(String[] args){
        int[] a = new int[100];
        for (int i = 0; i < 100; i++){
            a[i] = 1;
        }
        int n = 11;
        int m = 50;
        System.out.println(func(n, a, m));

    }

    public static int func( int n, int[] a, int m )
    {
        int result = n - 10;
        int numCalls = a[0] + 1;
        a[0] = numCalls;
        if( n <= 100 ) {
            int tmp = func ( n + 11, a, m );
            result = func ( tmp, a, m );
        }
        if( numCalls < m ) {
            a[numCalls] = result;
        }
        return result;
    }
}
