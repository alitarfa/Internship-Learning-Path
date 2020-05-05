package io.internship.learn.rest.api.test;

import io.internship.learn.example.java.brain.course.Course;
import io.internship.learn.example.java.brain.course.CourseRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CourseJpaTest {


    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private CourseRepository courseRepository;


    @Test
    public void testFindByName() {

        // given
        Course course = new Course();
        course.setName("Test");
        course.setDescription("Description");
        testEntityManager.persist(course);
        testEntityManager.flush();

        // when
        Course found = courseRepository.findByName("Test").get();

        // then
        assertEquals(found.getName(), course.getName());
    }
}


