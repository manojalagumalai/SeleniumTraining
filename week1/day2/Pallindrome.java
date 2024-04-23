package week1.day2;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int input=123, output=0, reminder, a;
	a=input;
	while(a>0) {
		reminder=a%10;
		output=(output*10)+reminder;
		a=a/10;
		}
	if (input==output) {
		System.out.println(input+" is a pallindrome");
	}
	else {
		System.out.println(input+" is not a pallindrome");
	}
	}

}
