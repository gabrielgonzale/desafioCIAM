package config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

// TODO: Auto-generated Javadoc
/**
 * The Class GeneralInterceptor.
 */
@Component
public class GeneralInterceptor implements HandlerInterceptor {
	
	/** The log. */
	private final Logger LOG = LoggerFactory.getLogger(GeneralInterceptor.class);

	/**
	 * Pre handle.
	 *
	 * @param request the request
	 * @param response the response
	 * @param handler the handler
	 * @return true, if successful
	 * @throws Exception the exception
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		LOG.info("prehandle");
		
		return true;
	}

	/**
	 * Post handle.
	 *
	 * @param request the request
	 * @param response the response
	 * @param handler the handler
	 * @param modelAndView the model and view
	 * @throws Exception the exception
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		LOG.info("posthandle");
		
		
	}

	/**
	 * After completion.
	 *
	 * @param request the request
	 * @param response the response
	 * @param handler the handler
	 * @param ex the ex
	 * @throws Exception the exception
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		LOG.info("aftercompletion");
		
		// TODO Auto-generated method stub
		
	}
	

}
