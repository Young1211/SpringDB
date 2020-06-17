package pack01;

public class Apple { // apple 클래스 생성
	
	//기본 생성자를 꼭 만들어줘야 함! 에러 발생 방지!
	Apple(){
	}
	
	Apple(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	String name;
	int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
