package String;
import java.util.Arrays;
public class Array {
	private static boolean equals(int[] arr1, Object obj) {
        if (obj == null || !(obj instanceof int[])) {
            return false;
        }

        int[] arr2 = (int[]) obj;

        return Arrays.equals(arr1, arr2);
    }

    private static boolean equals(String[] arr1, Object obj) {
        if (obj == null || !(obj instanceof String[])) {
            return false;
        }

        String[] arr2 = (String[]) obj;

        return Arrays.equals(arr1, arr2);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intA = {2, 15, 8, 10, 6};
		String[] strA = {"M", "U", "B","A","R","A","k"};
		String sA="U";
		
		//before sorting printing array
		System.out.println("before sorting");
		System.out.println(Arrays.toString(intA));
		System.out.println(Arrays.toString(strA));
		System.out.println();
		
		//sort method
		Arrays.sort(intA);
		Arrays.sort(strA);
		//after sorting printing array
		System.out.println("after sorting");
		System.out.println(Arrays.toString(intA));
		System.out.println(Arrays.toString(strA));
		System.out.println();
		
		//search method
		System.out.println("searching eliment 15 index");
		int index = Arrays.binarySearch(intA,15);
		if(index>=0) {
			System.out.println("Element 15 found at index: "+ index);
		}
		else {
			System.out.println("Element 15 not found in the array");
		}
		
		System.out.println();
		int indx = Arrays.binarySearch(strA,sA);
		if(indx>=0) {
			System.out.println("Element 15 found at index: "+ indx);
		}
		else {
			System.out.println("Element 15 not found in the array");
		}
		
		// fill method
        int fillValue = 0;
        Arrays.fill(intA, fillValue);

        System.out.println();
        System.out.println("after filling with value " + fillValue);
        System.out.println(Arrays.toString(intA));
        
     // Test equals method for arrays
        int[] arrT = {5, 12, 8, 11, 2};
        boolean intArraysEqual = equals(intA, arrT);
        System.out.println("Are the int arrays equal? " + intArraysEqual);

        String[] strArrToCompare = {"L", "M", "O", "P", "Q", "R", "S"};
        boolean strArraysEqual = equals(strA, strArrToCompare);
        System.out.println("Are the string arrays equal? " + strArraysEqual);

		

	}

}
