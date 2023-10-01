public class first_last_occurence_string {
    public static void main(String[] args) {
        String s = "rohanann";
        findOccur(s, 0, 'a');
    }
    public static int first = -1;
    public static int last = -1;
    public static void findOccur(String str,int idx,char element){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == element){
            if(first == -1)
               first = idx;
            else last = idx;   
        }
        findOccur(str, idx+1, element);
    }
}
