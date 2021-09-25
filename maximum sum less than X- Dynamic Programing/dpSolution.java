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
		int dp[][]=new int[n+1][x+1];
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=x;j++) {
				if(i==0 || j==0) {
					dp[i][j]=0;
				}else {
					if(strips[i-1]>j) {
						dp[i][j]=dp[i-1][j];
					}else {
						dp[i][j]=Math.max(strips[i-1]+dp[i-1][j-strips[i-1]], dp[i-1][j]);
					}
				}
			}
		}
		System.out.println(dp[n][x]);
	}
}