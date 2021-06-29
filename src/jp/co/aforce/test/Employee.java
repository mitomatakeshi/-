package jp.co.aforce.test;

public class Employee {
	private int number;
	private String name;
	private String seibetu;
	private int age;
	
	void getNumber(int number) {
		this.number = number;
	}
	void getName(String name) {
		this. name= name;
	}
	void getSeibetu(String seibetu) {
		this.seibetu = seibetu;
	}
	void getAge(int age) {
		this.age = age;
	}
	void showEmployee() {
		System.out.println("番号："+number+",氏名："+name+",性別："+seibetu+",年齢："+age);
	}
	

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Employee employee = new Employee();
		employee.showEmployee();

	}

}
