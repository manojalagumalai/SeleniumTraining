package week1.day3;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester"; 
		String input[]=test.split(" ");
		
		for(int i=0; i<input.length; i++) {
			if(i%2==0) {
				System.out.print(input[i]+" ");
			}else {
				String newWord="";
				char[] word=input[i].toCharArray();
				for(int j=word.length-1; j>=0; j--) {
					newWord=newWord+word[j];
				}
				System.out.print(newWord+" ");
			}
		}

	}

}
