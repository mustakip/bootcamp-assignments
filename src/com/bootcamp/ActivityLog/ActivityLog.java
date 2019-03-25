package com.bootcamp.ActivityLog;

import java.util.ArrayList;

class ActivityLog {
  private ArrayList<String> logs;

  ActivityLog() {
    this.logs = new ArrayList<>();
  }

  ArrayList<String> log() {
    return this.logs;
  }

  public void add(String log) {
    this.logs.add(log);
  }
}
