public class MulStrings {
    public static void main(String[] args) {
        String a = "23";
        String b = "32";
        StringBuilder res= new StringBuilder();
        for (int i = 1; i >= 0; i--) {
            for (int j = 1; j >= 0 ; j++) {

            }
            int x = a.charAt(i)-'0';
            int y = b.charAt(i)-'0';
            res.append(x * y + '0');
        }
        System.out.println();
    }
}
