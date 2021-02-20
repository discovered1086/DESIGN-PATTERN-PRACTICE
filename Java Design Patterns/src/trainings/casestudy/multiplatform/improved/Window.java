package trainings.casestudy.multiplatform.improved;

public abstract class Window {

	// this is the bridge pattern, and the windowImpl contains the drawWindow functionality
	private WindowImpl impl;
	
	public Window(WindowImpl impl){
		this.impl = impl;
	}
	
	public void drawWindow(){
		impl.drawWindow();
	}

	public void setImpl(WindowImpl impl) {
		this.impl = impl;
	}
	
	
}
