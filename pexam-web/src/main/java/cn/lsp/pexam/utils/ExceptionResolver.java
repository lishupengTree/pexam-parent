package cn.lsp.pexam.utils;

import org.apache.log4j.Logger;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Properties;

/**
 * @author lishupeng
 * @create 2017-09-05 下午 11:01
 **/
public class ExceptionResolver extends ExceptionHandlerExceptionResolver {
    private final Logger logger = Logger.getLogger(ExceptionResolver.class);

    private static final int DEFAULT_CODE = 3333;

    private static final String DEFAULT_MSG = "未知异常，请联系后台管理员处理";

    private static final int EXP_LENGTH = 200;

    private static final String SPLIT_STR = "#";

    /**
     * 自定义非med异常映射处理  key="异常类全名" value="code#msg"
     */
    private Properties excpMappings;
//
//    /**
//     * json消息转换器
//     **/
//    private HttpMessageConverter<Reply> messageConverter;
//
//    public void setMessageConverter(HttpMessageConverter<Reply> messageConverter) {
//        this.messageConverter = messageConverter;
//    }
//
//    public void setExcpMappings(Properties excpMappings) {
//        this.excpMappings = excpMappings;
//    }
//
//    @Override
//    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
//
//        logger.error("<<<<<<<<捕获异常###", ex);
//
//        ModelAndView mav = new ModelAndView();
//
//        //http消息转换包装类
//        HttpOutputMessage outputMessage = new ServletServerHttpResponse(response);
//
//        Reply reply = genReply(ex);
//        try {
//            messageConverter.write(reply, MediaType.APPLICATION_JSON, outputMessage);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return mav;
//    }
//
//    /**
//     * 查找匹配的key-val 在sxceptionMappings;exception exception和RuntimeException不允许定义
//     *
//     * @return
//     */
//    private <T> String findMathcPropVal(Class<T> clazz) {
//        String key = clazz.getName();
//        if (Exception.class.getName().equals(key) || RuntimeException.class.getName().equals(key)) {
//            return null;
//        }
//        String val = excpMappings.getProperty(key);
//        if (StringUtils.isEmpty(val)) {
//            val = findMathcPropVal(clazz.getSuperclass());
//        }
//        return val;
//    }
//
//    /**
//     * 生成响应需要的 reply
//     *
//     * @return
//     */
//    private Reply genReply(Exception ex) {
//        Reply reply = new Reply();
//        //hug类及子类异常处理
//        if (IHugException.class.isAssignableFrom(ex.getClass())) {
//            IHugException medEx = (IHugException) ex;
//            reply.setRes(medEx.getErrorCode());
//            reply.setMsg(medEx.getMsg());
//            return reply;
//        }
//        //默认异常显示
//        reply.setRes(DEFAULT_CODE);
//        reply.setMsg(DEFAULT_MSG);
//        String data = ex.toString();
//        data = data.length() < EXP_LENGTH ? data : data.substring(0, EXP_LENGTH);
//        reply.setData(data);
//        logger.info("异常类型为:" + ex.getClass().getName());
//        return reply;
//    }

}
