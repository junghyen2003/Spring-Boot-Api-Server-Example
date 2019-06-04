package com.springboot.oauth.apiserver;

import com.springboot.oauth.apiserver.dao.Node;
import com.springboot.oauth.apiserver.repository.NodeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

import javax.sql.DataSource;

// API 서버 인증 & OAuth2 권한 서버
@SpringBootApplication
public class ApiserverApplication {

    @Bean
    public CommandLineRunner commandLineRunner(NodeRepository nodeRepository){
        return args ->{
            nodeRepository.save(new Node("node_name_1","node_info_1","node_value_1"));
            nodeRepository.save(new Node("node_name_2","node_info_2","node_value_2"));
            nodeRepository.save(new Node("node_name_3","node_info_3","node_value_3"));
        };
    }

    @Bean
    public TokenStore JdbcTokenStore(DataSource dataSource) {
        return new JdbcTokenStore(dataSource);
    }

    public static void main(String[] args) {
        SpringApplication.run(ApiserverApplication.class, args);
    }

}
