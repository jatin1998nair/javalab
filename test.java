class bank
{
int getrateofintrest()
{
return 0;
}}
class SBI extends bank
{
int getrateofintrest()
{
return 8;
}
}
class ICICI extends bank
{
int getrateofintrest()
{return 7;
}}
class AXIS extends bank
{
int getrateofintrest()
{
return 9;
}
}
class test{
public static void main(String[] args)
{
SBI s= new SBI();
ICICI i= new ICICI();
AXIS a= new AXIS();
System.out.println("SBI RateofIntrest"+s.getrateofintrest());
System.out.println("ICICI RateofIntrest"+i.getrateofintrest());
System.out.println("AXIS RateofIntrest"+a.getrateofintrest());
}
}
