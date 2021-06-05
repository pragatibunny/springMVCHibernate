package com.casestudy.validator;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.casestudy.model.User;
public class LoginValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object object, Errors errors) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmpty(errors, "userName", "name.empty");
        User user = (User) object;
        if (user.getUserPassword().length() < 0) {
            errors.rejectValue("age", "choose a password");
        } else if (user.getUserPassword().length() > 10) {
            errors.rejectValue("age", "Not more than 10 char");
        }
    
	}
}


