import java.util.Scanner;


public class LinearSearch{

    /* 
        Check if an element is present in the array if present return the index
        If not present return -1
    */
    static int linearSearch(int[] arr, int element){
        for(int i =0; i<arr.length;i++){
            
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 elements in array separated by space: ");
        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element you want to find: ");
        int element = sc.nextInt();

        int pos = linearSearch(arr, element);
        
        if(pos!=-1){
            System.out.printf("Element(%d) found at index %d", element, pos);
        }else{
            System.out.printf("Element(%d) not found in the array", element);
        }

        sc.close();
    }
}