package com.bootcamp.ActivityLog;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ActivityLogTest {

  @Test
  void shouldAddTheLogToActivityLog() {
    ActivityLog<Log> activityLog = new ActivityLog();
    Log log = new Log("Game started.");
    activityLog.log(log);
    ArrayList<Log> expectedLogs = new ArrayList<>();
    expectedLogs.add(log);
    assertEquals(expectedLogs, activityLog.getLogs());
  }

  @Test
  void shouldAddTheLogWithTimeStampAndLog() {
    ActivityLog<LogWithTimeStamp> activityLog = new ActivityLog<>();
    LogWithTimeStamp log = new LogWithTimeStamp("Game Started.");
    activityLog.log(log);
    ArrayList<LogWithTimeStamp> expectedLogs = new ArrayList<>();
    expectedLogs.add(log);

    assertEquals(expectedLogs, activityLog.getLogs());
  }
}