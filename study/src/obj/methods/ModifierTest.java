package obj.methods;

//�����ڸ� Ȱ���Ͽ� ĸ��ȭ�� �����ϴ� ���α׷� �Ұ�
//private �����ڸ� ���� ��ü ������ �����ϴ� Ŭ������ �ʿ��� ���
/*1. �ڹ��� �⺻ �ڷ��� �Ǵ� �迭�� ����Ǵ� �޼��带 �ѱ��� ��ƵѶ� (java.lang.Math, java.util.Array)
   2. Ư�� �������̽��� �����ϴ� ��ü�� ����� ���͸� �޼��� (java.util.Collections)
   3. final Ŭ������ ������ �޼������ ��� ������ (�� ���ذ� �Ȱ���.)
    - final Ŭ������ ����� �Ұ����ϰ� �����.
    - ����� �Ұ����ϴٴ� ���� ���� Ŭ������ ���ٴ� ���̰� ���� Ŭ�������� �޼��带 �߰��� ���� ����.
    - ���� final Ŭ������ api Ŭ������ ���鶧 �ַ� ����Ѵ�. 
      apiŬ������ final �� ����� ���� ����ڰ� api Ŭ������ ����Ͽ� �����ϴ� ���� ���� �� �ִ�.*/

public class ModifierTest {
	ModifierTest(){
	Test t = new Test;
	Test t1 = Test.getInstance();
	System.out.println(t1);
	}

	public static void main(String[] args) {
	new ModifierTest();
	}

}
class Test{
	static Test t;
	private Test() {
		
	}
	public static Test getInstance() {
		if(t==null) { t=new Test();}
		return t;
	}
}