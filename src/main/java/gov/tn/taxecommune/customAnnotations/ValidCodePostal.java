package gov.tn.taxecommune.customAnnotations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Keno&Kemo on 21.10.2017..
 */
@Target(ElementType.FIELD)
@Retention(RUNTIME)
@Constraint(validatedBy = CodePostalValidator.class)
@Documented
public @interface ValidCodePostal {
    String message() default "Invalid code postal";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
