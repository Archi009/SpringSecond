package method;
 /**
  *  메서드 선언/  매개변수 / 리턴타입 / call by reference/ value
  */
public class MainApp {
	 
	public static void main ( String[] args) {
//		System.out.println("=================================");			//똑같은 코드의 반복 => 함수 만들기
//		System.out.println("=============header==============");
//		System.out.println("=================================");
		
		int kor = 10;
		int eng = 200;
		Calc cal = new Calc(kor,eng);
		
		cal.headerPrint("header");
		cal.plus();
		cal.headerPrint("footer");
		
//		headerPrint("header");
		
//		System.out.println(String.format("%d + %d  = %d", 5,3,5+3));
//		plus(kor,eng);
		
//		headerPrint("footer");
//		System.out.println("=================================");
//		System.out.println("=============footer==============");
//		System.out.println("=================================");
	}
//	
//	public static void headerPrint(String str) {
//		int score = 50;
//		System.out.println("=================================");			//똑같은 코드의 반복 => 함수 만들기
//		System.out.println("============="+str+"==============");
//		System.out.println("=================================");
//	}
//	public static void plus(int a , int b) {
//		System.out.println(String.format("%d + %d  = %d", a,b,a+b));
//	}
//	
}
