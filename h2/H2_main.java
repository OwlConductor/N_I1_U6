public class H2_main {
    public static void main(String[] args) {
        //System.out.println(compareArrays(new int[]{1,2,3}, new int[]{1,2,3}));
        //System.out.println(compareArrays(new int[]{2,4,6}, new int[]{6,4,2}));
    }

    public static boolean compareArrays(int[] a, int[] b) {
        if(a.length != b.length)
            return false;

         for (int i = 0; i<a.length;i++)
            if (a[i]!=b[i])
                return false;

         return true;
    }
}
