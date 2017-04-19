package data_for_make;


/*
 * input값을 검사하고 이를 적절한 오브젝트에 전달하는 클래스입니다.
 * 따라서 이 클래스는 gui와 매우 밀접하게 연관됩니다.
 * 다양한 인터페이스에 알맞도록 메소드들도 다양해야합니다.
 */
/**
 * @author HHH-DBLAB
 *
 */
public class InputString {
	private String input;
	StringDescriptor descriptor;
	
	public InputString(StringDescriptor descriptor) {
		// TODO Auto-generated constructor stub
		this.descriptor = descriptor;
	}
	
	/**
	 * 입력된 한 단어를 특정위치에 반영합니다. 이 기능은 버튼들이 작동하는데에 쓰이며, 각 버튼들이 요구하는 기능에 따라 달라질 수 있습니다.
	 * @param oneWord:입력되는 한 단어입니다.
	 * @param cursorPosition:입력값을 반영해야하는 위치값입니다. 버튼에 따라 지정되기도 하고, 텍스트필드의 커서 값을 default로 가져오기도 합니다.
	 * @param buttonType:각각의 버튼들의 입력을 구분하기 위한 값입니다. 이 값을 읽고 어느 곳에 반영해야하는지 파악합니다.
	 * @return
	 */
	public int InputOneWord(String oneWord, int cursorPosition, int buttonType)
	{
		
		return 0;
	}
	
	
	/**
	 * 특정 이름들을 해당 매크로로 바꿔주는 메소드입니다. 미리 정해진 매크로가 있어야하며, 이 확인은 Macro와 MacroMaker 클래스에서 처리됩니다.
	 * @param name
	 * @param macro
	 * @return
	 */
	public int ChangeNamestoMacros(String name, String macro)
	{
		return 0;
	}

}
