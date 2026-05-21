public class Employee {

    private String fullName;
    private String position;
    private String phone;

    public Employee(String fullName, String position, String phone) {
        this.fullName = fullName;
        this.position = position;
        this.phone = phone;
    }

    public void workWithClient(Client client) {
        System.out.println(fullName + " helps client " + client.getName());
    }
}