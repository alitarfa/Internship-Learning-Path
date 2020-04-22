package io.internship.learn.streams;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@ToString
@Builder
@Data
public class Persone {
    private int id;
    private String name;
    private String address;
    private int age;


    public void incrementAge() {
        age = age + 1;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persone persone = (Persone) o;

        if (id != persone.id) return false;
        if (age != persone.age) return false;
        if (!name.equals(persone.name)) return false;
        return address.equals(persone.address);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + age;
        return result;
    }
}
