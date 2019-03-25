package com.bootcamp.ActivityLog;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ActivityLogTest {

  @Test
  void shouldAddTheLogToActivityLog() {
    ActivityLog activityLog = new ActivityLog();
    activityLog.add("Game started.");
    ArrayList<String> expectedLogs = new ArrayList<>();
    expectedLogs.add("Game started.");
    assertEquals(expectedLogs, activityLog.log());
  }
}