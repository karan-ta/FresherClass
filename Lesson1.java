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
    //value of type is compared.
    //true
    Integer numberObject = new Integer(2000);
    Integer numberSecondObject = new Integer(2000);//2 objects are created
    System.out.println(numberObject==numberSecondObject);//address of pointer is compared
    //2 different pointer/object  addresses are being compared
    //false 
    //Lesson  - use equals method to compare values of objects

    System.out.println(numberObject.equals(numberSecondObject));
    // true 
    
    //String only has just objects - no types.
    // no str .
    String s1 = "karan";
    String s2 = "karan";
    System.out.println(s1==s2);
    //true
    //memory address of s1 ==  memory address of s2
    //only object is created 
    // so //true - mem(s1) == mem(s2)
    //String pool -- only one object will be created - to save memory
    //one object only
    String s3 = "karan";
    //only one object 
    System.out.println(s2==s3);
    //true
    

    Integer box1 = 200; //autoboxing feature
    Integer box2 = 200;

    System.out.println(box1==box2);
    //false
    System.out.println(box1.equals(box2));
    //true - use equals to compare values of objects.
    
    //language deviations,edge cases .

    Integer box1s = 100; //autoboxing feature
    Integer box2s = 100;
    System.out.println(box1s==box2s);
    //true (------ below 128 )
    //value is below 128 or 1024 or something else - then only one object is created 
    //false   or true 
    System.out.println(box1s.equals(box2s));
    //true

    String fullname = "karan ahuja";
    String myname = "karan ahuja"; // new object is not created .as "karan ahuja" is already present in string pool
    System.out.println(fullname == myname);
    //true , comparing fullname,myname which are both the same- only one object is created.
    System.out.println(fullname.equals(myname));
    //true
    String fname = "karan ";
    String lname = "ahuja";
    String newfullname = fname+lname; // variable substitution happens at runtime.
    //newfullname value is "karan ahuja" - jave knows this only at runtime, not at compile time
    //string pool feature is not used.
    //string pool feature - new string object created only if value of that object is not present in the string pool
    //newfullname = "karan ahuja"
    System.out.println(fullname == newfullname);
    //false
    System.out.println(fullname.equals(newfullname));
    //true - use equals method while comparing values of objects.
    






    //unboxing .
    Integer iobj = 128; //autoboxing
    Integer jobj = 128; //autoboxing
    int i = iobj;   //unboxing
    int j = jobj;   //unboxing
    System.out.println(iobj==jobj);
    //false 
    System.out.println(i == j);
    //comparing types - just check value inside type 
    //true
    System.out.println(iobj.equals(jobj));
    //true























}

}