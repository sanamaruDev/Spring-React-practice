package com.example.wt.domain.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.wt.domain.model.WorkingTime;
import com.example.wt.domain.repository.WorkingTimeMapper;


@Service
public class GetWorkingList {

	@Autowired
	WorkingTimeMapper mapper;
	
	public List<WorkingTime> get(String userName) {
		
		List<WorkingTime> result = new ArrayList<>();
		
		result = mapper.findByName(userName);
		
		return result;
	}
}
