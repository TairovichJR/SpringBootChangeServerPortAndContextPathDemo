package com.infotech.app;

import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.stereotype.Component;

@Component
public class EmbeddedServletContainerCustomizerBean implements WebServerFactoryCustomizer
<ConfigurableServletWebServerFactory>{

	@Override
	public void customize(ConfigurableServletWebServerFactory factory) {
		factory.setPort(8088);
		factory.setContextPath("/newvalue");
		
	}

}
