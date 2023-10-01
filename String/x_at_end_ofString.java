public class x_at_end_ofString {
    public static void main(String[] args) {
        String s = "axbxcxdxexxxr";
        String ns = "";
        xAtEnd(s, 0, 0, ns);
    }
    public static void xAtEnd(String str,int idx,int count,String newString){
     if(idx == str.length()){
        for (int i = 0; i < count; i++) {
            newString+='x';
        }
        System.out.println("count of x : "+count);
        System.out.println(newString);
        return;
     }
    char currChar = str.charAt(idx);
    if(currChar == 'x'){
        count++;
        xAtEnd(str, idx+1, count, newString);
    }else{
        newString+=currChar;
        xAtEnd(str, idx+1, count, newString);
    }
    }
}
