package edu.sjsu.cmpe275.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import edu.sjsu.cmpe275.dao.JobPostDAO;
import edu.sjsu.cmpe275.dao.SignUpDAO;
import edu.sjsu.cmpe275.model.JobPost;

import edu.sjsu.cmpe275.model.JobSeeker;
import edu.sjsu.cmpe275.services.CompanyService;
import edu.sjsu.cmpe275.services.SignUpService;

@Service
public class CompanyServiceImpl implements CompanyService {


	@Autowired
	JobPostDAO jobPostDAO;
	
	@Override
	public boolean addNewJob(JobPost jobPost) {
		
		return jobPostDAO.addNewJob(jobPost);
		
		
	}

	@Override
	public JobPost getJobDetails(String jobid) {
		
		return jobPostDAO.getJobDetails(jobid);
				
	}

	@Override
	public boolean updateJobDetails(JobPost jobPost) {
		
		return jobPostDAO.updateJobDetails(jobPost);	
	
	}

	@Override
	public List<JobPost> getJobsByCompany(String CompanyId) {

		return jobPostDAO.getJobsByCompany(CompanyId);
	}

	

}