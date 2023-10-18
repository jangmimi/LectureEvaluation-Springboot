package com.springproject.controller;

import com.springproject.model.Lecture;
import com.springproject.service.LectureService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@Controller
public class LectureController {

    @Autowired
    private LectureService lectureService;

    @RequestMapping("/lectures")
    public String lectures(Model model) throws Exception {
        log.info("컨트롤러 lectures");
        List<Lecture> lectureList = lectureService.getLectureData();
        model.addAttribute("lectures", lectureList);
        return "lecture";
    }
}