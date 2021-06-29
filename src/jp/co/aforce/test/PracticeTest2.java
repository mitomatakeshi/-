package jp.co.aforce.test;

public class PracticeTest2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x = 10;
		int y = 28;
		double z = 3.14;
		
		//問題1
		System.out.println("x*y= "+x*y);
		
		//問題2
		System.out.println("y/x= "+y/x+"余り"+y%x);
		
		//問題3
		double a = y*z;
		System.out.println(a);
		
		//問題4
		a++;
		System.out.println(a);
		
		//問題5
		int age = 22;
		int randomNumber = new java.util.Random().nextInt(100);
		System.out.println(randomNumber);
		if(age>randomNumber) {
			System.out.println("私の方が年上です");
		}
		else if(age<randomNumber) {
			System.out.println("私の方が年下です");
		}
		else {
			System.out.println("私と同い年です");
		}

	}

}
