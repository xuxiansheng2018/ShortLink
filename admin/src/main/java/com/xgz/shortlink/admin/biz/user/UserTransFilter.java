package com.xgz.shortlink.admin.biz.user;

/**
 * @Author xuguozhu
 * @Create 2024/4/12 14:51
 * Level:
 * Description:
 */

import com.alibaba.fastjson2.JSON;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.io.IOException;

import static com.xgz.shortlink.admin.common.constant.RedisCacheConstant.USER_LOGIN_USERNAME_KEY;

/**
 * 用户信息传输过滤器
 */


@RequiredArgsConstructor
public class UserTransFilter implements Filter {
    private  final StringRedisTemplate stringRedisTemplate;

    // TODO: 2024/4/12 这里马哥路径写的有问题

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String username = httpServletRequest.getHeader("username");
        String token = httpServletRequest.getHeader("token");
        String requestURI = httpServletRequest.getRequestURI();

        Object jsonResult = stringRedisTemplate.opsForHash().get(USER_LOGIN_USERNAME_KEY + username, token);
        if (jsonResult != null) {
            UserInfoDTO userInfoDTO = JSON.parseObject(jsonResult.toString(), UserInfoDTO.class);
            UserContext.setUser(userInfoDTO);
        }
        try {
            if (requestURI == "/api/short-link/v1/group") {
                filterChain.doFilter(servletRequest, servletResponse);
                return;
            }
            filterChain.doFilter(servletRequest, servletResponse);
        } finally {
            UserContext.removeUser();
        }
    }
}