package lesson06;

public class DataGeneration {
    public static Subscriber[] getSubscriber() {
        Subscriber[] subscribers = new Subscriber[12];
        subscribers[0] = new Subscriber(1, "Nikolay", "Ivanov", "Alexeevich", "Odessa", "3807835672", "123-45", 76.3, 103, 30, 2.5);
        subscribers[1] = new Subscriber(2, "Sergey", "Gagarin", "Dmitrievich", "Odessa", "3803535772", "123-46", 77.5, 150, 0, 2.0);
        subscribers[2] = new Subscriber(3, "Illya", "Petrov", "Olegovich", "Kyiv", "3807839072", "123-47", 176.0, 150, 15, 1.5);
        subscribers[3] = new Subscriber(4, "Maxim", "Malyshev", "Nikolaevich", "Kharkow", "3807120972", "123-48", -16.7, 100, 0, 3.5);
        subscribers[4] = new Subscriber(5, "Ivan", "Fedorov", "Alexandrovich", "Kyiv", "3807847572", "123-49", 36.2, 60, 20, 3.0);
        subscribers[5] = new Subscriber(6, "Stepan", "Hrozny", "Alexeevich", "Lvov", "3807935687", "124-45", 138.1, 80, 0, 4.0);
        subscribers[6] = new Subscriber(7, "Fedor", "Sidorov", "Leonidovich", "Odessa", "3807835152", "125-45", 54.3, 140, 0, 2.5);
        subscribers[7] = new Subscriber(8, "Kirill", "Lubimov", "Nikolaevich", "Lvov", "380724795832", "126-45", 120.8, 10, 10, 3.0);
        subscribers[8] = new Subscriber(9, "Andrey", "Makarov", "Dmitrievich", "Kharkow", "380786350097", "127-45", -12.8, 15, 20, 2.5);
        subscribers[9] = new Subscriber(10, "Yriy", "Stepko", "Olegovich", "Lvov", "380786460087", "128-45", 67.7, 80, 25, 2.0);
        subscribers[10] = new Subscriber(11, "Oleg", "Zaharov", "Alexeevich", "Kyiv", "380786211236", "129-45", 89.0, 130, 0, 4.0);
        subscribers[11] = new Subscriber(12, "Leonid", "Korol", "Alexandrovich", "Kharkow", "380786447700", "126-50", -23.7, 90, 15, 3.5);
        return subscribers;
    }
}
