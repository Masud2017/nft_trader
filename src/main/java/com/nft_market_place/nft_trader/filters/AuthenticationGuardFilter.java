package com.nft_market_place.nft_trader.filters;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.servlet.function.ServerRequest;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@Component
@Order(1)
public class AuthenticationGuardFilter extends OncePerRequestFilter {
    @Autowired
    private List<String> exclusionUrlList;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String urlPath =request.getRequestURL().toString();
        String endpoint = urlPath.substring(urlPath.lastIndexOf("/"));

        if (this.shouldIgnoreUrl(endpoint)) {
            filterChain.doFilter(request, response);
        } else {
            String jwtToken = request.getHeader("Authorization");
            if (jwtToken == null) {
                response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
                response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "You are not authorized.\nYou are not authorized to make this call. At first please authenticate.");
            }
            filterChain.doFilter(request, response);
        }
    }

    private boolean shouldIgnoreUrl(String endPoint){
        return this.exclusionUrlList != null && this.exclusionUrlList.contains(endPoint);
    }
}
