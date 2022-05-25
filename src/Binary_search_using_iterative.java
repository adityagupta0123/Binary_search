import java.util.Scanner;

public class Binary_search_using_iterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. to find : ");
        int x = sc.nextInt();
        int []arr = {0, 6, 9 ,10 ,45, 77};
        int ans = bs(arr, x);
        if(ans == -1)
            System.out.println("element not found");
        else
            System.out.println("element found on index : " + ans);
    }
    private static int bs(int []arr, int x){
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
}
