package ch8;

abstract class Report {
  void runReport() {
    System.out.println("Abstract report");
    // set-up report
  }

  void printReport() {
    System.out.println("Report");
    // generic printing
  }
}

