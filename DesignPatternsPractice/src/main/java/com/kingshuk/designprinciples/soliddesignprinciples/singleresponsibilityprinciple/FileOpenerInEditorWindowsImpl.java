package com.kingshuk.designprinciples.soliddesignprinciples.singleresponsibilityprinciple;

public class FileOpenerInEditorWindowsImpl implements FileOpenerInEditor {

	@Override
	public void openFileInEditor(String fileName) throws Exception {

        // windows!
        Runtime.getRuntime().exec("notepad.exe " + fileName);
	}

}
