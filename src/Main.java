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

        //task4
        int capacityPerMinute = 8;
        int shift1 = 20;
        int shift2 = 24 * 60;
        int shift3 = shift2 * 3;
        int shift4 = shift2 * 30;
        int capacityShift1 = capacityPerMinute * shift1;
        int capacityShift2 = capacityPerMinute * shift2;
        int capacityShift3 = capacityPerMinute * shift3;
        int capacityShift4 = capacityPerMinute * shift4;
        System.out.println("task 4");
        System.out.println("За " + shift1 + " минут машина произвела бутылок "+ capacityShift1 + " штук");
        System.out.println("За " + shift2 + " минут машина произвела бутылок "+ capacityShift2 + " штук");
        System.out.println("За " + shift3 + " минут машина произвела бутылок "+ capacityShift3 + " штук");
        System.out.println("За " + shift4 + " минут машина произвела бутылок "+ capacityShift4 + " штук");

        //task5
        int paintCanTotal = 120;
        int consumptionPerClassWhite = 2;
        int consumptionPerClassBrown = 4;
        int classes = paintCanTotal / (consumptionPerClassWhite + consumptionPerClassBrown);
        int paintCanWhite = classes * consumptionPerClassWhite;
        int paintCanBrown = classes * consumptionPerClassBrown;
        System.out.println("task 5");
        System.out.println("В школе, где " + classes + " классов, нужно "+ paintCanWhite + " банок белой краски и " + paintCanBrown + " банок коричневой краски");

        //task6
        int bananas = 5;
        int milk = 2;
        int iceCream = 2;
        int eggs = 4;
        int weightPerBanana = 80;
        int weightPerMilk = 105;
        int weightPerIceCream = 100;
        int weightPerEgg = 70;
        float totalWeight = bananas * weightPerBanana + milk * weightPerMilk + iceCream * weightPerIceCream + eggs * weightPerEgg;
        float totalWeightKilos = totalWeight / 1000;
        System.out.println("task 6");
        System.out.println("Вес завтрака " + totalWeightKilos + " кг");

        //task7
        int totalWeightToLoseKilos = 7;
        int grammsPerKilo = 1000;
        int totalWeightToLoseGram = totalWeightToLoseKilos * grammsPerKilo;
        int lossPerDayGramm1 = 250;
        int lossPerDayGramm2 = 500;
        float days1 = totalWeightToLoseGram / lossPerDayGramm1;
        float days2 = totalWeightToLoseGram / lossPerDayGramm2;
        float daysAverage = (days1 + days2) / 2;
        System.out.println("task 7");
        System.out.println(days1 + " дней понадобится спортсмену при потере веса на " + lossPerDayGramm1 + " грамм в день");
        System.out.println(days2 + " дней понадобится спортсмену при потере веса на " + lossPerDayGramm2 + " грамм в день");
        System.out.println(daysAverage + " день понадобится спортсмену в среднем");

        //task8
        int increase = 10;
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKris = 76230;
        int newSalaryMasha = salaryMasha + salaryMasha * increase / 100;
        int newSalaryDenis = salaryDenis + salaryDenis * increase / 100;
        int newSalaryKris = salaryKris + salaryKris * increase / 100;
        int YearSalaryMasha = salaryMasha * 12;
        int YearSalaryDenis = salaryDenis * 12;
        int YearSalaryKris = salaryKris * 12;
        int YearNewSalaryMasha = newSalaryMasha * 12;
        int YearNewSalaryDenis = newSalaryDenis * 12;
        int YearNewSalaryKris = newSalaryKris * 12;
        int difSalaryMasha = YearNewSalaryMasha - YearSalaryMasha;
        int difSalaryDenis = YearNewSalaryDenis - YearSalaryDenis;
        int difSalaryKris = YearNewSalaryKris - YearSalaryKris;

        System.out.println("task 8");
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + difSalaryMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + difSalaryDenis + " рублей");
        System.out.println("Крис теперь получает " + newSalaryKris + " рублей. Годовой доход вырос на " + difSalaryKris + " рублей");
    }
}
