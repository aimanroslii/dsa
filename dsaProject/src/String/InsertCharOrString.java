package String;

public class InsertCharOrString {
    public static void main(String[] args) {
        String str = "GeeksGeeks";
        String ch = "for";
        int k = 5;

        System.out.println("Original String: " + str);
        insertDemo(str, ch, k);
    }

    public static void insertDemo(String str, String ch, int k){
        StringBuilder sb = new StringBuilder(str);
        sb.insert(k,ch);
        String modifiedString = sb.toString();
        System.out.println("Modified String: "+ modifiedString);
    }
}
