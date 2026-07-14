package net.javaguides.sms.service;
import jakarta.validation.Valid;
import net.javaguides.sms.dto.StudentDto;
import java.util.List;
public interface StudentService {
    List<StudentDto> getAllStudents();

    void createStudent(StudentDto student);

    StudentDto getStudentById(Long studentId);

    void updateStudent(@Valid StudentDto studentDto);

    void deleteStudent(Long studentId);
}
