package week1.day3;

import java.util.Arrays;

public class FindMissingElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]={1,4,3,2,8,6,7};
		Arrays.sort(input);
		for(int i=0; i<input[input.length-1];i++) {
			if(i+1!=input[i]) {
				int output=i+1;
				System.out.println("The missing number is :"+ output);
				break;
			}
		}
	}

}
