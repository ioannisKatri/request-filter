package com.requestfilter.utils.advices;

import com.requestfilter.models.SimpleRequest;
import com.requestfilter.controller.SimpleRequestController;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.RequestBodyAdvice;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Objects;

@ControllerAdvice(assignableTypes = {SimpleRequestController.class})
public class CustomRequestBodyAdvice implements RequestBodyAdvice {

    @Override
    public boolean supports(MethodParameter methodParameter, Type targetType, Class<? extends HttpMessageConverter<?>> aClass) {
        return methodParameter.getContainingClass() == SimpleRequestController.class
                && targetType.getTypeName().equals(SimpleRequest.class.getTypeName());
    }

    @Override
    public HttpInputMessage beforeBodyRead(HttpInputMessage httpInputMessage, MethodParameter methodParameter, Type type, Class<? extends HttpMessageConverter<?>> aClass) throws IOException {
        return httpInputMessage;
    }

    @Override
    public Object afterBodyRead(Object body, HttpInputMessage httpInputMessage, MethodParameter methodParameter, Type type, Class<? extends HttpMessageConverter<?>> aClass) {
        if (body instanceof SimpleRequest && Objects.requireNonNull(httpInputMessage.getHeaders().get("user-agent")).size() > 0) {
            List<String> userAgent = httpInputMessage.getHeaders().get("user-agent");
            SimpleRequest simpleRequest = (SimpleRequest) body;
            simpleRequest.setUserAgents(userAgent);
            return simpleRequest;
        }
        return body;
    }

    @Override
    public Object handleEmptyBody(Object o, HttpInputMessage httpInputMessage, MethodParameter methodParameter, Type type, Class<? extends HttpMessageConverter<?>> aClass) {
        return o;
    }
}
