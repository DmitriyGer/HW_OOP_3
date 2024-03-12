package Home003;

import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();

    public static Employee generateEmployee() {
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int age = random.nextInt(16, 90);
        double salaryWorker = random.nextInt(60000, 120001);
        double salaryFreelancer = random.nextInt(1000, 25000);

        boolean isWorker = random.nextBoolean();
        if (isWorker) {
            return Worker.create(
                    surnames[random.nextInt(surnames.length)],
                    names[random.nextInt(names.length)], age,
                    salaryWorker);
        } else {
            return Freelancer.create(
                    surnames[random.nextInt(surnames.length)],
                    names[random.nextInt(names.length)], age,
                    salaryFreelancer);
        }
    }

    public static Employee[] generateEmployees(int count) {
        Employee[] employees = new Employee[count];
        for (int i = 0; i < count; i++) {
            employees[i] = generateEmployee();
        }
        return employees;
    }

}
