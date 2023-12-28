package pl.com.wpi.ldapcrudmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.autoconfigure.domain.EntityScan;
// import org.springframework.boot.autoconfigure.domain.EnableJpaRepositories;

@SpringBootApplication
// @EntityScan(basePackages = "pl.com.wpi.ldapcrudmanager.model")
// @EnableJpaRepositories(basePackages = "pl.com.wpi.ldapcrudmanager.repository")

public class LdapCrudManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LdapCrudManagerApplication.class, args);
	}

}
