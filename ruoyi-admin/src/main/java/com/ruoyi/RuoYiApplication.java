package com.ruoyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;


@EnableCaching
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class RuoYiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RuoYiApplication.class, args);
		System.out.println("(♥◠‿◠)ﾉﾞ  若依启动成功   ლ(´ڡ`ლ)ﾞ  ");
		System.out.println("  __                                    __                 __   \n" +
				"_/  |_  ____ _____    _____     _______/  |______ ________/  |_ \n" +
				"\\   __\\/ __ \\\\__  \\  /     \\   /  ___/\\   __\\__  \\\\_  __ \\   __\\\n" +
				" |  | \\  ___/ / __ \\|  Y Y  \\  \\___ \\  |  |  / __ \\|  | \\/|  |  \n" +
				" |__|  \\___  >____  /__|_|  / /____  > |__| (____  /__|   |__|  \n" +
				"           \\/     \\/      \\/       \\/            \\/             ");
	}
}
