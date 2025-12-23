public class SearchInRange {

    static int searchInRange(int[] arr, int startIndex, int endIndex, int target){
        // return -1 if the array is empty
        if(arr.length == 0){
            return -1;
        }
        // run the loop from start index to end index (both inclusive) 
        for(int i=startIndex; i<=endIndex; i++){
            int ele = arr[i];
            if(ele == target){
                return i; // return the index if the target found in the range
            }
        }

        return -1;
    }

    public static void main (String[] args){
        int[] arr = {34,6,23,1,67,78};
        int target = 23;

        int start = 1; 
        int end = 4;

        // searching in range start(1) - end(4)
        int pos= searchInRange(arr, start, end, target);

        if(pos!=-1){
            System.out.printf("Element(%d) found at index %d", target, pos);
        }else{
            System.out.printf("Element(%d) not found in the array", target);
        }
    }
}
