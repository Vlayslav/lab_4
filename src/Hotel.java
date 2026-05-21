import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private String address;

    private List<Employee> employees = new ArrayList<>();

    private List<Room> rooms = new ArrayList<>();
    public Hotel(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addRoom(int number, String type) {
        rooms.add(new Room(number, type));
    }

    public void showHotel() {
        System.out.println("Hotel: " + name);
        System.out.println("Address: " + address);
    }
    class Room {
        private int roomNumber;
        private String type;

        public Room(int roomNumber, String type) {
            this.roomNumber = roomNumber;
            this.type = type;
        }

        public void showRoom() {
            System.out.println("Room: " + roomNumber + ", type: " + type);
        }
    }
}