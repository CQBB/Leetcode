package Array;

/**
 * Created by fyang on 6/26/2015.
 */
public class RemoveDuplicatesFromSortedArray {
    public static int removeDup(int A[], int n)
    {
        if(n==0) return n;

        int index=0;
        for(int i=1;i<n;i++){
            if(A[index]!=A[i])
                A[++index]=A[i];
        }

        return index+1;
    }
}
