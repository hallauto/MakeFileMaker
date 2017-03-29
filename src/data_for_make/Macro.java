package data_for_make;

public class Macro {
	protected String Ori_string;
	protected String Changed_name;
	
	
	
	public Macro(String Ori_string, String Changed_name) {
		this.Ori_string = Ori_string;
		this.Changed_name = Changed_name;
	}
	
	public String getTotalToken() throws Exception
	{
		String TotalToken = "$";
		
		if (Ori_string.isEmpty() || Changed_name.isEmpty())
		{
			throw new Exception("Ori_string is empty");
		}
		
		return TotalToken;
	}
	

}
