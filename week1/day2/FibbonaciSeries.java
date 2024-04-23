package week1.day2;

public class FibbonaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[10];
				arr[0]=0;
				arr[1]=1;
				for(int i=2; i<10; i++) {
					arr[i]=arr[i-2]+arr[i-1];
				}
				for(int j: arr) {
					System.out.println(j);
				}
	}
}
