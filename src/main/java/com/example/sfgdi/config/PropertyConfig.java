package com.example.sfgdi.config;/* created by akshaypaswan on 17/01/21 */

import com.example.sfgdi.examplebeans.FakeDataSource;
import com.example.sfgdi.examplebeans.FakeJmsSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

    private final Environment env;

    @Value("${data.user}")
    String user;

    @Value("${data.password}")
    String password;

    @Value("${data.url}")
    String url;

    @Value("${data.jms.user}")
    String jmsUser;

    @Value("${data.jms.password}")
    String jmsPassword;

    @Value("${data.jms.url}")
    String jmsUrl;

    public PropertyConfig(Environment env) {
        this.env = env;
    }

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        //fakeDataSource.setUser(user);
        fakeDataSource.setUser(env.getProperty("USERNAME"));
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsSource fakeJmsSource(){
        FakeJmsSource fakeJmsSource = new FakeJmsSource();
        fakeJmsSource.setUser(jmsUser);
        fakeJmsSource.setPassword(jmsPassword);
        fakeJmsSource.setUrl(jmsUrl);
        return fakeJmsSource;
    }

    //required to load property source
    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
