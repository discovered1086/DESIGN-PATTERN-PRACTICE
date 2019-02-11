package mycoding.structuralpatterns.decoratorpattern.myownexample;

public abstract class Report {

    private Integer reportId;

    private String reportName;

    public Integer getReportId() {
        return reportId;
    }

    public Report setReportId(Integer reportId) {
        this.reportId = reportId;
        return this;
    }

    public String getReportName() {
        return reportName;
    }

    public Report setReportName(String reportName) {
        this.reportName = reportName;
        return this;
    }
}
