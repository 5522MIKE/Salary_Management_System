package moodleItem;

public class User {
	private String userId;
	private String userName;
	private String userPsw;
	private String sex;
	private String department; //部门
	private String post;   //主要职务
	private String professionalTitle; //ְ职称
	private String mTOA_State;   //教学管理身份
	private String baseAllowanceState; //领取基础津贴身份
	private String dutyAllowanceState; //ְ职务津贴身份
	private String telAllowanceState;	//电话补助身份	
	private String loginAuthority;     //登录权限
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPsw() {
		return userPsw;
	}
	public void setUserPsw(String userPsw) {
		this.userPsw = userPsw;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getProfessionalTitle() {
		return professionalTitle;
	}
	public void setProfessionalTitle(String professionalTitle) {
		this.professionalTitle = professionalTitle;
	}
	public String getmTOA_State() {
		return mTOA_State;
	}
	public void setmTOA_State(String mTOA_State) {
		this.mTOA_State = mTOA_State;
	}
	public String getBaseAllowanceState() {
		return baseAllowanceState;
	}
	public void setBaseAllowanceState(String baseAllowanceState) {
		this.baseAllowanceState = baseAllowanceState;
	}
	public String getDutyAllowanceState() {
		return dutyAllowanceState;
	}
	public void setDutyAllowanceState(String dutyAllowanceState) {
		this.dutyAllowanceState = dutyAllowanceState;
	}
	public String getTelAllowanceState() {
		return telAllowanceState;
	}
	public void setTelAllowanceState(String telAllowanceState) {
		this.telAllowanceState = telAllowanceState;
	}
	public String getLoginAuthority() {
		return loginAuthority;
	}
	public void setLoginAuthority(String loginAuthority) {
		this.loginAuthority = loginAuthority;
	}
	
}
