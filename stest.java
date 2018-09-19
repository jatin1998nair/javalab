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

class stest{
public static void main(String[] args)
{
SBI s= new SBI();

System.out.println("SBI RateofIntrest"+s.getrateofintrest());
}
}
