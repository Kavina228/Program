import java.util.Scanner;
public class Program4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Elements:");
		int a=sc.nextInt();
		int arr[]=new int[a];
		System.out.println("Enter the Numbers:");
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		 int[] count = new int[10]; 
		 for (int i = 0; i < a; i++) {
	            int num = arr[i];
	            for (int j = 1; j <= 9; j++) {
	                if (num % j == 0) {
	                    count[j]++;
	                }
	            }
	        }
	        System.out.println("Output:");
	        for (int i = 1; i <= 9; i++) {
	            System.out.println(i + ": " + count[i]);
	        }
		
	}

}
