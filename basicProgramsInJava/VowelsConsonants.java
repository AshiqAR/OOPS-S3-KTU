public class VowelsConsonants {
    public static void main(String args[]){
        String s = "hello";
        int vowels=0,cons=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                vowels++;
            else   
                cons++;
        }
        System.out.println("String: "+s);
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+cons);
    }
}
