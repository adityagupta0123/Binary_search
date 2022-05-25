import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. to find : ");
        int x = sc.nextInt();
        int []arr = {0, 6, 9 ,10 ,45, 77};
        int ans = bs_iterative(arr, x);
        int an = bs_recursion(arr, x, 0, arr.length -1 );
        if(ans == -1 || an == -1)
            System.out.println("element not found");
        else
            System.out.println("element found on index : " +"iter... "+ ans + " rec.. "+ an);
    }
    private static int bs_iterative(int []arr, int x){
        int low = 0 , high = arr.length -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x)
                return mid;
            if (x > arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return - 1;
    }
    private static int bs_recursion(int []arr, int x,int low , int high ){
        if(low > high) return -1;
            int mid = low + (high - low) / 2;
            if (arr[mid] == x)
                return mid;
            if (x > arr[mid])
                return bs_recursion(arr, x, mid + 1, high);
            return bs_recursion(arr, x, low, mid - 1);

    }
}
