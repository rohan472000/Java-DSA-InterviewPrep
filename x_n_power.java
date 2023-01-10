public class x_n_power {
    public static void main(String[] args) {
        int x=2;
        int n=5;
        System.out.println(calcpower(x, n));
    }
    public static int calcpower(int x,int n){
        if(n==0) return 1;
        if(x==0) return 0;

        //n is even
        if(n % 2 ==0)
           return calcpower(x,n/2)*calcpower(x,n/2);
        else
           return calcpower(x, n/2)*calcpower(x, n/2)*x;

    }
}
/*
 *  public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for(int n : nums){
            int size = result.size();
            for(int i=0; i<size; i++){
                List<Integer> subset = new ArrayList<>(result.get(i));
                subset.add(n);
                result.add(subset);
            }
        }
        return result;
    }
 */