package com.suse.hl.clazzmenoir.controller;

import com.suse.hl.clazzmenoir.common.domain.Student;
import com.suse.hl.clazzmenoir.common.utils.CommRequest;
import com.suse.hl.clazzmenoir.common.utils.CommRespone;
import com.suse.hl.clazzmenoir.service.ClazzService;
import com.suse.hl.clazzmenoir.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/stu")
public class StudentController {
    @Autowired
    ClazzService clazzService;
    @Autowired
    StudentService studentService;

    @GetMapping
    public String list(){
        return "student/stu-list";
    }
    @RequestMapping("/list")
    @ResponseBody
    public CommRespone selectAll(CommRequest request){
        return studentService.selectAll(request);
    }
    @RequestMapping("/add")
    public String addClazz(ModelMap modelMap){
        modelMap.put("student",new Student());
        modelMap.put("clazzes",clazzService.searchClazz());
        return "/student/stu-edit";
    }
    @PostMapping
    public String updateClazz(Student student){
        studentService.updateClazz(student);
        return "/student/stu-list";
    }
    @RequestMapping("/edit")
    public String update(@RequestParam("id") String id, ModelMap modelMap){
        modelMap.addAttribute("student",studentService.getProductById(id));
        modelMap.put("clazzes",clazzService.searchClazz());
        return "/student/stu-edit";
    }
    @RequestMapping("/del")
    @ResponseBody
    public Object deleteClazz(@RequestBody List<Student> students){
        Map<String, Object> map = new HashMap<>();
        for (Student student:students) {
            studentService.delete(student.getId());
        }
        map.put("success",true);
        map.put("message","删除成功");
        return map;
    }
}
