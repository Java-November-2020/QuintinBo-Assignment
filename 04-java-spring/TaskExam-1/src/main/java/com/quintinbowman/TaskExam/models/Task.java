package com.quintinbowman.TaskExam.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="tasks")
public class Task {
	public Task() {

	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//Primary key for the task model
	private long taskId;
	@NotBlank
	@Size(max=100)
	private String taskName;
	@NotBlank
	@Size(max=60)
	private String taskAssignee;
	@NotBlank
	private String priority;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User taskCreator;

	public long getTaskId() {
		return taskId;
	}

	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskAssignee() {
		return taskAssignee;
	}

	public void setTaskAssignee(String taskAssignee) {
		this.taskAssignee = taskAssignee;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public User getTaskCreator() {
		return taskCreator;
	}

	public void setTaskCreator(User taskCreator) {
		this.taskCreator = taskCreator;
	}
	
}
