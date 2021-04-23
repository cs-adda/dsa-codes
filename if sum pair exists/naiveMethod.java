class Test {

	public static void main(String[] args) {
		int[] arr= {-2,-5,7,5,1};
		int X=0;
		System.out.println(ifSumPairExists(arr,X));
	}
	
	public static boolean ifSumPairExists(int[] arr, int X) {
		int n=arr.length;
		for(int i=0;i<n;i++) { // Check every pair
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j]==X) {
					return true;
				}
			}
		}
		return false;
	}
}
