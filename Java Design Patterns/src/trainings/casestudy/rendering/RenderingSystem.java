package trainings.casestudy.rendering;

import trainings.casestudy.documentstructure.improved.WorldObject;

public class RenderingSystem {

	private WorldObjectRenderer renderer;
	
	public void render(WorldObject object){
		renderer.render(object);
	}
	
	public void setWorldObjectRenderer(WorldObjectRenderer renderer){
		this.renderer = renderer;
	}
	
}
