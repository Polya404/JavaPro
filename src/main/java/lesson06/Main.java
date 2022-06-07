package lesson06;

public class Main {
    public static void main(String[] args) {
        SubscriberServiceImpl service = new SubscriberServiceImpl();
        System.out.println("количество абонентов с отрицательны балансом");
        service.negativeBalance(DataGeneration.getSubscriber());
        System.out.println();
        System.out.println("сведения об абонентах ФИО, номер телефона, баланс у который первая бука фамилии передается как параметр");
        service.subscriberInformation("S");
        System.out.println();
        System.out.println("сведения об абонентах, которые пользовались междугородней связью;");
        service.subscribersWhoUsedLongDistanceCommunication(DataGeneration.getSubscriber());
        System.out.println();
        System.out.println("сведения об абонентах, у которых время внутригородских разговоров превышает заданное");
        service.timeForLocalCalls(DataGeneration.getSubscriber(), 120.8);
        System.out.println();
        System.out.println("суммарное потребление трафика интернета для определенного города");
        System.out.println(service.totalInternetTrafficConsumption("Lvov"));
    }
}
