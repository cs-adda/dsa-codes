import java.util.Arrays;
class Test {

	public static void main(String[] args) {
		int[] arr= {-2,-5,7,5,1};
		int X=0;
		System.out.println(ifSumPairExists(arr,X));
	}
	
	public static boolean ifSumPairExists(int[] arr, int X) {
		int n=arr.length;
		Arrays.sort(arr);
		int left=0, right=n-1;
		while(left<right) {
			int sum=arr[left]+arr[right];
			if(sum==X)
				return true;
			if(sum<X)
				left++;
			if(sum>X)
				right--;
		}
		return false;
	}
}
