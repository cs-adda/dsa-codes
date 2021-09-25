import java.util.*;
class Solution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		int strips[]=new int[n];
		for(int i=0;i<n;i++) {
			strips[i]=sc.nextInt();
		}
		System.out.println(maxSum(x,n,strips));
	}
	
	static int maxSum(int X, int N, int arr[]){
		if(N==0){
			return 0;
		}
		if(X<arr[N-1]){
			return maxSum(X, N-1, arr);
		}
		return Math.max( (arr[N-1]+ maxSum(X-arr[N-1], N-1, arr)), maxSum(X, N-1, arr) );
	}
}