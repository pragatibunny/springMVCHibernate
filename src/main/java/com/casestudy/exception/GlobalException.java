package com.casestudy.exception;
import java.io.FileNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

 
@ControllerAdvice
public class GlobalException {
		@ResponseStatus(value= HttpStatus.INTERNAL_SERVER_ERROR)
	    @ExceptionHandler(value= {Exception.class,FileNotFoundException.class,ArrayIndexOutOfBoundsException.class})
	    public ModelAndView processException(Exception exception) {
	        ModelAndView modelAndView=new ModelAndView("globalException");
	        modelAndView.addObject("why", exception.getMessage());
	        return modelAndView;
	    }

	 

	}

