package com.example.wt.domain.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.wt.domain.model.WorkingTime;

@Mapper
public interface WorkingTimeMapper {

	WorkingTime findByNameDate(WorkingTime workingTime);

	void create(WorkingTime workingTime);

	void updateAttendance(WorkingTime workingTime);

	void updateLeaving(WorkingTime workingTime);
}
