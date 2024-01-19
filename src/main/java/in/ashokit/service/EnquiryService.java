package in.ashokit.service;

import java.util.List;

import in.ashokit.binding.SearchCriteria;
import in.ashokit.entity.StudentEnq;

public interface EnquiryService {
	
	public boolean addEnq(StudentEnq se);

	public List<StudentEnq> getEnquiries(Integer cid, SearchCriteria s);

}
