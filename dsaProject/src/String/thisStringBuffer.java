package String;

public class thisStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");

        //Build String
        String message = sb.toString();
        System.out.println(message);
    }
}