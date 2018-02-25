package org.xtext.dsl.parafarmacia.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class ParafarmaciaHighlightingConfiguration implements IHighlightingConfiguration {
	public static final String NORMAL = "Texto por defecto";
	public static final String CADENA_TEXTO = "Cadena de texto";
	public static final String PALABRA_CLAVE = "Palabra clave"; 
	public static final String PALABRA_CLAVE_PRINCIPAL = "Palabra clave principal"; 

	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		incluirTipo(acceptor, NORMAL, new RGB(40, 40, 180), new RGB(255, 255, 255), SWT.NORMAL);
		incluirTipo(acceptor, CADENA_TEXTO, new RGB(140, 40, 180), new RGB(255, 255, 255), SWT.NORMAL);
		incluirTipo(acceptor, PALABRA_CLAVE, new RGB(10, 120, 4), new RGB(255, 255, 255), SWT.BOLD);
		incluirTipo(acceptor, PALABRA_CLAVE_PRINCIPAL, new RGB(8, 80, 8), new RGB(255, 255, 255), SWT.BOLD);
	}

	public void incluirTipo(IHighlightingConfigurationAcceptor acceptor, String s, RGB rgbD, RGB rgbT, int estilo) {
		TextStyle estiloTexto = new TextStyle();
		estiloTexto.setColor(rgbD);
		estiloTexto.setBackgroundColor(rgbT);
		estiloTexto.setStyle(estilo);

		acceptor.acceptDefaultHighlighting(s, s, estiloTexto);
	}
	
}