package mycoding.structuralpatterns.decoratorpattern.myownexample;

public class ReportsHarness {

    public static void main(String[] args) {

        Report report = new ClaimsReports();

        report.setReportId(1);

        report.setReportName("DTD Report");

        ReportPromptValues promptValues=new DateRangePrompts();

        promptValues.setReport(report);

        promptValues.setPromptName("Date Range Prompt");

        promptValues.setPromptDescription("This is a prompt to store date range values");

        ReportPromptValues promptValues1=new CoveragePrompts();

        promptValues1.setReport(promptValues);

        promptValues1.setPromptName("Coverage prompt");

        promptValues1.setPromptDescription("This is a prompt to store coverage values");
        
        System.out.println(promptValues1);

    }
}
