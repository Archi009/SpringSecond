package method;

public class Calc {
	private int kor;
	private int eng;
	
	public Calc() {};
	
	public Calc(int a, int b) {
		this.kor = a;
		this.eng = b;
	}

	public  void headerPrint(String str) {
		int score = 50;
		System.out.println("=================================");			//똑같은 코드의 반복 => 함수 만들기
		System.out.println("============="+str+"==============");
		System.out.println("=================================");
	}
	public  void plus() {
		System.out.println(String.format("%d + %d  = %d", kor,eng,kor+eng));
	}
	
	
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
}
