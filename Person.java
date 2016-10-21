 public class Person{
 	int age ;
 	char Gender1;

public static void main (String[] args){
String name1 = "karan";  //int is a type,Integer is a wrapper class- object
String name2 = "karan";
//System.out.println(name1==name2);
//System.out.println(name1.equals(name2));
//TRUE 
String fullname = "karan ahuja"; //object is created in string pool
String myname = "karan"+" ahuja";//does not create new object
//System.out.println(fullname==myname);
//System.out.println(fullname.equals(myname));
//true
String fullname_ = "karan ahuja";//object is created in string pool
String firstname = "karan";
String lastname = " ahuja";
String newfullname_ = firstname+lastname; // runtime , new object
//System.out.println(fullname_==newfullname_);
//System.out.println(fullname_.equals(newfullname_));
//false
/*output without equals:
true
true
false
*/
Integer i = 128;
Integer j = 128;
int i1 = i;
int j1 = j;
System.out.println(i == j);
System.out.println(i1 == j1);
System.out.println(i.equals(j));

















//output will be true 
//if value is same - only one pointer is created.
/*
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


	//string pool

*/





}
}

/*
public - anyone can run this program
class - all code in java must belong to a class
Person - name of this class
public -anyone can run this method
static - this method belongs to the class not the object
void - this method does not return anything
main - method name - first method executed when running a java program
String[] - array of strings - these are atguments of command line.
System.out.println - method name to print strings
Hello karan - parameter passed to method - string we want to print
*/


