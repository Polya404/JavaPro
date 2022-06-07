package lesson06;

public class SubscriberServiceImpl implements SubscriberService {
    @Override
    public void timeForLocalCalls(Subscriber[] subscribers, double time) {
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getCallsWithinTheCity() > time) {
                System.out.println(subscriber);
            }
        }
    }

    @Override
    public void subscribersWhoUsedLongDistanceCommunication(Subscriber[] subscribers) {
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getInternationalCalls() != 0) {
                System.out.println(subscriber);
            }
        }
    }

    @Override
    public void subscriberInformation(String firstLetter) {
        for (Subscriber subscriber : DataGeneration.getSubscriber()) {
            if (subscriber.getLastName().startsWith(firstLetter)) {
                System.out.println(subscriber.getFirstName() + " " + subscriber.getLastName() + " " + subscriber.getPatronymic() + " " + subscriber.getBalance());
            }
        }
    }


    @Override
    public double totalInternetTrafficConsumption(String city) {
        double sum = 0;
        for (Subscriber subscriber : DataGeneration.getSubscriber()) {
            if (subscriber.getCity().equals(city)) {
                sum += subscriber.getInternetTraffic();
            }
        }
        System.out.print("Gb: ");
        return sum;
    }

    @Override
    public int negativeBalance(Subscriber[] subscribers) {
        int count = 0;
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getBalance() < 0) {
                System.out.println(subscriber);
                count++;
            }
        }
        return count;
    }
}
