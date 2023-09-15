package test;

public class c extends  CHA{
    c(){};
    c(int id,int Age,String name ){
        super(name, Age, id);
    }

    public static void main(String[] args) {
        c newCon = new c();
        System.out.println(newCon);

        c Con = new c();

    }
}
