package main;

import service.WordMainFrame;
import dao_inf.WordDAO;
import dao_inf.DBdao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// oracle version
		DBdao dao = new WordDAO();
		WordMainFrame ws = new WordMainFrame(dao);
	}

}
