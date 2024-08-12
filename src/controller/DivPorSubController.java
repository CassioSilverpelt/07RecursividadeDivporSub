package controller;

public class DivPorSubController {
	public DivPorSubController() {
		super();
	}
	
	public int divPorSub(int a, int b) {
		if (a-b < 0) {return 0;}
		else {
			return 1 + divPorSub((a - b), b);
		}
	}
	
}
