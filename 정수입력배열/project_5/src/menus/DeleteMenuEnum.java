package menus;

public enum DeleteMenuEnum {
	DELETE(41, "정보 삭제 (by id)"),
	RETURN(49, "돌아가기");

	
	int code;
	String message;
	
	DeleteMenuEnum(int code, String message) {
		this.code = code;
		this.message = message;
		//System.out.println("생성자 in MainMenuEnum: " + code);
	}
	
	public int getCode() {
		return code;
	}
	
	public String getMessage() {
		return message;
	}
}