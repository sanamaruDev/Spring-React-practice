package com.example.wt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.wt.domain.model.WorkingTime;
import com.example.wt.domain.service.GetWorkingList;

@RestController
@RequestMapping("/workinglist")
public class WorkingListController {

	@Autowired
	GetWorkingList service;
	
	@PostMapping("/get")
	public List<WorkingTime> getList(String username) {
		
		// call service
		List<WorkingTime> result = service.get(username);
		
		return result;
	}
	
}
