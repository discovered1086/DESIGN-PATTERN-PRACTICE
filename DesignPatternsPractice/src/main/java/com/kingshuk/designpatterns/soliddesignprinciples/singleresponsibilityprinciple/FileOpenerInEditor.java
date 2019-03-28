package com.kingshuk.designpatterns.soliddesignprinciples.singleresponsibilityprinciple;

/**
 * This interface promotes open closed principles and the strategy pattern
 */
public interface FileOpenerInEditor {
	
	void openFileInEditor(String fileName) throws Exception;

}
