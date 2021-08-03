package day08_set_map_string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		HashMap map = new HashMap<>();
		String key = null, value = null, key2 = null;

		while (true) {
			System.out.println("1.메뉴 등록");
			System.out.println("2.메뉴별 가격 보기");
			System.out.println("3.종료");
			System.out.print(">>>");
			int select = scan.nextInt();
			switch (select) {
			case 1:
				System.out.print("메뉴입력: ");
				key = scan.next();
				if (map.containsKey(key) == false) {
					System.out.print("가격 입력: ");
					value = scan.next();
					map.put(key, value);
					System.out.println("등록 되었습니다.");
				} else {
					System.out.println("있는 메뉴!");
				}
				break;
			case 2:
				Iterator it = map.keySet().iterator();
				while (it.hasNext()) {
					key2 = (String) it.next();
					System.out.println(key2 + ": " + map.get(key2));
				}
				System.out.println("1.수정 2.삭제 3.나가기");
				int choice = scan.nextInt();
				if (choice == 1) {
					System.out.println("변경 메뉴이름 입력 : ");
					String ud = scan.next();
					if (map.containsKey(ud)) {
						System.out.println("수정 가격 입력 :");
						String mo = scan.next();
						System.out.println(map.get(ud) + ">>>" + mo);
						System.out.println("변경됨!");
						map.replace(ud, mo);
						
					} else {
						System.out.println("메뉴가 없습니다~");
					}

				} else if (choice == 2) {
					System.out.println("삭제할 이름을 입력:");
					String ud2 = scan.next();
					if (map.containsKey(ud2)) {
						map.remove(ud2);
						System.out.println(ud2 + "삭제완료");
					} else {
						System.out.println("삭제할 메뉴가 없음");
					}
				}

				break;
			case 3:
				System.out.println("종료합니다");
				System.exit(0);

			default:
				System.out.println("잘못입력.");
			}

		}

	}

}
