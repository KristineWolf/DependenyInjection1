public class Main {

    public static void main(String[] args) {
        ServiceB serviceB = new ServiceB();
        ServiceA serviceA = new ServiceA();
        CompositeService compositeService = new CompositeService(serviceA,serviceB);
        Client client = new Client(compositeService);
        client.printMessages();
    }
}

