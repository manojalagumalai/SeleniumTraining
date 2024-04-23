package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=7, j=0;
		for(int i=2; i<=10; i++){
			if (number%i==0) {
				j=j+1;
			}
		}
		
		if(j==1) {
			System.out.println("The number "+number+" is a Prime Number");
		} 
		else
		{
			System.out.println("The number "+number+" is Not a Prime Number");
		}
	}
}
