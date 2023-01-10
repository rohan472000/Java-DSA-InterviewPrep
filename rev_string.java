public class rev_string {
    public static void main(String[] args) {
        String n = "rohan";
        printrevStr(n, n.length()-1);
    }
    public static void printrevStr(String a, int idx){
        if(idx == 0){
            System.out.println(a.charAt(idx));
            return;
        }
        System.out.println(a.charAt(idx));
        printrevStr(a, idx-1);
    }
}
