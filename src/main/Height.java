package main;
public class Height extends HealthProperty {

	private int height;

	public Height(int hheight) {
		height = hheight;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int newHeight) {
		this.height = newHeight;
	}

}