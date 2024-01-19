package in.ashokit.service;

import in.ashokit.binding.DashboardResponse;
import in.ashokit.entity.Counsellor;

public interface CounsellorService {
	
	public String saveCounsellor(Counsellor c);
	 
	public Counsellor loginCheck(String email, String pwd);

	public boolean recoverPwd(String email);

	public DashboardResponse getDashboardInfo(Integer cid);

}
