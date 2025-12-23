public class SearchIn2dArray {

    static int[] searchIn2dArray(int[][] arr, int target){
        for(int i =0; i<arr.length;i++){
            
            for(int j=0; j<arr[i].length; j++){
                int ele = arr[i][j];

                if(ele == target){
                    int[] res = {i+1,j+1};
                    return res;
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args){
        int[][] arr = {
            {1,2,34},
            {23,56,14,45},
            {3,67}
        };
        int target = 56;

        int[] result = searchIn2dArray(arr, target);

        if(result.length!=0){
            System.out.printf("Element(%d) found at row %d column %d", target, result[0], result[1]);
        }else{
            System.out.printf("Element(%d) not found in the array", target);
        }
    }
    
}
