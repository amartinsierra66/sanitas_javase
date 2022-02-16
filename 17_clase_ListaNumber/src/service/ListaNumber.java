package service;

import java.util.ArrayList;
import java.util.Collections;

public class ListaNumber extends ArrayList<Integer>{	
	@Override
	public boolean add(Integer e) {
		/*if(!contains(e)) {
			super.add(e);
			return true;
		}
		return false;*/
		for(Integer n:this) {
			if(n==e) {
				return false;
			}
		}
		super.add(e);
		return true;
	}

	public void invertir() {
		Collections.reverse(this);
	}

	@Override
	public String toString() {
		String res="";
		for(Integer n:this) {
			res+=n+",";
		}
		return res.substring(0,res.length()-1);
	}	
}
