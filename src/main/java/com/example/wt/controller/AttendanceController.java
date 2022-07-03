package com.example.wt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.wt.domain.model.WorkingTime;
import com.example.wt.domain.service.UpdateAttendanceService;

@RestController
@RequestMapping("/Attendance")
public class AttendanceController {

	@Autowired
	UpdateAttendanceService service;
	
	@PostMapping("/regist")
	public void regist(@RequestBody WorkingTime model) {
		
		// call service
		service.UpdateAttendance(model);	
		return;
	}
	
	
}
