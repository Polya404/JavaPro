package lesson06;

public class Subscriber {
    private int id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String city;
    private String phoneNumber;
    private String contractNumber;
    private double balance;
    private int callsWithinTheCity;
    private int internationalCalls;
    private double internetTraffic;

    public Subscriber(int id, String firstName, String lastName, String patronymic, String city, String phoneNumber, String contractNumber, double balance, int callsWithinTheCity, int internationalCalls, double internetTraffic) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.contractNumber = contractNumber;
        this.balance = balance;
        this.callsWithinTheCity = callsWithinTheCity;
        this.internationalCalls = internationalCalls;
        this.internetTraffic = internetTraffic;
    }

    public Subscriber() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCallsWithinTheCity() {
        return callsWithinTheCity;
    }

    public void setCallsWithinTheCity(int callsWithinTheCity) {
        this.callsWithinTheCity = callsWithinTheCity;
    }

    public int getInternationalCalls() {
        return internationalCalls;
    }

    public void setInternationalCalls(int internationalCalls) {
        this.internationalCalls = internationalCalls;
    }

    public double getInternetTraffic() {
        return internetTraffic;
    }

    public void setInternetTraffic(double internetTraffic) {
        this.internetTraffic = internetTraffic;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", city='" + city + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", contractNumber='" + contractNumber + '\'' +
                ", balance=" + balance +
                ", callsWithinTheCity=" + callsWithinTheCity +
                ", internationalCalls=" + internationalCalls +
                ", internetTraffic=" + internetTraffic +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
