package day08_set_map_string;

import java.util.*;

public class Quiz02 {
	public static void main(String[] args) {
	
		
		// ----- 1��
//		String str = new String("Have a nice day Have a nice day Have a nice day");
//		int i=0;
//		ArrayList arr = new ArrayList();
//		while(i < str.length()) {
//			if(str.charAt(i) == 'a')
//				arr.add(i);
//			i++;
//		}
//		System.out.println(arr);
		
		// ------ 2��
//		String str = new String("It is a fun java programming");
//		ArrayList arr = new ArrayList();
//		
//		System.out.println("�� ���� : " + str.length());
//		int cnt=0,cnt2=0;
//		for(int i =0; i<str.length(); i++) {
//			if(str.charAt(i) == 'a') {
//				cnt++;
//			}
//			if(str.charAt(i) == 'g') {
//				cnt2++;
//			}
//		}
//		System.out.println("a ���� : "+cnt);
//		System.out.println("g ���� : "+cnt2);
		
		
		// ----- 3��
		String str02 = new String("tESt  sTring  change   first");
		String changeStr = new String();
		int k=0;

		str02 = str02.toLowerCase();
		if(str02.charAt(0) >='a' && str02.charAt(0) <='z') {
			changeStr+=(char)(str02.charAt(k)-32);
			k++;
		}
		while(k<str02.length()) {
			if(str02.charAt(k) != ' ') {
				changeStr+=str02.charAt(k);
				k++;
				continue;
			}
			while(str02.charAt(k) == ' ') {
				changeStr+=str02.charAt(k);
				k++;
			}
			if(str02.charAt(k) >= 'a' &&str02.charAt(k) <='z')
				changeStr+=(char)(str02.charAt(k)-32);
			k++;
		}
		System.out.println(str02);
		System.out.println(changeStr);
		
		
		
		
		
		
		
		
		
	
		
		

//			String str="�谳�� -2017��\nȫ�浿���� -2015��\n���켱�� -2018��";
//			
//			System.out.println("====������ str====");
//			System.out.println(str);
//			str=str.replace("-", ":");
//			String[] arrstr= str.split("\n");
//			str="";
//			
//			 
//			
//			for(int i =0; i<arrstr.length; i++) {
//				String[] restr=arrstr[i].split(":");
//				
//				restr[1]=restr[1].replace(restr[1], "1999��");
//				
//				
//				str+=(restr[0]+":"+restr[1]+"\n");
//			}
//			System.out.println("====������ str====");
//			System.out.println(str);
			
			
			
	
	
	
	
	
	}
}
