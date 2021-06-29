package jp.co.aforce.test;

public class PracticeTest5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//問題1
		int fortune = new java.util.Random().nextInt(4)+1;
		switch(fortune) {
		case 1 : System.out.println("吉です");break;
		case 2 : System.out.println("中吉です");break;
		case 3 : System.out.println("大吉です");break;
		default : System.out.println("凶です");break;
		}
		
		//問題2
		int number = 0;
		for(int i = 1; i<100; i++) {
			if(i%7==0) {
				number+=i;
			}
		}System.out.println(number);
		
		
		//問題3
		for(int x =1; x<=9; x++) {
			for(int y =1; y<=9; y++) {
				System.out.print(x*y+" ");
			}
			System.out.println();
		}

	}

}
