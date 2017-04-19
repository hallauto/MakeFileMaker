package data_for_make;

import java.util.ArrayList;

/**
 * @author HHH-DBLAB
 * 토큰들을 관리하는 리스트 클래스입니다. 
 */
public class TokenList implements ListInterface {
	private ArrayList<Token> list;

	public ArrayList<Token> getList() {
		return list;
	}
	
	public Token ListSearch(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int ListSearch(String tokenName) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTokenName() == tokenName)
			{
				return i;
			}
		}
		return -1;
	}

	@Override
	public void inputList(Token token) {
		// TODO Auto-generated method stub
		list.add(token);
		list.get(list.size()-1).setToeknNumber(list.size()-1);
	}
	
	@Override
	public void inputList(int index, Token token) {
		// TODO Auto-generated method stub
		list.add(index, token);
	}

	@Override
	public void removeList(Token token) {
		// TODO Auto-generated method stub
		list.remove(token);
		
	}

	@Override
	public void removeList(int index) {
		// TODO Auto-generated method stub
		list.remove(index);
	}

	@Override
	public void upadateList(int index, Token token) {
		// TODO Auto-generated method stub
		list.set(index, token);
	}


}
