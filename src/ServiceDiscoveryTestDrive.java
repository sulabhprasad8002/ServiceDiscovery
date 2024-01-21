public class ServiceDiscoveryTestDrive {
    public static void main(String[] args) {
        ServiceRegistry registry = new ServiceRegistry();

        Service service1 = new Service("Product Service", "example.com/products", registry);
        Service service2 = new Service("Order Service", "example.com/orders", registry);

        service1.register();
        service2.register();

        ServiceDiscovery serviceDiscovery = new ServiceDiscovery(registry);

        String productServiceUrl = serviceDiscovery.discoverService("Product Service");
        System.out.println("Discovered product service url " + productServiceUrl);
    }
}
