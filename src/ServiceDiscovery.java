public class ServiceDiscovery {
    private final ServiceRegistry registry;

    public ServiceDiscovery(ServiceRegistry registry) {
        this.registry = registry;
    }

    public String discoverService(String serviceName) {
        return this.registry.getServiceUrl(serviceName);
    }
}
