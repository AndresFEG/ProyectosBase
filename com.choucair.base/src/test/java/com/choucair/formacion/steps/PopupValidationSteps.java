package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.ColorlibLoginPage;

import net.thucydides.core.annotations.Step;

public class PopupValidationSteps {
	
	ColorlibLoginPage  ColorlibLoginPage;
	
	@Step
	
	public void login_colorlib(String strUsuario, String strPass)
	{
		ColorlibLoginPage.open();
		ColorlibLoginPage.IngresarDatos(strUsuario,strPass);
		ColorlibLoginPage.VefificaHome();	
	}
}
