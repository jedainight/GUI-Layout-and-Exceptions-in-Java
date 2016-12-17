package geometry;

public class Main {

	public static void main(String[] args) {
		
		int maxShapes=8;
		double totalArea=0;
		Shape[] shapes = new Shape[maxShapes];
		shapes[0] = new Circle(3);
		shapes[1] = new Circle(5);
		shapes[2] = new Square(4);
		shapes[3] = new Square(6);
		shapes[4] = new Rectangle(3,5);
		shapes[5] = new Rectangle(6,8);
		shapes[6] = new Triangle(2,3,4);
		shapes[7] = new Triangle(4,5,6);
		
		System.out.println("�������������� 2 ����������� ��� �� �������� �������: \n" );
		
		for(int i=0; i<shapes.length;i+=2)
			System.out.println("Name: "+ shapes[i].getName()+", Color: "+shapes[i].getColor());
		
		for(int i=0; i<shapes.length;i++)
			totalArea+=shapes[i].calcArea();		
		System.out.println("\n�������� ������� ��� �������� ��� ������: "+totalArea +" �.�" );		
			
	}
	/* ���������� - ������
	 * 
	 * � �������� ��� � ������� ��� ������� �� ��� ����� Shape �� ��� �������� �������
	 * ����� �� addon ��� eclipse "ObjectAid UML" ��� �� ������ Diagram.ucls � Diagram.png
	 * ������������ ��� ��������
	 * 
	 * � ������������� (polymorphism) ����� ��� ������ ��� ����� ���� ��������� �������
	 * ���  ����� �� ���������� �� ���� ����� ������� �� �������� ��� �������� ������������ 
	 * ������ ������� �� ��� ���� ��� ������������ ��� ����� ��������.
	 * 
	 * �������� �� ������ Shape.calcArea()  ������� �� ��� ���� ��� ������������ ��� �����
	   ������� � ������� Shape �� ������ � ��������� ������� ����������� ������� ����� ��
	 * ������ �� ����� ������������.
	 * 
	 * �� ���� ������ ��� ��� ��� �������� Shape.getName ��� Shape.getColor
	 * 
	 */

}
