public class Service {
    private final String name;
    private final String url;
    private final ServiceRegistry serviceRegistry;

    public Service(String name, String url, ServiceRegistry registry) {
        this.name = name;
        this.url = url;
        this.serviceRegistry = registry;
    }

    public void register() {
        serviceRegistry.registerService(name, url);
    }
}
