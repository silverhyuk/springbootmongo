package com.silverhyuk.springbootmongo;

import com.silverhyuk.springbootmongo.account.Account;
import com.silverhyuk.springbootmongo.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    @Autowired
    AccountRepository accountRepository;
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public ApplicationRunner applicationRunner() {
        return args -> {
            Account account = new Account();
            account.setEmail("silverhyuk11@gmail.com");
            account.setUsername("silverhyuk11");

            accountRepository.insert(account);

            System.out.println("finished");
        };
    }
}
