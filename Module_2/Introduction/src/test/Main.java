package test;

public class Main {
    public static void main(String[] args) {
        Hinh h1 = new tron();

        Hinh h2 = new Tamgiac();

        Hinh h3 = new Chunhat();

        Hinh h5 = h1;
        Dagiac h4 = (Dagiac) h2;
        h2 = h3;
    }
}
