package io.internship.learn.rest.api.test;

import io.internship.learn.example.java.brain.course.Course;
import io.internship.learn.example.java.brain.course.CourseController;
import io.internship.learn.example.java.brain.course.CourseService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(CourseController.class)
public class CourseControllerTest {

    @Autowired
    private CourseController courseController;

    @MockBean
    private CourseService service;

    @Autowired
    private MockMvc mockMvc;

    private Course course;

    @Before
    public void setUp() throws Exception {
        System.out.println("Set upping...");
        course = new Course();
        course.setName("Name");
        course.setDescription("Description");
        course.setId(1);
        given(service.findOne(1)).willReturn(java.util.Optional.ofNullable(course));
    }


    @Test
    public void testFindByIdEndPoint() throws Exception {
        mockMvc.perform(get("/course")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
    }

}


