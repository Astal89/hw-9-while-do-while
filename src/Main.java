//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("Задание 1");
    int firstFriday = 3;
    for(int i = 1; i <= 31; i++) {
        if((i - firstFriday) % 7 == 0) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }
    }

    System.out.println("Задание 2");
    int totalDistance = 42195;
    int currentDistance = 0;
    do {
        System.out.println("Держитесь! Осталось " + (totalDistance - currentDistance) + " метров.");
        currentDistance = currentDistance + 500;
    } while (currentDistance < totalDistance);

    for(currentDistance = 0; currentDistance < totalDistance; currentDistance = currentDistance + 500) {
        System.out.println("Держитесь! Осталось " + (totalDistance - currentDistance) + " метров.");
    }

    System.out.println("Задание 3");
    int currentDay = 0;
    int budget = 550;
    int pricePerDay = 100;
    while (budget > pricePerDay) {
        currentDay++;
        if(currentDay % 5 == 0) {
            continue;
        }
        budget = budget - pricePerDay;
    }
    System.out.println("Суммы хватит на " + currentDay + " дней.");

    budget = 550;
    for(currentDay = 0; budget > pricePerDay;) {
        currentDay++;
        if(currentDay % 5 == 0) {
            continue;
        }
        budget = budget - pricePerDay;
    }
    System.out.println("Суммы хватит на " + currentDay + " дней.");

    System.out.println("Задание 4");
    int month = 1;
    float total = 0f;
    while (true) {
        total = total + 15000f;
        if(month % 6 == 0) {
            total = total + total * 0.07f;
        }
        System.out.println("Месяц " + month + ". Накопленная сумма: " + total);
        month++;
        if(total > 12_000_000) {
            break;
        }
    }

    System.out.println("Задание 5");
    int charge = 20;
    int minute = 0;
    int overheats = 0;

    while (charge <= 100) {
        minute++;
        if(minute % 10 == 0) {
            overheats++;
            System.out.println("Перегрев утройства на " + minute + "-ой мниуте. ");
            minute = minute + 2;
            continue;
        }
        charge = charge + 2;
        if (overheats > 3) {
            System.out.println("Количество перегревов превысило 3. Зарядка остановлена.");
            break;
        }
    }
    System.out.println("Время зарядки составило " + (minute - 3) + " минут.");
}
