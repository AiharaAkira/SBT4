
//student is a human
public class Student extends Human{
	int jpScore;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int age,int jpScore) {
		
		this.name = name;
		this.age = age;
		this.jpScore = jpScore;
	}

	//�ڱ�Ұ�
	//�޼ҵ带 ������ : �������̵�
	
	//����(super)Ŭ����
	@Override
	public void info(){
		super.info();
		System.out.println(jpScore);
	}
	
	
}
