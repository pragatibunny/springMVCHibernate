package com.casestudy.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.casestudy.model.Pet;

public class PetValidator implements Validator{
	@Override
	public boolean supports(Class<?> arg0) {
		return false;
	}

	@Override
	public void validate(Object obj, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "petName", "petName.empty");
		ValidationUtils.rejectIfEmpty(errors, "petAge", "petAge.empty");
		ValidationUtils.rejectIfEmpty(errors, "petPlace", "petPlace.empty");
		Pet pet = (Pet) obj;
        if (pet.getPetAge() < 0) {
        	errors.rejectValue("petAge", "age.invalid");
        } 
		
	}
	
}
