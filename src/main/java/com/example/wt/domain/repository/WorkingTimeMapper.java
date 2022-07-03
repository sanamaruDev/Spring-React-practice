package com.example.wt.domain.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.wt.domain.model.WorkingTime;

@Mapper
public interface WorkingTimeMapper {

	WorkingTime findByNameDate(WorkingTime workingTime);

	List<WorkingTime> findByName(String user_name);

	void create(WorkingTime workingTime);

	void updateAttendance(WorkingTime workingTime);

	void updateLeaving(WorkingTime workingTime);
}
