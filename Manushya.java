import java.util.*;
public class Manushya 
{
int id;  
String name;  
Manushya(int id,String name)
{  
this.id=id;  
this.name=name;  
}  
}  
class Emp extends Manushya
{  
float salary;  
Emp(int id,String name,float salary)
{  
super(id,name);
//reusing parent constructor  
this.salary=salary;  
}  
void display()
{System.out.println(id+" "+name+" "+salary);}  
}  
class TestSuper5{  
public static void main(String[] args){  
Emp e1=new Emp(501,"Vishakha",50000f);  
e1.display();  
}
}
