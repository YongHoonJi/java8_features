package com.java8.features.predate;
import java.util.ServiceLoader;

public abstract class ServiceProvider {

	public static ServiceProvider getDefault() {

		// load our plugin with the default system class loader
		ServiceLoader<ServiceProvider> serviceLoader = ServiceLoader.load(ServiceProvider.class,
				ClassLoader.getSystemClassLoader());

		// checking if load was successful
		for (ServiceProvider provider : serviceLoader) {
			return provider;
		}
		throw new Error("Something is wrong with registering the addon");
	}

	public abstract String getMessage();

	public static void main(String[] ignored) {
		// create a new provider and call getMessage()
		ServiceProvider provider = ServiceProvider.getDefault();
		System.out.println(provider.getMessage());
	}
}