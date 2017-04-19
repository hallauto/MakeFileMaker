package data_for_make;

/**
 * @author HHH-DBLAB
 * 
 * 생성된 매크로들의 묶음입니다. 매크로들은 기본적으로 3가지 요소를 가집니다.
 * 1. 대체할 텍스트
 * 2. 대체될 텍스트
 * 3. 매크로 선언문
 * 따라서 매크로 리스트는 기본 토큰 리스트가 다 작동한 후에 작동합니다.
 *
 */
public class Macro extends Token{
	private String changeName;
	private String declareString;
	
	
	public Macro(String tokenName, String changeName) {
		super(tokenName.trim());
		this.changeName = changeName;
		this.declareString = new String(tokenName.trim() + " = " + changeName.trim());
	}
	
	public String getDeclareString()
	{
		if (declareString.isEmpty())
		{
			this.declareString = new String(super.getTokenName().trim() + " = " + changeName.trim());
		}
		return declareString;
	}
	
	public String getTotalToken() throws Exception
	{
		String TotalToken = "$";
		
		if (super.getTokenName().isEmpty() || changeName.isEmpty())
		{
			throw new Exception("tokenName is empty");
		}
		TotalToken.concat(changeName);
		
		return TotalToken;
	}
	

}
