
public class OMain {

	public static void main(String[] args) {
		
		// dog ������
		//���̰� 3��
		int age = 3;
		//�̸��� ����
		String name = "����";
		//ü���� 3.5
		double weight = 3.5;
		
		System.out.println("������ ���̰�" + age);
		System.out.println("������ �̸���" + name);
		System.out.println("������ ü����" + weight);
		System.out.println("________________________________");
		
		//���� 3 �̸� ���� ü�� 3.5
//		��ü : �����ϴ� ��� ��
//		��ü�� �������? Ŭ���� ������ ����
		
		//��üȭ(�ν��Ͻ�, ��ü)
		//Ŭ������ ������
		Dog d1 = new Dog(); // ��ü����
		d1.name = "����";
		d1.age = 3;
		d1.weight = 3.5;
		d1.printInfo();
		System.out.println("--------");
		// 2��° ������
		// �̸� ���, ���� 1 , ü�� 1.5
//		�׷��� ������ �� ��̰� 1�� ¢�� �� ������ ������ ������
		Dog d2 = new Dog();
		d2.name = "����";
		d2.age = 3;
		d2.weight = 3.5;
		d2.bark();
		d2.printInfo();
		
		System.out.println("--------------");
		
//		��ǻ�͸� ��ü�� ǥ�����ּ���
//		cpu 2.5, ram 8, hdd 256
//		printinfo()�ϸ� �� ���� ���� �� ������
		

	}

}
