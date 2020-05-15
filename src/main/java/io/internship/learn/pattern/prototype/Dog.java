package io.internship.learn.pattern.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString
public class Dog implements Animal {

    private String name;
    private String type;


    @Override
    public Animal makeCopy() {

        Dog dog = null;

        try {
            dog = (Dog) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return dog;
    }
}
