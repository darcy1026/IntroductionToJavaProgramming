package chapter05.questions;

public class Question15 {

	public static void main(String[] args) {
		int tenPerLine = 10;

		int count = 0;
		for (int i = 33; i < 127; i++) {              // I used i+8 % 10 == 0 to get the per line for ten then somehow 
			count++;                                  // I found this count++ thing which is very make sense  
			if (count % 10 == 0)                      //
				System.out.println((char)(i));
			else
				System.out.print((char) (i) + " ");
		}

	}

}
