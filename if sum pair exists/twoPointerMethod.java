import java.util.Arrays;
class Test {

	public static void main(String[] args) {
		int[] arr= {-2,-5,7,5,1};
		int X=0;
		System.out.println(ifSumPairExists(arr,X));
	}
	
	public static boolean ifSumPairExists(int[] arr, int X) {
		int n=arr.length;
		Arrays.sort(arr); //sorting the array
		int left=0, right=n-1; //taking two extreme indices
		while(left<right) { //looping till all array elements are traversed
			int sum=arr[left]+arr[right];
			if(sum==X)
				return true;
			if(sum<X)
				left++; //sum is less so shifting left pointer to get a greater value
			if(sum>X)
				right--; //sum is more so shifting right pointer to get lesser value
		}
		return false;
	}
}
