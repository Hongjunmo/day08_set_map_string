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
			System.out.println("1.�޴� ���");
			System.out.println("2.�޴��� ���� ����");
			System.out.println("3.����");
			System.out.print(">>>");
			int select = scan.nextInt();
			switch (select) {
			case 1:
				System.out.print("�޴��Է�: ");
				key = scan.next();
				if (map.containsKey(key) == false) {
					System.out.print("���� �Է�: ");
					value = scan.next();
					map.put(key, value);
					System.out.println("��� �Ǿ����ϴ�.");
				} else {
					System.out.println("�ִ� �޴�!");
				}
				break;
			case 2:
				Iterator it = map.keySet().iterator();
				while (it.hasNext()) {
					key2 = (String) it.next();
					System.out.println(key2 + ": " + map.get(key2));
				}
				System.out.println("1.���� 2.���� 3.������");
				int choice = scan.nextInt();
				if (choice == 1) {
					System.out.println("���� �޴��̸� �Է� : ");
					String ud = scan.next();
					if (map.containsKey(ud)) {
						System.out.println("���� ���� �Է� :");
						String mo = scan.next();
						System.out.println(map.get(ud) + ">>>" + mo);
						System.out.println("�����!");
						map.replace(ud, mo);
						
					} else {
						System.out.println("�޴��� �����ϴ�~");
					}

				} else if (choice == 2) {
					System.out.println("������ �̸��� �Է�:");
					String ud2 = scan.next();
					if (map.containsKey(ud2)) {
						map.remove(ud2);
						System.out.println(ud2 + "�����Ϸ�");
					} else {
						System.out.println("������ �޴��� ����");
					}
				}

				break;
			case 3:
				System.out.println("�����մϴ�");
				System.exit(0);

			default:
				System.out.println("�߸��Է�.");
			}

		}

	}

}
