package com.example.wt.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.wt.domain.model.WorkingTime;
import com.example.wt.domain.repository.WorkingTimeMapper;

@Service
public class UpdateAttendanceService {

	@Autowired
	private WorkingTimeMapper mapper;

	public void UpdateAttendance(WorkingTime workingTime) {
		
		// レコード取得
		WorkingTime result = mapper.findByNameDate(workingTime);
		
		if (result == null) {
			// 追加
			mapper.create(workingTime);
		} else {
			// 更新
			mapper.updateAttendance(workingTime);
		}
		
	}
}
