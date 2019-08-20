package com.example;

import java.util.List;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.io.Resource;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.example.interceptor.EncodingInterceptor;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages="com.example")
public class MyWebConfig implements WebMvcConfigurer {

	
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.configureMessageConverters(converters);
	}
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("login");
		//registry.addViewController("/login").setViewName("login");
		//registry.addViewController("/register").setViewName("register");
		
	}
	//∑√Œ ÃÌº”µƒhtml
		@Override
		public void addResourceHandlers(ResourceHandlerRegistry registry) {
			// TODO Auto-generated method stub
			registry.addResourceHandler("/**").addResourceLocations("/");
		}
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new EncodingInterceptor());
		LocaleChangeInterceptor lci =  
				new LocaleChangeInterceptor();
		lci.setParamName("lang");
		registry.addInterceptor(lci);
		
	}
	
	@Bean
	public LocaleResolver localeResolver() {
		CookieLocaleResolver r = 
				new CookieLocaleResolver();
		return r;
	}

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setViewClass(JstlView.class);
		vr.setPrefix("/");
		vr.setSuffix(".jsp");
		return vr;
	
	}
	
	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource ms = 
				new ReloadableResourceBundleMessageSource();
		ms.setBasename("classpath:messages");
		ms.setDefaultEncoding("utf-8");
		ms.setCacheSeconds(0);
		return ms;
	}
	
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource ds, 
			ApplicationContext context) throws Exception  {
		SqlSessionFactoryBean  bean = new SqlSessionFactoryBean(); 
		bean.setDataSource(ds);
		
		bean.setConfigLocation( 
				context.getResource("classpath:mybatis-config.xml")  );	
		
		return bean.getObject();
	}
	
	@Bean 
	public DataSource dataSource(ApplicationContext context) throws Exception {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		Resource r = context.getResource("classpath:config.properties");
		Properties pros = new Properties();
		pros.load(r.getInputStream());
		String driver = (String)pros.get("driver");
		String url = (String)pros.get("url");
		String user = (String)pros.get("user");
		String password = (String)pros.get("password");
		
		ds.setDriverClassName( driver );
		ds.setUsername( user );
		ds.setPassword( password );
		ds.setUrl( url );
		
		return ds;
	}
}
