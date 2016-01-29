package myProj;

public class SplTest {
	public static void main(String[] args) {
		String str = "5+5";
		String[] spl = str.split("\\d");
		String[] chr = str.split("\\D");

		for (int i = 0; i < spl.length; i++) 
			System.out.println(i + " " + spl[i]);
			for (int j = 0; j < spl.length; j++) 
				System.out.println(j + " " + chr[j]);
						
	}
}
