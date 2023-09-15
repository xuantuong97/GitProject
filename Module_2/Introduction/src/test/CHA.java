package test;

public class CHA {
  private String name = "tuong";
  private int age = 1;

  private int id = 0;

  public CHA(){};

    public CHA(String name,int id, int age ) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "n = "+name + "a="+age + "id = " +id;
    }
}
