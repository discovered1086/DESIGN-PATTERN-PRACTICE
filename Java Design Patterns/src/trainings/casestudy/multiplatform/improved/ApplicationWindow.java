package trainings.casestudy.multiplatform.improved;

public class ApplicationWindow extends Window{

	public ApplicationWindow(WindowImpl impl) {
		super(impl);
	}

	public void drawApplicationWindow(){
		drawWindow();
		System.out.println("Draw Application Icon");
		
	}

	
}
