import java.util.Scanner;

public class bitManipulation {
    public static void main(String[] args) {
        // get bit
        int n =5;
        int pos = 2;
        int bitMask = 1<<pos;

        if((bitMask & n) == 0){
          System.out.println("element is zero");
        }else{
            System.out.println("one");
        }
          
        // set bit by OR operation
        int n1 = 5;
        int pos1 = 1;
        int bitMask1 = 1<<pos1;

        int result = bitMask1 | n1;
        System.out.println(result);

        // clear any bit by AND with NOT 
        int n2 = 5;
        int pos2 = 2;
        int bitMask2 = 1<<pos2;
        System.out.println("not operator on bitmask2 : "+(~(bitMask2)));
        int result1 =  (~(bitMask2)) & n2;
        System.out.println(result1);

        // update bit 
        Scanner sc  = new Scanner(System.in);
        
        int m = 5;
        int pos3 = 1;
        System.out.println("enter your oper 1 or 0 : ");
        int input = sc.nextInt();  // input=1 forsetting bit to 1 and input=0 is for setting bit for 0
        int bitMask4 = 1<<pos3;
        
        if(input == 1){
            //set to 1
          int res = bitMask4 | m;
          System.out.println(res);
         }else{
            //clear to 0
            int re1 = (~(bitMask4)) & m;
            System.out.println(re1);
         }


    }
}
