package data_for_make;

import java.util.ArrayList;

public class MacroList implements ListInterface {

	ArrayList<Macro> list;
	
	public Macro ListSearch(int index) {
		return list.get(index);
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

	public ArrayList<Macro> getList() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public void inputList(Token token) {
		// TODO Auto-generated method stub
		list.add((Macro)token);
		list.get(list.size()-1).setToeknNumber(list.size()-1);
	}
	
	@Override
	public void inputList(int index, Token token) {
		// TODO Auto-generated method stub
		list.add(index, (Macro)token);
	}

	@Override
	public void removeList(Token token) {
		// TODO Auto-generated method stub
		list.remove((Macro)token);
		
	}

	@Override
	public void removeList(int index) {
		// TODO Auto-generated method stub
		list.remove(index);
	}

	@Override
	public void upadateList(int index, Token token) {
		// TODO Auto-generated method stub
		list.set(index, (Macro)token);
	}


}
