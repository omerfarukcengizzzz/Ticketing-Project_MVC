package com.cybertek.service;

import com.cybertek.dto.TaskDTO;
import org.springframework.stereotype.Service;

@Service
public interface TaskService extends CrudService<TaskDTO, Long> {
}
