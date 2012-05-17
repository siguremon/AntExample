package net.siguremon.antexample;

public class Triangle {

	public String judge(int a, int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0
			|| (a + b <= c) || (b + c <= a) || (c + a <= b)) {
			return "not triangle";
		}

		if (a == b && a == c) {
			return "regular triangle";
		} else if (a == b || a == c || b == c) {
			return "isosceles triangle";
		} else {
			return "normal triangle";
		}
	}
}