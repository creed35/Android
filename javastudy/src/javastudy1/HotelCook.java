package javastudy1;

public class HotelCook implements BurgerCook {
// �������̽��� �ִ� �޼��带 �����ϴ� �κ�
	@Override
	public void makeBurger() {
		System.out.println("ȣ�� �ܹ��� ");	
	}

	@Override
	public void makeSalad() {
		System.out.println("ȣ�ڱ� ������");

	}

}
