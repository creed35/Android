package javastudy1;

public class Rectangle {
	int width; //필드 ==> 생략하면 default
	int height;
	int getArea() { //메소드 (*하여 면적구함)
		return width*height;
	}
	
	//기본생성자
	public Rectangle() {
		
	}
	
	public Rectangle(int w, int h) {
		width =w; //내부접근이므로 this사용
		height=h;
		
	}
	
}
