package cp;
import java.io.*;

class Array {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            //size of array
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");

            //adding elements
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Kadane obj = new Kadane();

            //calling maxSubarraySum() function
            System.out.println(obj.maxSubarraySum(arr, n));
        }
    }
}
class Kadane{

    // Function to find subarray with maximum sum
    // arr: input array
    // n: size of array
    int maxSubarraySum(int arr[], int n){
        int i=0, j=0, sum=0, maxsum=0, maxsumt=0;
        while(i != n){
            if(j<n){
                sum=sum+arr[j];
                j++;
            }
            if(sum>maxsumt){
                maxsumt = sum;
            }
            else if(j==n){
                if(maxsum<maxsumt){
                    maxsum = maxsumt;
                }
                i++;
                j=i;
                sum=0;
            }
        }
        return maxsum;
    }

}