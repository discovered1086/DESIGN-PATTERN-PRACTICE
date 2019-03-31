package com.kingshuk.designprinciples.soliddesignprinciples.singleresponsibilityprinciple;

/**
 * This interface promotes open closed principles and the strategy pattern
 */
public interface FileOpenerInEditor {
	
	void openFileInEditor(String fileName) throws Exception;

}
