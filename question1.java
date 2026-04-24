public class question1{
    public static int maxSubArray(int[] ar) {
        int s = 0;
        int m = ar[0];
        for (int i=0;i<ar.length;i++) {
            s = s+ar[i];

            if (s>m) 
                m=s;
            if (s<0) 
                s=0;
        } return m;
    }
    public static void main(String[] args) {
        int[] ar = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(+ maxSubArray(ar));
    }
}
