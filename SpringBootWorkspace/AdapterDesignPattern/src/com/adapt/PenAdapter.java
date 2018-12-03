package com.adapt;

/* Adapter Design Pattern is part of structural patterns. 
 * It allows the interface of an existing class to be used as another interface.
 *  In summary, an adapter helps two incompatible interfaces to work together*/

public class PenAdapter  implements Pen{
    
	PilotPen pp=new PilotPen();
	
	@Override
	public void write(String str) {
		pp.mark(str);
	}

}
