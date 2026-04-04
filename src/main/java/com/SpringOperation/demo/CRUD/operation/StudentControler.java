package com.SpringOperation.demo.CRUD.operation;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentControler {
    List<Student>list =new ArrayList<>();

    @GetMapping("/request")
    public  String getStudent(@RequestParam (required = false) String name,@RequestParam (required = false ) int age){
        return "name " +name+"Age "+age;
    }
    @PostMapping
    public String addStudent(@RequestBody Student s){
        list.add(s);
        return "student added";
    }

    @GetMapping
    public  List<Student>  getAllStudents(){
        return list;
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable int id){
        for(Student s:list){
            if(s.getId()==id) {
                return s;
            }
        }
        return null;
    }

    @PutMapping("/{id}")
    public  String updateStudent(@PathVariable int id ,@RequestBody Student newStudent){
        for(Student s:list){
            if(s.getId()==id){
                s.setName(newStudent.getName());
                s.setAge(newStudent.getAge());
                return "Update Successfully";
            }
        }
        return "Student not found";
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id){
        Iterator<Student> it =list.iterator();
        while(it.hasNext()) {
            for (Student s : list) {
                if (s.getId() == id) {
                    it.remove();
                    return "delete successfull";
                }
            }
        }
        return "record not found";
    }
}
