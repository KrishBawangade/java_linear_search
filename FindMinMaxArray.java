public class FindMinMaxArray {

    public static void main(String[] args){
        int[] arr = {34, 12, 56, 1, 67, 8, 4, 64};

        // assume 1st element as minimum and maximum
        int min = arr[0];
        int max = arr[0];

        // compare each element with the minimum and maximum value
        for(int i=1; i<arr.length; i++){

            int element = arr[i];

            // if any value is greater than max value update max value to that number
            if(element>max){
                max = element;
            }

            // if any value is less than min value update min value to that number
            if(element<min){
                min = element;
            }
        }

        System.out.println("Maximum Value in Array is " + max);
        System.out.println("Minimum Value in Array is " + min);
    }
}
