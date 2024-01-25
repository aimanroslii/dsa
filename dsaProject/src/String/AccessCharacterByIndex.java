package String;

public class AccessCharacterByIndex {

    public static char accessCharByIndex(String str, int k){
        return str.charAt(k);
    }

    public static void main(String[] args) {
        String str = "GeeksForGeeks";
        //Index
        int k = 4;
        System.out.println(accessCharByIndex(str, k));
    }
}
