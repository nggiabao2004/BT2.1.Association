package AssociationMain;

public class A {
    // Thuộc tính name
    private String name;

    // Thuộc tính bRemote, là một đối tượng của lớp B
    private B bRemote;

    // Constructor không đối số
    public A() {
         // Khởi tạo thuộc tính name
        this.name = "DefaultA";
    }

    // Constructor với đối số là một đối tượng của lớp B
    public A(B bRemote) {
        this.bRemote = bRemote;
        this.name = "DefaultA";
    }

     // Phương thức in thông tin
    public void print() {
        System.out.println("Name: " + name);
        if (bRemote != null) {
             bRemote.printName();
        }
    }

     // Phương thức thiết lập đối tượng bRemote
    public void setBRemote(B bRemote) {
         this.bRemote = bRemote;
    }

     // Getter và Setter cho thuộc tính name nếu cần thiết
    public String getName() {
         return name;
    }

     public void setName(String name) {
         this.name = name;
    }
}
