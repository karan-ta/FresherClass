public class Lesson1{
	int age;
	char Gender;
	int taxTotal;

//instance method
public void sayHello(String name){
	System.out.println("Hello "+name);
}

//static method or clas based method
public static void sayHelloStatic(String name){
    System.out.println("Hello "+name);	
}

public static void main(String[] args){
    
    Lesson1 myobj = new Lesson1();
    myobj.sayHello("karan");
    //Hello karan
    Lesson1.sayHelloStatic("rakesh");
    //Hello rakesh



	int a = 10;
    System.out.println(a);
    //int a-b = 0; 
    //int assert = 10;
    try {
    int numerator = 10;
    int denominator = 0;
    System.out.println(numerator/denominator);
}
    catch(Exception e){
    	//just try it out please :)
    }

    int first = 10,second = 10;
    String as = "10",bs = "10";
    int intresult = first + second; // adds
    String stringresult = as+bs; // concatentes 
    System.out.println(intresult);
    System.out.println(stringresult);

 //20
//"1010"

    System.out.println(stringresult+intresult);//guess the output ??
    
    int number = (int)2.2;
    int numbersecond = 2;
    System.out.println(number==numbersecond);
    //true
    Integer numberObject = new Integer(2000);
    Integer numberSecondObject = new Integer(2000);//2 objects are created
    System.out.println(numberObject==numberSecondObject);//address of pointer is compared
    //2 different pointer/object  addresses are being compared
    //false 
    //Lesson  - use equals method to compare values of objects

    System.out.println(numberObject.equals(numberSecondObject));
    // 




















}

}