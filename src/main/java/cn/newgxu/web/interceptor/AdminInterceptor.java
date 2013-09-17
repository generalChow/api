
package cn.newgxu.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 2013年9月17日
 *@user generalChow
 *@contact 463734522@qq.com
 */
public class AdminInterceptor implements HandlerInterceptor {



/* (non-Javadoc)
 * @see org.springframework.web.servlet.HandlerInterceptor#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
 */
public boolean preHandle(HttpServletRequest request,
		HttpServletResponse response, Object handler) throws Exception {
	// TODO Auto-generated method stub
	return false;
}

/* (non-Javadoc)
 * @see org.springframework.web.servlet.HandlerInterceptor#postHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, org.springframework.web.servlet.ModelAndView)
 */
public void postHandle(HttpServletRequest request,
		HttpServletResponse response, Object handler, ModelAndView modelAndView)
		throws Exception {
	// TODO Auto-generated method stub
	
}

/* (non-Javadoc)
 * @see org.springframework.web.servlet.HandlerInterceptor#afterCompletion(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, java.lang.Exception)
 */
public void afterCompletion(HttpServletRequest request,
		HttpServletResponse response, Object handler, Exception ex)
		throws Exception {
	// TODO Auto-generated method stub
	
}
}
