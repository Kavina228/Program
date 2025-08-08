import java.util.Scanner;
public class Program3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a: ");
		int a=sc.nextInt();
		int count=0;
		if(a%2==0) {
			count=a-1;
		}
		else {
			count=a;
		}
		int num=1;
		for(int i=1;i<=count;i++) {
			System.out.print(num);
			if(i!=count) {
				System.out.print(", ");
			}
			num=num+2;
		}
	}
}
