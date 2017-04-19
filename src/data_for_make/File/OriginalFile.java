package data_for_make.File;

public class OriginalFile extends FileManager {

	private String originalString;
	//해당 원본 파일의 기존 내용 전체입니다. 이를 백업해두는 것이 원본파일과 변형된 파일의 차이입니다.
	
	public OriginalFile(String filePath) throws Exception{
		super(filePath);
	}
	

}
