
/*
 * generated by Xtext
 */
 
package org.xtext.enlightenment;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IExecutableExtensionFactory;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * generated
 */
public class EdjeExecutableExtensionFactory implements IExecutableExtensionFactory, IExecutableExtension {

	private Logger log = Logger.getLogger(EdjeExecutableExtensionFactory.class);
	private String clazzName;
	private IConfigurationElement config;

	public void setInitializationData(IConfigurationElement config, String propertyName, Object data)
		throws CoreException {
		if (data instanceof String) {
			clazzName = (String) data;
			this.config = config;
		}
		else {
			throw new IllegalArgumentException("couldn't handle passed data : "+data);
		}
	}
	
	public Object create() throws CoreException {
		org.xtext.enlightenment.internal.EdjeActivator instance = org.xtext.enlightenment.internal.EdjeActivator.getInstance();
		if (instance == null)
			throw new IllegalStateException("The bundle has not yet been activated. Make sure the Manifest.MF contains 'Bundle-ActivationPolicy: lazy'.");
		Bundle bundle = instance.getBundle();
		try {
			final Class<?> clazz = bundle.loadClass(clazzName);
			final Injector injector = org.xtext.enlightenment.internal.EdjeActivator.getInstance().getInjector("org.xtext.enlightenment.Edje");
			final Object result = injector.getInstance(clazz);
			if (result instanceof IExecutableExtension)
				((IExecutableExtension) result).setInitializationData(config, null, null);
			return result;
		}
		catch (Exception e) {
			log.error(e);
			throw new CoreException(new Status(Status.ERROR, bundle.getSymbolicName(), e.getMessage(),e));
		}
	}
}
