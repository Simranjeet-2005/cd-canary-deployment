
package edu.college.citestingpipeline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentServiceTest {

    @Test
    void testGetStudentMessage() {
        StudentService service = new StudentService();

        String result = service.getStudentMessage();

        assertEquals("Student API is working!", result);
    }
}
