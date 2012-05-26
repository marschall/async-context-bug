package com.github.marschall.async_context_bug;

import java.io.IOException;

import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BugServlet extends HttpServlet {
    
    public void init() throws ServletException {
        new AsyncListener() {
            
            public void onTimeout(AsyncEvent event) {
            }
            
            public void onStartAsync(AsyncEvent event) {
            }
            
            public void onError(AsyncEvent event) {
                
            }
            
            public void onComplete(AsyncEvent event) {
            }
        };
    }
    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().write("OK");
    }

}
