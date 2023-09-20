package javaders.day37exceptionsenums;

public class IllegalAgeException extends RuntimeException{

    //olusturdugunuz class i RuntimeException in child i yaparsaniz o RuntimeException in cocugu olur
    //olusturdugunuz class i Exception in child i yaparsaniz o CompileTimeException in cocugu olur.

     /*
           1)Eger RunTime Exception uretmek isterseniz RunTimeException Class'a extend etmelisiniz
     */

    public IllegalAgeException(){
        super();
    }

    public IllegalAgeException(String message){
        super(message);
    }


}




