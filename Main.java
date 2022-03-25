public class Main
{
	public static void main(String[] args) {
	    int a = 4;
	    int b = 3;
	    int c = 7;
	    int d = 8;
	    System.out.println("Стороны первого конверта: "+a+" и "+b+" .");
	    System.out.println("Стороны второго конверта: "+c+" и "+d+" .");
	    if ((a<c) && (b<d))
	    {
	        System.out.println("Результат:");
	        System.out.println("Первый конверт можно вложить во второй.");
	    }
	    else
	    {
	        System.out.println("Результат:");
	        System.out.println("Первый конверт нельзя вложить во второй.");
	    }
	}
}
