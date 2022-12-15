package plus.wcj.security.annotation;

import lombok.Data;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author changjin wei(魏昌进)
 * @since 2022/12/15
 */
@Data
@ConfigurationProperties(prefix = "security.ignoring")
public class IgnoreWebSecurityProperties {
    /**
     * 需要忽略的 URL 格式，不考虑请求方法
     */
    private String[] pattern = {};

    /**
     * 需要忽略的 GET 请求
     */
    private String[] get = {};

    /**
     * 需要忽略的 POST 请求
     */
    private String[] post = {};

    /**
     * 需要忽略的 DELETE 请求
     */
    private String[] delete = {};

    /**
     * 需要忽略的 PUT 请求
     */
    private String[] put = {};

    /**
     * 需要忽略的 HEAD 请求
     */
    private String[] head = {};

    /**
     * 需要忽略的 PATCH 请求
     */
    private String[] patch = {};

    /**
     * 需要忽略的 OPTIONS 请求
     */
    private String[] options = {};

    /**
     * 需要忽略的 TRACE 请求
     */
    private String[] trace = {};
}