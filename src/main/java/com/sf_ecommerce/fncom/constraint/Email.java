package com.sf_ecommerce.fncom.constraint;

import com.sf_ecommerce.fncom.constant.ErrorConstantMessage;
import com.sf_ecommerce.fncom.constant.RegexConstant;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {})
@Pattern(regexp = RegexConstant.EMAIL, message = "email is not correct")
public @interface Email {

    String message() default "email is not correct";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
