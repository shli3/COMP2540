import java.util.Scanner;

class quicksort{
    public static void main(String args[]){
        int pivot = 0, right, i = 0;
        int[] A = new int[10];
        Scanner index = new Scanner(System.in);
        
        while(i < 10)
        {
            A[i] = index.nextInt();
            i++;
        }

        right = A.length;
        /*i = 0;

        while(i<10){
            System.out.printf("%d ", A[i]);
            i++;
        }

        System.out.printf("\n");*/
        Trier(A, pivot, right - 1);

        /*i = 0;

        while(i<10){
            System.out.printf("%d ", A[i]);
            i++;
        }*/
        index.close();
    }

    static void Trier(int A[], int p, int r){

        if(p<r){
            int q = Partition(A, p, r);
            Trier(A, p, q-1);
            Trier(A, q+1, r);
        }
    }

    static int Partition(int A[], int p, int r){

        int x = A[r];
        int i = p-1;
        for(int j = p; j < r; j++)
        {
            if(A[j] <= x){
                i = i + 1;
                int hold = A[i];
                A[i] = A[j];
                A[j] = hold;
            }
        }
        int temp = A[i+1];
        A[i+1] = A[r];
        A[r] = temp;
        return i + 1;

    }
}
