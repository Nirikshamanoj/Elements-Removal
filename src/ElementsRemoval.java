import java.util.Scanner;
import java.util.Arrays;
public class ElementsRemoval {
    static int findSumOfElementsRemoved(int[] A,int n)
    {
        int cost=0;
        int[] B=new int[n];
        int j=0;
        Arrays.sort(A);
        for (int i=n-1;i>=0;i--)
        {
            B[j]=A[i];
            j++;
        }
        for (int i=0;i<n;i++)
        {
            cost+=B[i]*(i+1);
        }
        return cost;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] A=new int[n];
        for (int i=0;i<n;i++)
        {
            A[i]=scanner.nextInt();
        }
        int sum=findSumOfElementsRemoved(A,n);
        System.out.println(sum);
    }
}
