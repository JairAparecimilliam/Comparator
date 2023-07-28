import java.util.Scanner;

public class Compare
{
//start application
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

int number1;
int number2;

System.out.print("Enter first Integer: ");
number1 = sc.nextInt();

System.out.print("Enter second Integer: ");
number2 = sc.nextInt();

if(number1 == number2)
System.out.printf("%d == %d%n", number1,number2);
if(number1 != number2)
System.out.printf("%d != %d%n", number1,number2);
if(number1 < number2)
System.out.printf("%d < %d%n", number1,number2);
if(number1 > number2)
System.out.printf("%d > %d%n", number1,number2);
if(number1 <= number2)
System.out.printf("%d <= %d%n", number1,number2);
if(number1 >= number2)
System.out.printf("%d >= %d%n", number1,number2);

sc.close();
}}
