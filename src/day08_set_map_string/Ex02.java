package day08_set_map_string;

import java.util.*;

public class Ex02 {
	public static void main(String[] args) {

		

		
		ArrayList arr = new ArrayList();
		
		arr.add("��");
		arr.add("��");
		arr.add("��");
		
		Iterator it = arr.iterator();
		
		
		for (int i = 0; i<arr.size(); i++) {
			if(it.hasNext()==true) {
				System.out.println("�� : " + it.next());
			}else {
				System.out.println("���� �����ϴ�");
			}
			
		}
		
		
		
		
		
		
		
		
	}
}
