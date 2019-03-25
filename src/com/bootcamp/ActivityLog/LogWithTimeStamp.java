package com.bootcamp.ActivityLog;

import java.util.Date;

public class LogWithTimeStamp extends Log{
  private Date date;

  LogWithTimeStamp(String log) {
    super(log);
    this.date = new Date();
  }
}
