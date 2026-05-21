public class Main {

    public static void main(String[] args) {

        Hotel hotel = new Hotel(
                "Royal Hotel",
                "вул. Шевченка 15"
        );

        hotel.showHotel();

        Employee employee = new Employee(
                "Ігор Олегович",
                "Administrator",
                "+380992222222"
        );

        Client client = new Client(
                "Андрій Олександрович",
                "+380671111111",
                "client@gmail.com"
        );

        employee.workWithClient(client);
        hotel.addEmployee(employee);

        hotel.addRoom(101, "Lux");

        Client.Passport passport = new Client.Passport("123422");

        passport.showPassport();

        class Booking {

            public void createBooking() {
                System.out.println(
                        client.getName() +
                                " booked a hotel room."
                );
            }
        }

        Booking booking = new Booking();
        booking.createBooking();
    }
}