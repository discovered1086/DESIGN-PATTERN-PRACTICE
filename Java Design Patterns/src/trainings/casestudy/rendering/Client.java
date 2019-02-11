package trainings.casestudy.rendering;


import trainings.casestudy.documentstructure.improved.*;

public class Client {

	public static void main(String[] args){
	
		ComposedWorldObject root = new ComposedWorldObject("root");

		
		
		RenderingSystem renderingSystem = new RenderingSystem();
		
		WorldObjectRenderer renderer = new QuickRenderer();
		WorldObjectRenderer finalImageRenderer = new DetailedRenderer();

		renderingSystem.setWorldObjectRenderer(renderer);
		renderingSystem.render(root);
		
		renderingSystem.setWorldObjectRenderer(finalImageRenderer);
		renderingSystem.render(root);
		
	}
	
}
