package Controller;

import Model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("stu")
public class stuController {

    private List<Student> students = new ArrayList<>();

    @GetMapping
    public List<Student> studentList(){
        return students;
    }

    @PostMapping
    public Student save(@RequestBody Student studentRequest){
        students.add(studentRequest);
        return studentRequest;
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") int id){
        students.remove(id)
        ;
    }
}
