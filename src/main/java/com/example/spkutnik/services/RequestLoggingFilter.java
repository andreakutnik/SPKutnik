import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class RequestLoggingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Initialization code, if needed
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        // Log request information before the request is processed

        System.out.println("Request received at: " + System.currentTimeMillis());

        // Continue with the filter chain
        chain.doFilter(request, response);

        // Log response information after the request has been processed
        System.out.println("Response sent at: " + System.currentTimeMillis());
    }

    @Override
    public void destroy() {
        // Cleanup code, if needed
    }
}
