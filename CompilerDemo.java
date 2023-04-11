public class CompilerDemo { 

	public static void main(String[] args) {
	
		System.out.println("hello world " + args[0]);

		for(String i : args) {
			System.out.print(i + " ");
		}
	}

}
