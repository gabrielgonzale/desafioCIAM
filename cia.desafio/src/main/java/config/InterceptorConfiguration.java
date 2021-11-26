package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// TODO: Auto-generated Javadoc
/**
 * The Class InterceptorConfiguration.
 */
@Configuration
public class InterceptorConfiguration implements WebMvcConfigurer {
	
	/** The general interceptor. */
	@Autowired
	private GeneralInterceptor generalInterceptor;

	/**
	 * Adds the interceptors.
	 *
	 * @param registry the registry
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		registry.addInterceptor(generalInterceptor);
	}

	
}
