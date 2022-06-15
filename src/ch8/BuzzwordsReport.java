package ch8;

class BuzzwordsReport extends Report {
  public static void main(String[] args) {
    BuzzwordsReport buzzwordsReport = new BuzzwordsReport();
    buzzwordsReport.runReport();
  }

  @Override
  void runReport() {
    super.runReport();//call super method
    buzzwordCompliance();//call self-made method
    printReport();//call super method//TODO: find out why without super word still works
  }
  void buzzwordCompliance() {
    System.out.println("Buzzword compliance");
  }
}