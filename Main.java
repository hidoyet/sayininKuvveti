package donguIleSayininKuvvetiniBulma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Sayiyi giriniz");
		int num=scanner.nextInt();
		for(int i=0;i<=num;i++) {
			System.out.println("4'ün " + i +".inci kuvveti" + Math.pow(4,i));
			System.out.println("5'in " + i+ ".inci kuvveti" +Math.pow(5,i));
		}
	}

}
