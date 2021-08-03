package day08_set_map_string;

public class Ex09 {
	public static void main(String[] args) {

		String str = "   Have a nice day           ";
		
	
	String result = str.trim();
	System.out.println("1." + str);
	System.out.println("2." + result);
	
	
	String[] split = result.split(" ");
	System.out.println(split[0]); // 공백 기준으로 왼쪽 0 , 1 , 2 ... 으로 나눔


	String addr = "101/서울시/종로구/종로3가 100번지/4층";
	String[] ad = addr.split("/");
	for(int i =0; i<ad.length; i++) {
		
		System.out.println(ad[i]);
	}
	
	
	String replace = result.replace(" ", "+++");
	System.out.println(replace);
	
			
	
	
	
	
	}
}
