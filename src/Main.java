public class Main {
    public static void main(String[] args) {
        int summa = 15000;
        int total = 0;
        int i = 0;
        while (total < 2459000) {
            total = total + total / 100;
            total = total + summa;
            i++;
            {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
            }
        }
        {
            System.out.println();
        }

        {
            int start = 10;
            while (start >= 0) {
                System.out.print(start + " ");
                start = start - 1;
            }
            {
                System.out.println();
                System.out.println();
            }
            for (int s = 0; s <= 10; s++) {
                System.out.print(s + " ");
            }
        }
        {
            System.out.println();
            System.out.println();
        }
        int populations =12000000;
        for( int f=1; f <= 10; f++){
            int birthRate =17*populations/1000;
            int deathRate =8*populations/1000;
            populations= populations+ birthRate -deathRate;
            System.out.printf("Год %d численность населения %d ",f,populations);}

        System.out.println();
        System.out.println();

        int sum = 15000;
        int a = 0;
        while (sum < 12000000) {
            sum += sum * 7 / 100;
            a++;
            System.out.println("Месяц " + a + " сумма накопления " + sum);
        }
        {
            System.out.println();
        }
        {
            int suma = 15000;
            int b = 0;
            for (; suma < 12000000; b++) {
                suma += suma * 7 / 100;
                if (b % 6 == 0) {
                    System.out.println("Месяц " + b + " сумма накопления " + suma);
                }
            }
            System.out.println();
        }
        int summaVas = 15000;
        int data = 0;
        for (; data <= 108; data++) {
            summaVas += summaVas * 7 / 100;
            if (data % 6 == 0) {
                System.out.println("Каждые " + data + " месяцев, будет " + summaVas + " рублей.");
            }
        }
        System.out.println();

        for(int dayNumber = 1; dayNumber<=30; dayNumber++){
            if(dayNumber%7 == 1){
                System.out.println("Сегодня пятница, "+dayNumber+" число. Необходимо подготовить отчет.");}
        }
        System.out.println();

        int yaer = 2023;
        int beginning = yaer - 200;
        int ending = yaer + 100;
        for (int t = beginning;t < ending; ++t){
            if(t % 79 == 0)
        System.out.println(t);}

    }
}