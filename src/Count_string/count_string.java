package Count_string;

public class count_string {
    public static void main(String[] args) {
        char b = 'a';
        String a ="abacnxanca";
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b){
                count ++;
            }
        }
        System.out.println(count);
    }
}
