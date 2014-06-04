package jobdo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Class1{
	public static void main(String[] args) {
		test1();
	}
	
	public static void test1() {
		Scanner scanner = new Scanner(System.in);
		ArrayList list = new ArrayList();
		while(scanner.hasNextInt()) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = a + b;
			list.add(c);
		}
		
		Iterator iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}		
		
	}
}