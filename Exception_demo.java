class MyException extends Exception{
private int detail;
MyException(int a){
detail=a;
}
public string toString(){
return "MyException"+detail;
}
}


class Exception_demo{
static void compute(int a) throws MyException{
System.out.println("compute called"+a);
if(a>10){
throw new MyException(a);
System.out.println("exited normaly")

}
}
public static void main (String args[]){
try{
compute(1);
compute(20);
}catch(MyException e){
System.out.println("caught"+e);
}
}
}
