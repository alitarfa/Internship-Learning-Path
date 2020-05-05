package io.internship.learn.rest.api.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.internship.learn.example.java.brain.course.Course;
import io.internship.learn.example.java.brain.course.CourseRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ItegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private CourseRepository repository;

    /**
     *               Integration Test
     *
     *   Permit de test l'integration de l'application avec les autres parties (par example connexion avec DB | Autre API )
     *
     *
     * @throws Exception
     */

    @Test
    public void givenCourse_when_insertId_ShouldReturn_200() throws Exception {

        Course course = new Course();
        course.setName("test");

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(course);

        mockMvc.perform(post("/course")
                .contentType(MediaType.APPLICATION_JSON).content(json))
                .andDo(print())
                .andExpect(content()
                        .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());


    }
}
