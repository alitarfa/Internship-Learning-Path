package io.internship.learn.rest.api.test;

import io.internship.learn.example.java.brain.course.Course;
import io.internship.learn.example.java.brain.course.CourseRepository;
import io.internship.learn.example.java.brain.course.CourseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class CourseServiceTest {

    @TestConfiguration
    static class EmployeeServiceImplTestContextConfiguration {

        @Bean
        public CourseService courseService() {
            return new CourseService();
        }
    }


    @Autowired
    private CourseService courseService;

    @MockBean
    private CourseRepository repository;


    @Test
    public void testShouldReturnCourse() {
        Course course = new Course();

        course.setName("Test");

        when(repository.findByName("Test")).thenReturn(java.util.Optional.of(course));

        Course found = courseService.findByName("Test").get();

        String name = "Test";

        assertEquals(found.getName(), name);

    }


}
