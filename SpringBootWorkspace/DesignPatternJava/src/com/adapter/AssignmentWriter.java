package com.adapter;

public class AssignmentWriter {
	
	private Pen pen;
	
	
	
	public Pen getPen() {
		return pen;
	}



	public void setPen(Pen pen) {
		this.pen = pen;
	}



	public void assigmnetWrite(String str) {
		
		pen.write(str);
	}

}
