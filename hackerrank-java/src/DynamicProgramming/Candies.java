package DynamicProgramming;

public class Candies {

    public static void main(String[] args) {
        int n = 3;
        long candies=0; 
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 1;
        
        int[] count = new int[n];
        count[0] = 1;
        count[2] = 1;
        count[1] = 1;
       
        for(int i=0;i<n;i++){
            if(i!=0 && arr[i]>arr[i-1]){
                 count[i] = count[i-1]+1;
            }

        }
        for(int i=n-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
                count[i]=Math.max(count[i],count[i+1]+1);
            }
        }
        for(int i=0;i<n;i++) {
            candies += count[i];
        }
        System.out.print(candies);

    }

}
