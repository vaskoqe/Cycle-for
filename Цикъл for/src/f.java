import java.util.Scanner;
public class f {

	public static void main(String[] args) {
		System.out.println("Това е програма, която ще Ви покаже сумата от сбора на числата от 0 до числото, което въведете");
		Scanner input=new Scanner(System.in);
		System.out.println("Въведи числото а");
		int а=input.nextInt();
		int sum=0;
		for(int i =0; i<= а;i++) {
			sum= sum+i;
		}
		System.out.println(sum);	
		input.close();
				

	}

}
