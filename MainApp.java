package advance.dev;
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Nhap so a:");
		a = sc.nextInt();
		System.out.println("Nhap so b:");
		b = sc.nextInt();
		
		try {
			int c = a/b;
			if(b!=0) {
				System.out.println(c);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("\n");
		String A;
		System.out.println("Nhap chuoi A:");
		A = sc.next();
		
		try {
			Integer.parseInt(A);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println("So nhap vao khong phai dang so");
		}
		
		
	}

}