package io.turntabl.springweb;

import io.turntabl.springweb.Models.Maths;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class SpringWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebApplication.class, args);
	}

	@Bean
	public Maths getCalculation(){
		return new Maths();
	}
//	public void testLessThanZero() {
//		boolean result = Numbers.isGreaterThanZeroAndLessThanAThousand(-1);
//		assertFalse(result);
//	}

}
