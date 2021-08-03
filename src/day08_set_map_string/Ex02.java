package day08_set_map_string;

import java.util.*;

public class Ex02 {
	public static void main(String[] args) {

		

		
		ArrayList arr = new ArrayList();
		
		arr.add("일");
		arr.add("이");
		arr.add("삼");
		
		Iterator it = arr.iterator();
		
		
		for (int i = 0; i<arr.size(); i++) {
			if(it.hasNext()==true) {
				System.out.println("값 : " + it.next());
			}else {
				System.out.println("값이 없습니다");
			}
			
		}
		
		
		
		
		
		
		
		
	}
}
