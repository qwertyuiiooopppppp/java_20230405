package ex01;

public class Exam04 {

	public static void main(String[] args) {
    /*
    int num = 8;
    int cnt = 3;
    
    System.out.println(num/ cnt); // 몫이 2
    System.out.println(num% cnt);// 나머지 2
    */
	// 키보드로 4000을 입력받는다 4000초
    // 화면상 출력
	// 1시간 6분 40초 
		
    Scanner sc = new scanner(System.in);
    System.out.println("계산일 초를 입력>>");
    int num= sc.nextInt(); // int num이 받음 
    
    int second = num % 60;
    int hour = num / 3600; //60*60
    int minute = (num %3600) / 60;
    
    System.out.println(hour +" 시, " + minute + "분," + second + "초" );		
    		
	}

}
