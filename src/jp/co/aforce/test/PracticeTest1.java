package jp.co.aforce.test;

public class PracticeTest1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//問題1
		final double TAX = 0.1;
		System.out.println("消費税率は"+TAX+"です。");
		
		//問題2
		int x = 480;
		int price = 0;
		
		price = (int)(x*(1+TAX));
		System.out.println("税込み金額は"+price+"です。");
		
		//問題3
		String name = "三苫健";
		System.out.println("自分の名前は"+name+"です。");

	}

}
