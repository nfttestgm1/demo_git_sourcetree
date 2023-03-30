

import java.util.Scanner;

public class Java27_tryCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhập vào số nguyên n");
		try {
			n = sc.nextInt();
			System.out.println("Giá trị nhập là: " + n);
		} catch (Exception e) {
			System.out.println("Nhập dữ liệu không đúng");
		} finally {
			System.out.println("Kết thúc chương trình");
		}
	}
}
