//package com.boot.config;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.MediaType;
//import org.springframework.http.converter.HttpMessageConverter;
//import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
//
//@Configuration
//public class JsonConfig {
//
//	@Bean
//    public HttpMessageConverters fastJsonHttpMessageConverters() {
//
//		MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
//        
//        List<MediaType> supportedMediaTypes =new ArrayList<MediaType>();
//        supportedMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
//        supportedMediaTypes.add(MediaType.APPLICATION_XML);
//        supportedMediaTypes.add(MediaType.APPLICATION_OCTET_STREAM);
//        supportedMediaTypes.add(MediaType.MULTIPART_FORM_DATA); 
//        
//        jsonConverter.setSupportedMediaTypes(supportedMediaTypes);
//     
//        HttpMessageConverter<?> converter = jsonConverter;
//        return new HttpMessageConverters(converter);
//     }
//}
