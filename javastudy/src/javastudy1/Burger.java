package javastudy1;

public class Burger {

	public static void main(String[] args) {
		// �������̽� ��ü���� = new Ŭ������()
		BurgerCook cook = new HotelCook();
		cook.makeBurger();
		
		BurgerCook cook1 = new InstantCook();
		cook1.makeBurger();
		cook1.makeSalad();
		

	}

}