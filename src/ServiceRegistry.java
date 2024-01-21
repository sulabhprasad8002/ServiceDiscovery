import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ServiceRegistry {
    private final Map<String, String> registry = new ConcurrentHashMap<>();

    public void registerService(String serviceName, String serviceUrl) {
        registry.put(serviceName, serviceUrl);
    }

    public String getServiceUrl(String serviceName) {
        return registry.get(serviceName);
    }
}
