package io.internship.learn.funcional;

import java.util.function.Function;

import static io.internship.learn.funcional.InfoValidator.ValidatorResponse.*;

public interface InfoValidator extends Function<Person, InfoValidator.ValidatorResponse> {


    static InfoValidator isMailValid() {
        return person -> person.getEmail().contains("@") ? SUCCESS : EMAIL_NOT_VALID;
    }


    static InfoValidator isAgeValid() {
        return person -> person.getAge() > 16 ? SUCCESS : AGE_NOT_VALID;
    }


    default InfoValidator and(InfoValidator other) {
        return person -> {
            ValidatorResponse result = this.apply(person);
            if (result.equals(SUCCESS)) {
                return other.apply(person);
            } else {
                return result;
            }

        };
    }


    public enum ValidatorResponse {
        SUCCESS,
        EMAIL_NOT_VALID,
        AGE_NOT_VALID,
        NOT_ONE
    }
}
