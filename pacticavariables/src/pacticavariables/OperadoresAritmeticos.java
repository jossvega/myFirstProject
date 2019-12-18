package pacticavariables;


public class OperadoresAritmeticos {
    
    
    public static void main(String[] args) {
        operadoresAritmeticos();
        operadoresRelacionales();
        operadoresLogicos();
        
        
    }
    public static void operadoresAritmeticos (){
        System.out.println("."); 
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25; 

        System.out.println("a+b=" + (a + b));
        System.out.println("a-b=" + (a - b));
        System.out.println("a*b=" + (a * b));
        System.out.println("b/a=" + (b / a));
        System.out.println("d%a=" + (d % a));
        System.out.println("d%b=" + (d % b));
        System.out.println("c++=" + (++c));
        System.out.println("b--=" + (--b));
        System.out.println("d--=" + (--d));
        


        String alejojocelyn = "ale" + "joss";
        
        String ale= "ALE";
        String joss="JOS";
        
        System.out.println("ale+joss="+(ale+joss));       

        
    }
    public static void operadoresRelacionales(){
        System.out.println("."); 
        int a=110;
        int b=20;
        System.out.println("a==b="+(a==b));
        System.out.println("a!=b="+(a!=b));
        System.out.println("a>b="+(a>b));
        System.out.println("a<b="+(a<b));
        System.out.println("b>=a="+(b>=a));
        System.out.println("b<=a="+(b<=a));
    
    } 
    public static void operadoresLogicos(){
        System.out.println(".");   
     boolean v=true;
     boolean f=false;
        System.out.println("v&&f="+(v&&f));
        //falso
        System.out.println("v||f="+(v||f));
        //verdadero
        System.out.println("!(v&&f)="+!(v&&f));
        //verdadero
    }
    


}
