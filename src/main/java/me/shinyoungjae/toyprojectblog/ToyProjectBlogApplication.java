package me.shinyoungjae.toyprojectblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ToyProjectBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(ToyProjectBlogApplication.class, args);
    }
}
