public class Main {
    public Main() {
    }
    //task1
    public static void main(String[] args) {
        int books = 20;
        byte pages = 50;
        short totalPages = 1000;
        long totalWords = 1000001L;
        float wordsPerPage = 2000.02F;
        double wordsPerBook = 200000.2;
        System.out.println("task 1");
        System.out.println("Значение переменной books с типом int равно " + books);
        System.out.println("Значение переменной pages с типом byte равно " + pages);
        System.out.println("Значение переменной totalPages с типом short равно " + totalPages);
        System.out.println("Значение переменной totalWords с типом long равно " + totalWords);
        System.out.println("Значение переменной wordsPerPage с типом float равно " + wordsPerPage);
        System.out.println("Значение переменной wordsPerBook с типом double равно " + wordsPerBook);

        //task2
        double temperature = 27.12;
        long population = 987678965549L;
        float cost = 2.786f;
        boolean a = false;
        int b = 569;
        int c = -159;
        short d = 27897;
        byte e = 67;

        //task3
        int studentsLudmilaPav = 23;
        int studentsAnnaSer = 27;
        int studentsKateAnd = 30;
        int sheets = 480;
        float sheetsPerStudent = sheets / (studentsLudmilaPav + studentsAnnaSer + studentsKateAnd);
        System.out.println("task 3");
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");




    }
}
