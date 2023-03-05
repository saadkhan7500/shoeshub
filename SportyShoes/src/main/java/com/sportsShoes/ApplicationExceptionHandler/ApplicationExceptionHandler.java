package com.sportsShoes.ApplicationExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.sportsShoes.Excpetion.ProductException;
import com.sportsShoes.Excpetion.PurchaseException;
import com.sportsShoes.Excpetion.UserException;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ApplicationExceptionHandler {


    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleInvalidArgument(MethodArgumentNotValidException ex) {
        Map<String, String> errorMap = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error -> {
            errorMap.put(error.getField(), error.getDefaultMessage());
        });
        return errorMap;
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(UserException.class)
    public Map<String, String> handleUserException(UserException ex) {
        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("errorMessage", ex.getMessage());
        return errorMap;
    }
    
    
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(ProductException.class)
    public Map<String,String> handleProductException(ProductException ex)
    {
    	Map<String , String> errorMap=new HashMap<>();
    	errorMap.put("errorMessage", ex.getMessage());
    	return errorMap;
    }
    
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(PurchaseException.class)
    public Map<String,String> handlePurchaseException(PurchaseException ex)
    {
    	Map<String , String> errorMap=new HashMap<>();
    	errorMap.put("errorMessage", ex.getMessage());
    	return errorMap;
    }

}
