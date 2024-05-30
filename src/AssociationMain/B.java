package AssociationMain;

public class B 
{
     // Thuộc tính name
    private String name;

    // Constructor không đối số
    public B() {
         // Khởi tạo thuộc tính name
         this.name = "DefaultB";
    }

     // Phương thức in tên
     public void printName() {
         System.out.println("Name: " + name);
     }

     // Getter và Setter cho thuộc tính name nếu cần thiết
     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }
}
