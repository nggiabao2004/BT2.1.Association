package AssociationMain;

public class AssociationMain {
    public static void main(String[] args) {
        // Tạo đối tượng B
        B b = new B();

        // Tạo đối tượng A với đối tượng B truyền vào
        A a = new A(b);

        // In thông tin của A và B
        a.print();
    }
}
