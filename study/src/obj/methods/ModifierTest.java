package obj.methods;

//제어자를 활용하여 캡슐화를 구현하는 프로그램 소개
//private 생성자를 통해 객체 생성을 제한하는 클래스가 필요한 경우
/*1. 자바의 기본 자료형 또는 배열에 적용되는 메서드를 한군데 모아둘때 (java.lang.Math, java.util.Array)
   2. 특정 인터페이스를 구현하는 객체를 만드는 팩터리 메서드 (java.util.Collections)
   3. final 클래스에 적용할 메서드들을 모아 놓을때 (잘 이해가 안간다.)
    - final 클래스는 상속을 불가능하게 만든다.
    - 상속이 불가능하다는 것은 하위 클래스가 없다는 것이고 하위 클래스에서 메서드를 추가할 수도 없다.
    - 따라서 final 클래스는 api 클래스를 만들때 주로 사용한다. 
      api클래스를 final 로 만들면 최종 사용자가 api 클래스를 상속하여 변형하는 것을 막을 수 있다.*/

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