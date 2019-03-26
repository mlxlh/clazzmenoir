package com.suse.hl.clazzmenoir.controller;

import com.suse.hl.clazzmenoir.common.domain.Clazz;
import com.suse.hl.clazzmenoir.common.utils.CommRequest;
import com.suse.hl.clazzmenoir.common.utils.CommRespone;
import com.suse.hl.clazzmenoir.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/clazz")
public class ClazzController {
    @Autowired
    ClazzService clazzService;

    @GetMapping
    public String list(){
        return "/clazz/clazz-list";
    }
    @RequestMapping("/list")
    @ResponseBody
    public CommRespone selectAll(CommRequest request){
        return clazzService.selectAll(request);
    }

    @RequestMapping("/add")
    public String addClazz(ModelMap modelMap){
        modelMap.put("clazz",new Clazz());
        return "/clazz/clazz-edit";
    }
    @RequestMapping("/edit")
    public String editClazz(@RequestParam("id") String id, ModelMap modelMap){
        modelMap.put("clazz",clazzService.getClazzById(id));
        return "/clazz/clazz-edit";
    }
    @PostMapping
    public String updateClazz(Clazz clazz){
        clazzService.updateClazz(clazz);
        return "/clazz/clazz-list";
    }
    @RequestMapping("/del")
    @ResponseBody
    public Object deleteClazz(@RequestBody List<Clazz> clazzes){
        Map<String, Object> map = new HashMap<>();
        for (Clazz clazz:clazzes) {
            clazzService.delete(clazz.getcId());
        }
        map.put("success",true);
        map.put("message","删除成功");
        return map;
    }
}
