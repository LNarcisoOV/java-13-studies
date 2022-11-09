package com.study.textblock;

public class TextBlockMain {

	public static void main(String[] args) {
		String sql = """
				SELECT 
					*
				FROM TB_TEXT TT
				WHERE TT.NAME = ?
				""";

		System.out.println(sql);
	}

}
