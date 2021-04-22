import java.util.HashSet;
class Test {

	public static void main(String[] args) {
		int[] arr= {-2,-5,7,5,1};
		int X=0;
		System.out.println(ifSumPairExists(arr,X));
	}
	
	public static boolean ifSumPairExists(int[] arr, int X) {
		int n=arr.length;
		HashSet<Integer> hset=new HashSet<Integer>();
		for(int i=0;i<n;i++) {
			if(hset.contains(X-arr[i]))
				return true;
			else
				hset.add(arr[i]);
		}
		return false;
	}
}
