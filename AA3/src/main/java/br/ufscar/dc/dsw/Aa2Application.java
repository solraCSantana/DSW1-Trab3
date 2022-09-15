package br.ufscar.dc.dsw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import br.ufscar.dc.dsw.domain.*;
import br.ufscar.dc.dsw.dao.*;

@SpringBootApplication
public class Aa2Application {

	public static void main(String[] args) {
		SpringApplication.run(Aa2Application.class, args);
	}


	@Bean
	public CommandLineRunner demo(UserDAO usuarioDAO, ProfessionalDAO locadoraDAO, BCryptPasswordEncoder encoder) {
		return (args) -> {


			User user = new User();
			user.setUsername("admin");
			user.setName("admin");
			user.setEmail("admin@gmail.com");
			user.setPassword(encoder.encode("admin"));
			user.setRole("ADMIN");
			user.setEnabled(true);
			usuarioDAO.save(user);

			byte[] ba2 = {1,2,3,4,5};
			Professional professional1 = new Professional();
			professional1.setUsername("professional1");
			professional1.setName("Carlos santana");
			professional1.setPassword(encoder.encode("123"));
			professional1.setRole("PROF");
			professional1.setCpf("12345678900");
			professional1.setEmail("cs@gmail.com");
			professional1.setExpertise("Psicologia pediatrica");
			professional1.setKnowledgeArea("Psicologia");
			professional1.setQualifications(ba2);
			professional1.setEnabled(true);
			professional1.setFilename("baixar");
			usuarioDAO.save(professional1);

			Professional professional2 = new Professional();
			professional2.setUsername("professional2");
			professional2.setName("Pedro isaia");
			professional2.setPassword(encoder.encode("123"));
			professional2.setRole("PROF");
			professional2.setCpf("12345678901");
			professional2.setEmail("pi@gmail.com");
			professional2.setExpertise("Pediátrica");
			professional2.setKnowledgeArea("Medicina");
			professional2.setEnabled(true);
			professional2.setFilename("baixar");
			usuarioDAO.save(professional2);
			
			Professional professional3 = new Professional();
			professional3.setUsername("professional3");
			professional3.setName("Sona eveningstart");
			professional3.setPassword(encoder.encode("123"));
			professional3.setRole("PROF");
			professional3.setCpf("12345678902");
			professional3.setEmail("sn@gmail.com");
			professional3.setExpertise("Criminal");
			professional3.setKnowledgeArea("Advocacia");
			//professional3.setQualifications("baixar");
			professional3.setEnabled(true);
			professional3.setFilename("baixar");
			usuarioDAO.save(professional3);

			
			Client client1 = new Client();
			client1.setUsername("client1");
			client1.setName("Carlos santana");
			client1.setPassword(encoder.encode("123"));
			client1.setRole("CLIENT");
			client1.setCpf("00000000000000");
			client1.setEmail("csclient@gmail.com");
			client1.setTelephone("99999999999");
			client1.setGender("M");
			client1.setBirthDate("2010-03-10");
			client1.setEnabled(true);
			usuarioDAO.save(client1);
			
			Client client2 = new Client();
			client2.setUsername("client2");
			client2.setName("Pedro isaia");
			client2.setPassword(encoder.encode("123"));
			client2.setRole("CLIENT");
			client2.setCpf("00000000000001");
			client2.setEmail("piclient@gmail.com");
			client2.setTelephone("99999999998");
			client2.setGender("M");
			client2.setBirthDate("2000-03-10");
			client2.setEnabled(true);
			usuarioDAO.save(client2);
		};
	}

}
