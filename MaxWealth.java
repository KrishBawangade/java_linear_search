public class MaxWealth {

    static int findHighestWealth(int[][] arr){
        int maxWealth = findWealth(arr[0]);
        int maxWealthIndex = 0;
        for(int i=1; i<arr.length; i++){
            int wealth = findWealth(arr[i]);
            if(wealth>maxWealth){
                maxWealth = wealth;
                maxWealthIndex = i;
            }
        }
        return maxWealthIndex+1;
    }

    static int findWealth(int[] arr){
        int wealth = 0;

        for(int ele: arr){
            wealth +=ele;
        }

        return wealth;
    }

    public static void main(String[] args){
        /*
        Each row represents a person's wealth 
        And each column represent their wealth in a specific bank
        */
        int[][] personWealth = {
            {1,2,5,3}, // total wealth = 11 -> Person 1
            {3,4,4}, // total wealth = 11 -> Person 2
            {4,7,1}, // total wealth = 12 -> Person 3
            {3,6,2} // total wealth = 11 -> Person 4
        };

        int highestWealthPerson = findHighestWealth(personWealth);

        System.out.printf("Person %d has the highest wealth", highestWealthPerson);
    }
}
