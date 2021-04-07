package web_gradle_erp.dto;

public class Title {
	private int titleNo;
	private String titleName;

	public Title() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Title(int titleNo) {
		super();
		this.titleNo = titleNo;
	}

	public Title(int titleNo, String titleName) {
		super();
		this.titleNo = titleNo;
		this.titleName = titleName;
	}

	public int getTitleNo() {
		return titleNo;
	}

	public void setTitleNo(int titleNo) {
		this.titleNo = titleNo;
	}

	public String getTitleName() {
		return titleName;
	}

	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

	@Override
	public String toString() {
		return "Title [titleNo=" + titleNo + ", titleName=" + titleName + "]";
	}

}
