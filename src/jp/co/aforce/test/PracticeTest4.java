package jp.co.aforce.test;

import java.util.ArrayList;

public class PracticeTest4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//問題1
		//②が適切。
		//int型などのプリミティブ型で２つの値が等しいか比較する場合は
		//”==”演算子で比較しますが、String型などの参照型の場合はequalsメソッドで比較する必要があるから。
		
		
		//問題2
		ArrayList<String> animals = new ArrayList<>();
		animals.add("犬");
		animals.add("猫");
		animals.add("うさぎ");
		animals.add("へび");
		
		//問題3
		String name = "犬";
		for(String animal: animals ){
			if(name == animal) {
				System.out.println("犬はリストに含まれています");
			}
			else {
				System.out.println("犬はリストに含まれていません");
			}
			 
			}
		
		
		//問題4
		int birthday = 9;
		switch (birthday) {
		case 1: System.out.println("１月：元日,成人の日");break;
		case 2: System.out.println("２月：建国記念日,天皇誕生日");break;
		case 3: System.out.println("３月：春分の日");break;
		case 4: System.out.println("４月：昭和の日");break;
		case 5: System.out.println("５月：建国記念日,みどりの日,こどもの日");break;
		case 6: System.out.println("６月：（なし）");break;
		case 7: System.out.println("７月：海の日,スポーツの日");break;
		case 8: System.out.println("８月：山の日");break;
		case 9: System.out.println("９月：敬老の日,秋分の日");break;
		case 10: System.out.println("１０月：（なし）");break;
		case 11: System.out.println("１１月：文化の日,勤労感謝の日");break;
		case 12: System.out.println("１２月：(なし）");break;
		default :System.out.println("もう一度誕生日月を入力してください");
		}
		//switch文を選択した理由
		//複数の変数や条件を組み合わせて分岐させたい処理がなく、
		//switch文を使ったほうがより、見やすいプログラムになるから。

	}

}
