public class SearchInString {

    /*
    Check whether Character (ch) is present in the string or not
    Return true if present else return false
    */
    static boolean searchChar(String str, char ch){
        if(str.length() == 0){
            return false;
        }

        for(int i=0; i<str.length(); i++){
            char charItem = str.charAt(i); 
            if(charItem == ch){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args){
        String s1 = "This is a String";
        char target = 'a';

        boolean isPresent = searchChar(s1, target);

        if(isPresent){
            System.out.printf("Character(%c) is present in String(%s)", target, s1);
        }else{
            System.out.printf("Character(%c) is not present in String(%s)", target, s1);
        }
    }
}
