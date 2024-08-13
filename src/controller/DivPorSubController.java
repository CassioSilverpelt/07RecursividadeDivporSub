package controller;

public class DivPorSubController {
	public DivPorSubController() {
		super();
	}
	
	public int divPorSub(int a, int b) {
		if (a-b < 0) {return a;}
		else {
			return divPorSub((a - b), b);
		}
	}
	
}
