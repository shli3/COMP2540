import java.util.Scanner;

class insertionsort{
    public static void main(String args[]){

        int i = 0, key;
        int A[] = new int[6];
        Scanner index = new Scanner(System.in);

        while(i<6){
            A[i] = index.nextInt();
            System.out.printf("%d ", A[i]);
            i++;
        }

        System.out.printf("\n");

        for(int j = 1; j < A.length; j++)
        {
            key = A[j];
            i = j - 1;
            while(i>=0 && A[i]>key)
            {
                A[i+1] = A[i];
                i--; 
            }
            A[i+1] = key;
        }

        i = 0;

        while(i<6){
            System.out.printf("%d ", A[i]);
            i++;
        }

        index.close();

    }
}
