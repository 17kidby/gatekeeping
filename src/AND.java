public class AND extends Gate{

    public AND(boolean A, boolean B, String name) {
        super(A, B, name);
    }

    public boolean gate(){
        if (inputA && inputB ==true){
            return true;
        }else{
            return false;
        }
    }

    public void truthTable(){
        System.out.println("A B Q");
        System.out.print("F F ");
        input(false, false);
        System.out.println(gate());
        System.out.print("F T ");
        input(false, true);
        System.out.println(gate());
        System.out.print("T F ");
        input(true, false);
        System.out.println(gate());System.out.print("F F ");
        input(true, true);
        System.out.println(gate());

    }





}
