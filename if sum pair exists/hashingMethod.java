import java.util.HashSet;
class Test {

	public static void main(String[] args) {
		int[] arr= {-2,-5,7,5,1};
		int X=0;
		System.out.println(ifSumPairExists(arr,X));
	}
	
	public static boolean ifSumPairExists(int[] arr, int X) {
		int n=arr.length;
		HashSet<Integer> hset=new HashSet<Integer>();//Creating an object of hashset of type Integer
		for(int i=0;i<n;i++) {
			if(hset.contains(X-arr[i]))//checking if pair exists
				return true;
			else
				hset.add(arr[i]);// adding to hashset
		}
		return false;
	}
}
