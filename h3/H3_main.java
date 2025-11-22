import java.util.Arrays;

public class H3_main {
    public static void main(String[] args) {
        //System.out.println(compareArraysVal(new int[]{4,1,2,3,3,7,7,4,4}, new int[]{4,4,4,7,7,3,1,2,3}));
        //System.out.println(compareArraysVal(new int[]{2,6,5,4,6,6}, new int[]{6,4,2,6,5,5}));
    }

    public static boolean compareArraysVal(int[] a, int[] b) {
        boolean[] numberAlreadyCounted = new boolean[a.length];
        boolean[] numberExistsEvenInB = new boolean[b.length];
        int[] numberCount = new int[a.length];

        for(int i = 0;i<a.length; i++) {
            if(!numberAlreadyCounted[i]) {
                for(int k = i;k<a.length; k++) {
                    if (a[i]==a[k]) {
                        numberCount[i]++;
                        if(i != k)
                            numberAlreadyCounted[k] = true;
                    }
                }
                //System.out.print(a[i] + " " + numberCount[i]);
                if(!valExistsEvenIn(a[i],numberCount[i],b,numberExistsEvenInB))
                    return false;
            }
        }
        
        for (int i = 0; i<b.length; i++)
            if (!numberExistsEvenInB[i])
                return false;

        return true;
    }

    public static boolean valExistsEvenIn(int number, int numberCount, int[] b, boolean[] numberExistsEvenInB) {
        int bNumberCount = 0;
         for(int i = 0;i<b.length; i++)
            if (number==b[i]) {
                bNumberCount++;
                numberExistsEvenInB[i]= true;
            }
        //System.out.println("    " + bNumberCount);
        return (numberCount==bNumberCount);
    }
}
