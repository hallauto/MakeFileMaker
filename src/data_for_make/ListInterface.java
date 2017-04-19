package data_for_make;

/**
 * @author HHH-DBLAB
 * MakeFileMaker는 많은 종류의 토큰과 단어를 다룹니다. 여기에 매크로 등등... 다양한 매크로들을 검색하기 편하도록 인터페이스를 통일합니다.
 */
public interface ListInterface {
	
	public abstract int ListSearch(String tokenName);
	public abstract void inputList(Token token);
	public abstract void inputList(int index, Token token);
	public abstract void removeList(Token token);
	public abstract void removeList(int index);
	public abstract void upadateList(int index, Token token);

}
