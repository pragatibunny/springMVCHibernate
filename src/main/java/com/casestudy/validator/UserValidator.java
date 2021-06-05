package com.casestudy.validator;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import com.casestudy.model.User;

public  class UserValidator implements Validator{
	@Override
	public boolean supports(Class<?> arg0) {
		return false;
	}

	@Override
	public void validate(Object object, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "userName", "userName.empty");
		ValidationUtils.rejectIfEmpty(errors, "userPassword", "userPassword.empty");
		ValidationUtils.rejectIfEmpty(errors, "confirmPassword", "confirmPassword.empty");
	User user = (User) object;
       if (!user.getUserPassword().equals(user.getConfirmPassword())) {
    
       	errors.rejectValue("confirmPassword", "confirmPassword.inavlid");
       } 
		
	}
}