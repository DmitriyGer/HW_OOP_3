package Home003;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {

        Employee[] employees = EmployeeFabric.generateEmployees(15);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println();
        System.out.println("***");
        System.out.println();

        // /*
        //  * Сортировка по Фамилии
        //  */
        // Arrays.sort(employees);

        // for (Employee employee : employees) {
        //     System.out.println(employee);
        // }

        System.out.println();
        System.out.println("***");
        System.out.println();

        /*
         * Сортировка по возрасту
         */
        Arrays.sort(employees, new WorkerAgeComparator());

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

}
