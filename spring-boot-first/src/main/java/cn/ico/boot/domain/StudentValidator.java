package cn.ico.boot.domain;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;

@Component("studentValidator")
public class StudentValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return Student.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"name","required.name","Field name is required.");
    }
}
