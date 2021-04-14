package com;

public class Height extends HealthProperty {

	private int height;

	public Height(long id, int height) {
		super(id);
		this.height = height;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int newHeight) {
		this.height = newHeight;
	}

	//----------------------------------------------------------------------------------------------------------------------------------------
	//firebase stuff!!
	public Height() {
		super(0);
	}
}