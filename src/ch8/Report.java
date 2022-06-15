package ch8;

abstract class Report {
  void runReport() {
    System.out.println("Abstract run report");
    // set-up report
  }

  void printReport() {
    System.out.println("Abstract print report");
    // generic printing
  }
}

