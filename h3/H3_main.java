package h3;
//import java.util.Arrays;

public class H3_main {
    public static void main(String[] args) {
        //System.out.println(compareArraysVal(new int[]{4,1,2,3,3,7,7,4,4,7}, new int[]{4,4,4,7,7,3,1,2,3}));
    }

    public static boolean compareArraysVal(int[] a, int[] b) {
        boolean[] numberAlreadyCounted = new boolean[a.length];
        boolean[] numberExistsEvenInB = new boolean[b.length];
        int[] numberCount = new int[a.length];

        for(int i = 0;i<a.length; i++)
            if(!numberAlreadyCounted[i]) {
                countAndMarkVal(i, a, numberCount, numberAlreadyCounted);
                if(!valExistsEvenIn(a[i],numberCount[i],b,numberExistsEvenInB))
                    return false;
            }
        
        for (int i = 0; i<b.length; i++)
            if (!numberExistsEvenInB[i])
                return false;

        return true;
    }

    public static void countAndMarkVal(int i, int[] a, int[] numberCount, boolean[] numberAlreadyCounted) {
        for(int k = i;k<a.length; k++) {
            if (a[i]==a[k]) {
                numberCount[i]++;
                if(i != k)
                    numberAlreadyCounted[k] = true;
            }
        }
    }

    public static boolean valExistsEvenIn(int number, int numberCount, int[] b, boolean[] numberExistsEvenInB) {
        int bNumberCount = 0;
         for(int i = 0;i<b.length; i++)
            if (number==b[i]) {
                bNumberCount++;
                numberExistsEvenInB[i]= true;
            }
        return (numberCount==bNumberCount);
    }

    //public static boolean compareArraysVal2(int[] a, int[] b) {
    //    return Arrays.equals(Arrays.stream(a).sorted().toArray(), Arrays.stream(b).sorted().toArray());
    //}
}