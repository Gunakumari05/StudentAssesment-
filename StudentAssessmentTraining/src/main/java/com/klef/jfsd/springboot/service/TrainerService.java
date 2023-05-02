package com.klef.jfsd.springboot.service;


import com.klef.jfsd.springboot.model.ScheduleSession;
import com.klef.jfsd.springboot.model.Trainer;

public interface TrainerService 
{
	public Trainer checktrainerlogin(String uname,String pwd);
	public ScheduleSession addSchedule(ScheduleSession scheduleSession);
}
