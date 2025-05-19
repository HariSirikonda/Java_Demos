package Day_6;
//User Defined Exception
class CheppanuException extends Exception{
    public CheppanuException(String message){
        super(message);
    }
}

public class Demo13 {
    public static void ageCheck(int age) throws CheppanuException {
        if(age>=18){
            throw new CheppanuException("Password cheppanu");
        }
        else{
            throw new CheppanuException("Sdauiiuiasd");
        }
    }
    public static void main(String[] args){
        try{
            ageCheck(20);
        }catch (CheppanuException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Happy coding");
        }
    }
}
