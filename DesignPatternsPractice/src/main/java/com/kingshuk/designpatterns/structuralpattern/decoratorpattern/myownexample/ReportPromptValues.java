package com.kingshuk.designpatterns.structuralpattern.decoratorpattern.myownexample;

public abstract class ReportPromptValues extends Report {

    private String promptName;

    private String promptDescription;

    public abstract Report getReport();

    public abstract void setReport(Report report);

    public String getPromptName() {
        return promptName;
    }

    public void setPromptName(String promptName) {
        this.promptName = promptName;
    }

    public String getPromptDescription() {
        return promptDescription;
    }

    public void setPromptDescription(String promptDescription) {
        this.promptDescription = promptDescription;
    }
}
