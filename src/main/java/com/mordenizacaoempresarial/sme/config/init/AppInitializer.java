package com.mordenizacaoempresarial.sme.config.init;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.mordenizacaoempresarial.sme.config.WebConfig;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { WebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" }; // TUDO DEPOIS DO NOME DA APLICAÇÃO, SERÁ MONITORADO PARA O DISPACTHER SERVLET
	}

}
