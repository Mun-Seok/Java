package day28;

public class Anonymous3 {

	public static void main(String[] args) {
//		Inter1 it=new Inter1(); interface�� ��ü ���� �ȵ�
		Inter1 it=new Inter1() {

			@Override
			public void f1() {
				// TODO Auto-generated method stub
				
			}};
			it.f1();
			
		}
	}

interface Inter1{
	void f1();
}
//�Ϲ�Ŭ����
class Inter1Impl implements Inter1{

	@Override
	public void f1() {
	}
	
}