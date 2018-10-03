interface student
{
void rollno();
void name();
void branch();
}
class student1 implements student
{
public void rollno()
{
System.out.println("1234");
}
public void name()
{
System.out.println("abc");
}
public void branch()
{
System.out.println("CSE");
}
}
class student2 implements student
{
public void rollno()
{
System.out.println("567");
}
public void name()
{
System.out.println("def");
}
public void branch()
{
System.out.println("ECE");
}
public static void main (String[] args)
{
student2 s =new student2();
System.out.println("roll no");
s.rollno();
System.out.println("name");
s.name();
System.out.println("branch");
s.branch();
}
}

