import org.w3c.dom.ls.LSOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Task 01");
        int deposit = 15000;
        int totalDeposit = 0;
        int percent = 100;
        int month = 1;
        do {
            totalDeposit = totalDeposit + totalDeposit / percent;
            totalDeposit = totalDeposit + deposit;
            System.out.println("Месяц " + month + " сумма накоплений равна " + totalDeposit + " рублей.");
            month = month + 1;

        }
        while (totalDeposit < 2459000);
        int a = 1;
        do {
            System.out.print(a + " ");
            a = a + 1;
        } while (a < 11);
        System.out.println("");
        for (a = 10; a >= 1; a--) {
            System.out.print(a + " ");
        }
        System.out.println(" ");
        System.out.println("Task 03");
        int populationY = 12000000;
        int populationThousand = populationY / 1000;
        int bornedInThousand = 17;
        int deathInThousend = 8;
        int year = 1;
        do {
            populationY = populationY + populationThousand * bornedInThousand - populationThousand * deathInThousend;
            System.out.println("Год " + year + ", численность населения составляет " + populationY + ".");
            year = year + 1;
        }
        while (year < 11);
        System.out.println("Task 04");
        int initialDeposit = 15000;
        int rate = 7;
        int targetDeposit = 12000000;
        month = 0;
        do {
            initialDeposit = initialDeposit + initialDeposit * rate / 100;
            System.out.println("Месяц " + month + " сумма накоплений равна " + initialDeposit + " рублей.");
            month = month + 1;
        } while (initialDeposit < targetDeposit);

        System.out.println("Task 05");
        month = 0;
        initialDeposit = 15000;
        do {
            initialDeposit = initialDeposit + initialDeposit * rate / 100;
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + initialDeposit + " рублей.");
            }
        } while (initialDeposit < targetDeposit);

        System.out.println("Task 06");
        month = 0;
        initialDeposit = 15000;
        int targetMonth = 9 * 12;
        do {
            initialDeposit = initialDeposit + initialDeposit * rate / 100;
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + initialDeposit + " рублей.");
            }
        } while (month < targetMonth);

        System.out.println("Task 07");
        int friday = 3;
        int day = 1;
        while (day <= 31) {
            if ((day - friday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            }
            day++;
        }
        day++;
        System.out.println("Task 08");
        int currentYear = 2024;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        int yearNow = startYear;
        while (yearNow <= endYear) {
            if (yearNow % 79 == 0) {
                System.out.println(yearNow);
            }
            yearNow++;
        }


    }
}