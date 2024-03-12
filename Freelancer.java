package Home003;

/*
 * Фрилансер (работа с почасовой оплатой)
 * Формула для вычисления: «среднемесячная 
 * заработная плата = 20.8 * 8 * почасовая ставка»
 */
public class Freelancer extends Employee {
    
    private Freelancer(String surName, String name, int age, double salary) {
        super(surName, name, age, salary);
    }

    public static Freelancer create(String surName, String name, int age, double salary){
        return new Freelancer(surName, name, age, salary);
    }


    @Override
    public double calculateSalary() {
        return averageMonthlySalary = 20.8 * 8 * salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Возраст: %d лет; Cтавка: %.2f руб.; Cреднемесячная заработная плата: %.2f руб.",
                surName, name, age, salary, calculateSalary());
    }

    @Override
    public int getAge() {
        return age;
    }
    
}
