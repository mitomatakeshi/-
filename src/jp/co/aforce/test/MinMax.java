package jp.co.aforce.test;
//問題2
public class MinMax {
	int getMaxValue(int a,int b,int c) {
		int getMaxValue = a;
		if(b>getMaxValue) {
			getMaxValue = b;
		}else {
			getMaxValue = c;
		}return getMaxValue;
	}
	int getMinValue(int a,int b,int c) {
		int getMinValue = a;
		if(b<getMinValue) {
			getMinValue = b;
		}else{
			getMinValue = c;
		}return getMinValue;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
