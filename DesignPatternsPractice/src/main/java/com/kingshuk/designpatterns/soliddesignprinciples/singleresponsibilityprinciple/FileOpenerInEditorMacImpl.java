package com.kingshuk.designpatterns.soliddesignprinciples.singleresponsibilityprinciple;

import java.io.IOException;

public class FileOpenerInEditorMacImpl implements FileOpenerInEditor {

	@Override
	public void openFileInEditor(String fileName) throws Exception {
		String cmd = "/Applications/TextMate.app";

		ProcessBuilder pb = new ProcessBuilder("open", "-a", cmd, fileName);

		pb.redirectErrorStream(true);

		try {
			Process process = pb.start();

			Thread t = new Thread(new InputStreamConsumer(process.getInputStream()));

			t.start();

			int exitCode = process.waitFor();

			System.out.println("Exited with " + exitCode);

		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
			throw e;
		}
	}

}
