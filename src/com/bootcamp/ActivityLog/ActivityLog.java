package com.bootcamp.ActivityLog;

import java.util.ArrayList;
import java.util.List;

class ActivityLog<T extends Log> {
  private ArrayList<T> logs;

  ActivityLog() {
    this.logs = new ArrayList<>();
  }

  List<T> getLogs() {
    return List.copyOf(this.logs);
  }

  void log(T log) {
    this.logs.add(log);
  }

}
