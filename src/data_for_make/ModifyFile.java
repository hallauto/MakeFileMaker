package data_for_make;

public class ModifyFile extends FileManager{
	
	private String modifyString; //변환될 문자열을 저장한 객체입니다. 이 객체는 originalString과 다르게 계속 변경이 이루어집니다.

	public ModifyFile(String filePath) throws Exception{
		super(filePath);
		// TODO Auto-generated constructor stub
	}

}
