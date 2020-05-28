package sbnz.blisskin;

import org.kie.api.KieServices;
import org.kie.api.builder.KieScanner;
import org.kie.api.runtime.KieContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class SampleApp {

	private static Logger log = LoggerFactory.getLogger(SampleApp.class);

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SampleApp.class, args);
	}

//	@Bean
//	public KieContainer kieContainer() {
//		KieServices ks = KieServices.Factory.get();
//		KieContainer kContainer = ks
//				.newKieContainer(ks.newReleaseId("sbnz.blisskin", "blisskin-kjar", "0.0.1-SNAPSHOT"));
//		KieScanner kScanner = ks.newKieScanner(kContainer);
//		kScanner.start(10_000);
//		return kContainer;
//	}
}
