public class Main {

    public static void main(String[] args) {
        ServiceB serviceB = new ServiceB();
        ServiceA serviceA = new ServiceA();
        CompositeService compositeService = new CompositeService(serviceA,serviceB);
        compositeService.sendMessage();
    }
}

