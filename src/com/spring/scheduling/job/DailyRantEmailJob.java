package com.spring.scheduling.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.spring.mail.PayErrorMail;

public class DailyRantEmailJob extends QuartzJobBean{

	private PayErrorMail payErrorMail;
	
	
	@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {
		payErrorMail.sendErrorMail();
	}


	public void setPayErrorMail(PayErrorMail payErrorMail) {
		this.payErrorMail = payErrorMail;
	}
	
}
