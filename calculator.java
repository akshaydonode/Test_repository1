public class calculator{
		public static void main(String args[])
		{
			System.out.println("Hello World!!!");
			System.out.println("calculator java program");

		}
public static void addition(int num1,int num2){
			System.out.println("Addition="+(num1+num2));
}

public static void division(int num1,int num2){
		if(num2==0)
			System.out.println("Divisor should be greater than 0");
		else
			System.out.println("Division="+(num1/num2));

public static void subtraction(int num1,int num2){
			System.out.println("Subtraction="+ (num1-num2));
}
public static void multiplication(int num1,int num2){
			System.out.println("multiplication="+(num1*num2));
	

}
	public static void square(int num1,int num2){
			System.out.println("squares="+(num1*num1)+(num2*num2));
	

}
}
