import com.cmw.product.Computer;

public class OPMain {

	public static void main(String[] args) {
		// 컴퓨터 : 이름, 가격
		Computer c = new Computer("슈퍼컴", 1000000);
		c.cpu = "i7";
//		c.ram; 패키지가 다른데 ram의 접근제한자가 default라서 안됨
//		c.hdd; protected 쓰려면 내가 어디서 사용하는지 잘 봐야됨 
		
		// 프린터
		
		//스캐너
	}

}
