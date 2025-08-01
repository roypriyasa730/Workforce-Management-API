package com.railse.hiring.workforcemgmt.service;

import java.util.List;

import com.railse.hiring.workforcemgmt.dto.AssignByReferenceRequest;
import com.railse.hiring.workforcemgmt.dto.TaskManagementDto;
import com.railse.hiring.workforcemgmt.dto.TaskCreateRequest;
import com.railse.hiring.workforcemgmt.dto.UpdateTaskRequest;
import com.railse.hiring.workforcemgmt.dto.TaskFetchByDateRequest;

public interface TaskManagementService {
    List<TaskManagementDto> createTasks(TaskCreateRequest request);

    List<TaskManagementDto> updateTasks(UpdateTaskRequest request);

    String assignByReference(AssignByReferenceRequest request);

    List<TaskManagementDto> fetchTasksByDate(TaskFetchByDateRequest request);

    TaskManagementDto findTaskById(Long id);
}
