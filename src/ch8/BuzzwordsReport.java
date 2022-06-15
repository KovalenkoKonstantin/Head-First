package ch8;

class BuzzwordsReport extends Report {
  @Override
  void runReport() {
    super.runReport();
    buzzwordCompliance();
    printReport();
  }

  void buzzwordCompliance() {
    System.out.println("Buzzword compliance");
  }
}