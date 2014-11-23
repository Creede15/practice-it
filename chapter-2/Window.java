/* 
* This program produces the following output:
* 
* +===+===+
* |   |   |
* |   |   |
* |   |   |
* +===+===+
* |   |   |
* |   |   |
* |   |   |
* +===+===+
*
* size of the figure can be changed simply by changing that constant's value.
*/

public class Window {
	public static final int size = 6;
	public static void main(String[] args) {
		line();
		verticalLine();
		line();
		verticalLine();
		line();
	}
	
	public static void line() {
		System.out.print("+");
		
		for (int i = 1; i <= size; i++) {
			System.out.print("=");
		}
		
		System.out.print("+");
		
		for (int i = 1; i <= size; i++) {
			System.out.print("=");
		}
		
		System.out.println("+");
	}
	
	public static void verticalLine() {
		for (int i = 1; i <= size; i++) {
			System.out.print("|");
			
			for (int j = 1; j <= size; j++) {
				System.out.print(" ");
			}
			
			System.out.print("|");
			
			for (int j = 1; j <= size; j++) {
				System.out.print(" ");
			}
			
			System.out.println("|");
		}
	} 
}
