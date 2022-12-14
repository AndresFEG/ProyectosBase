package com.choucair.formacion.definition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import com.choucair.formacion.steps.*;


public class PopupValidationDefinition {
	@Steps
	PopupValidationSteps PopupValidationSteps;
	
	@Given("^Autentico en colorlib con usuario \"([^\"]*)\"  clave \"([^\"]*)\"$")
	public void autentico_en_colorlib_con_usuario_clave(String Usuario, String Clave) throws Throwable {
		PopupValidationSteps.login_colorlib(Usuario, Clave);
	}

	@Given("^Ingreso a la funcionalidad Forms Validation$")
	public void ingreso_a_la_funcionalidad_Forms_Validation() throws Throwable {
	}

	@When("^Diligencio Formulario Popup Validation$")
	public void diligencio_Formulario_Popup_Validation() throws Throwable {
	}

	@Then("^Verifico ingreso exitoso$")
	public void verifico_ingreso_exitoso() throws Throwable {
	}

}
