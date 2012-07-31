package sis.report;

import junit.framework.TestCase;
import sis.studentinfo.CourseSession;
import sis.studentinfo.DateUtil;
import sis.studentinfo.Student;
import static sis.report.ReportConstant.NEWLINE;

/**
 * Created with IntelliJ IDEA.
 * User: Rom4G
 * Date: 5/28/12
 * Time: 5:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class RosterReporterTest extends TestCase{
    public void testRosterReport() {
        CourseSession session = CourseSession.create("ENGL", "101", DateUtil.createDate(2003, 1, 6));

        session.enroll(new Student("A"));
        session.enroll(new Student("B"));

        String rosterReport = new RosterReporter(session).getReport();
        assertEquals(RosterReporter.ROSTER_REPORT_HEADER + "A" + NEWLINE + "B" + NEWLINE
                + RosterReporter.ROSTER_REPORT_FOOTER + "2" + NEWLINE, rosterReport);
    }
}
