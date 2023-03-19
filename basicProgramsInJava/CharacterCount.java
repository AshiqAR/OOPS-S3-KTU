// count the number of alphabets, digits and special characters

public class CharacterCount {
    public static void main(String args[]){
        String s = "Hello@239 1#()*9";
        int len = s.length();
        int alphabets=0,spcl=0,digits=0;

        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                alphabets++;
            }
            else if(ch>='0' && ch<='9'){
                digits++;
            }
            else{
                spcl++;
            }
        }
        System.out.println("Sentence: "+ s);
        System.out.println("Alphabets: "+ alphabets);
        System.out.println("Digits: "+ digits);
        System.out.println("Special characters: "+ spcl);
    }
}
