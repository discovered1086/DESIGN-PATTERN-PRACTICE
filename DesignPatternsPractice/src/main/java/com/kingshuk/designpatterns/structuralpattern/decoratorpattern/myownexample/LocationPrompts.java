package com.kingshuk.designpatterns.structuralpattern.decoratorpattern.myownexample;

public class LocationPrompts extends ReportPromptValues {
    private Report report;

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }
}
