package String;

import java.util.Arrays;

public abstract class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[][]= {{2,5,7,9},{8,3,6,4},{1,8,7,5}};
		for(int i=0;i<1;i++) {
			for (int[] row : x) {
	            System.out.println(Arrays.toString(row));
			}

		}
	}

}
