package org.zerock.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.zerock.sample"}) //Bean으로 만들었던 클래스를 주입해주는 설정-2
public class RootConfig {
	

}
