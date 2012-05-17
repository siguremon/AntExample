package net.siguremon.antexample;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class TestTriangle {
	@Test
	public void testJudgeRegular() {
		Triangle tri = new Triangle();
		assertThat(tri.judge(1, 1, 1), is("regular triangle"));
	}

	@Test
	public void testJudgeIsoceles() {
		Triangle tri = new Triangle();
		assertThat(tri.judge(2, 2, 1), is("isosceles triangle"));
		assertThat(tri.judge(1, 3, 3), is("isosceles triangle"));
	}

	@Test
	public void testJudgeNotTriangle() {
		Triangle tri = new Triangle();
		assertThat(tri.judge(0, 1, 1), is("not triangle"));
		assertThat(tri.judge(1, 0, 1), is("not triangle"));
		assertThat(tri.judge(1, 1, 0), is("not triangle"));
		assertThat(tri.judge(-1, -1, -1), is("not triangle"));
		assertThat(tri.judge(2, 1, 1), is("not triangle"));
	}

	@Test
	public void testJudgeNormalTriangle() {
		Triangle tri = new Triangle();
		assertThat(tri.judge(2, 3, 4), is("normal triangle"));
		assertThat(tri.judge(3, 4, 5), is("normal triangle"));
		assertThat(tri.judge(10, 11, 12), is("normal triangle"));
	}

}
