public class Loops {
    void squarePattern(int side){
        for(int i=0; i<side; i++){
            for(int j=0; j<side; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    void squareWithDigits(int side){
        for(int i=1; i<=side; i++){
            for(int j=1; j<=side; j++){
                System.out.print(i+" ");
            }
            System.out.print("\n");
        }
    }
    void rightTriangle(int side){
        for(int i=0; i<side; i++){
            for(int j=0; j<side; j++){
                if(i>=j){
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }
    }
    void reverseleftTriangle(int side){
        for(int i=0; i<side; i++){
            for(int j=0; j<side; j++){
                if(i<=j){
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args){
        Loops obj = new Loops();
        obj.squareWithDigits(5);
    }
}
