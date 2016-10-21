JAVA Script.md

Lessons
java offers automatic memory management.
completely object oriented
JVM is powerful
Byte code is platform independent - mobiles , devices
Bytecode runs in jvm

good parts :
java offers backward compatibility - even previous versions can run on latest version .
example code of 1.4 version will run on 1.8 vesrion automatically
java does not implement latest advances of computer science



bad parts
java does not have state of the art features computer science.
not functional , it uses threads whereas STM is latest tech for concurrency, Better type systems exist.
no type inference
semicolon at end of line
no way to control side effects
how to overcome the bad parts - scala , jruby , frege

Lets start Java.
in java functions are called methods
---psvm example goes here 
inside main try these
int a-b = 0;
int assert = 0;

above errors were compile time errors
int a = 10,b = 0;
sop(a/b)
exception - run time error
try{
		System.out.println(a/b);
	}
	catch(Exception e)
		{

		}

//TODO - try maybe type here.

excercise
omit each word of psvm and see if it is a compile time error or runtime error

Quiz - what happens at compile and runtime for 
public class Hello {
   public static void main() {
      System.out.println("Doesn't execute");   
   }
}
set - {1,2,3,4} 
not a set {1,2,2,3,4}
A data type is a set of values and a set of operations defined on them  
http://introcs.cs.princeton.edu/java/11cheatsheet/images/built-in.png

        int a = 10,b = 0;
		int c = a+b;
		String as ,bs;
		as = "10";
		bs = "0";
		System.out.println(c);
		System.out.println(as+bs);
		System.out.println(as+bs+c);
		
		//no strong type checking

//no type inference 
a = 10;
doesnt work in other languages.


we can convert from string to any type -     
double b = Double.parseDouble(args[0]);


you can give int where Integer is needed
		int a = (int)2.2;
		Integer i = 5;
		Integer j = a;
		int k = j //unboxing
		System.out.println("Hello Karan"+a+i+j);
		
		Integer theObject = new Integer(2);
		Integer aObject = 2; //autoboxing
		int a = aObject.intValue(); //unboxing
		System.out.println(a);
		System.out.println(aObject);
		System.out.println(theObject);
http://www.javatpoint.com/autoboxing-and-unboxing

http://stackoverflow.com/questions/13098143/why-does-the-behavior-of-the-integer-constant-pool-change-at-127

valueof
intvalue

int a = 5  // a is a data type , a is not an object
	Integer a = 5 // a is object .

	Integer a = new Integer(5)
	Integer b = new Integer(5)//2 objects are created

	Integer aobj = 128;//autoboxing - compiler is automatically converting int type to integer
	Integer b = 128;
	int at = aobj  //unboxing
	int at = Integer.parseInt


	//2 objects are created
	//127 , 1024

	lhs == rhs
	lhs and rhs are same objects

	// comparing objects - dont use == , use equals method