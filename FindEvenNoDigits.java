public class FindEvenNoDigits {

    /*
    Find the no. of digits which are even Ex - 45(2 digits),  5632(4 digits), etc.
    */
    static int findEvenNoDigits(int[] arr){
        int noOfEvenDigits = 0;
        for(int ele: arr){
            
            if(ele<0){
                ele = ele * -1;
            }
            int noOfDigits = findDigits2(ele);            
            
            if(noOfDigits %2==0){
                noOfEvenDigits++;
            }
        }
        return noOfEvenDigits;
    }

    // while loop to count the no. of digits
    static int findDigits1(int n){
        int noOfDigits = 0;
        int ele = n;
        while(ele>0){
                ele = (int) (ele/10);
                noOfDigits++ ;
            }
        return noOfDigits;
    }

    //faster way to find no. of digits
    static int findDigits2(int n){
        int noOfDigits =  (int) ((Math.log10(n)) + 1);
        return noOfDigits;
    }

    public static void main(String[] args){
        int[] arr = {23, 1, -4543, 345, 2, 4435, 5632};
        int evenDigits = findEvenNoDigits(arr);

        System.out.println("The no. of even digit numbers are "+ evenDigits);
    }
}
