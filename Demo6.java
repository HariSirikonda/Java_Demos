//Encapsulation
public class Demo6 {
    private String firstName;
    private String lastname;
    private String email;
    private String phno;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public static void main(String[] args) {
        Demo6 obj = new Demo6();
        obj.setFirstName("Hari");
        obj.setLastname("Sirikonda");
        obj.setEmail("harisirikonda22@gmail.com");
        obj.setPhno("8790414384");
        String fullName = obj.getFirstName() + " " + obj.getLastname();
        System.out.println("Full Name : " + fullName);
        System.out.println("Email : " + obj.getEmail());
        System.out.println("Phone Number : " + obj.getPhno());
    }
}
