package mx.uatx.sipeeec.controller;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import mx.uatx.sipeeec.Registration;

@Component("registrationValidator")
public class RegistrationValidation {
	

	public void validate(Object target, Errors errors) {
		Registration registration = (Registration) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName",
				"NotEmpty.registration.userName",
				"Nombre de usuario no debe estar vacío.");
		String userName = registration.getUserName();
		if ((userName.length()) > 50) {
			errors.rejectValue("userName",
					"lengthOfUser.registration.userName",
					"Nombre de usuario no debe más de 50 caracteres.");
		}
		if (!(registration.getPassword()).equals(registration
				.getConfirmPassword())) {
			errors.rejectValue("password",
					"matchingPassword.registration.password",
					"Contraseña y Confirmar contraseña no coinciden.");
		}
	}
}
