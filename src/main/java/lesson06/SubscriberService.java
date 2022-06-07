package lesson06;

public interface SubscriberService {
    void timeForLocalCalls(Subscriber[] subscribers, double time);

    void subscribersWhoUsedLongDistanceCommunication(Subscriber[] subscribers);

    void subscriberInformation(String firstLetter);

    double totalInternetTrafficConsumption(String city);

    int negativeBalance(Subscriber[] subscribers);
}
