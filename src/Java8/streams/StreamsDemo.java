package src.Java8.streams;
class Employee {
    int id;

    String name;

    int age;

    String gender;

    String department;

    int yearOfJoining;

    double salary;

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getGender()
    {
        return gender;
    }

    public String getDepartment()
    {
        return department;
    }

    public int getYearOfJoining()
    {
        return yearOfJoining;
    }

    public double getSalary()
    {
        return salary;
    }

    @Override
    public String toString()
    {
        return "Id : "+id
                +", Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", Department : "+department
                +", Year Of Joining : "+yearOfJoining
                +", Salary : "+salary;
    }
}

public class StreamsDemo {
    public static void main(String[] args){
        java.util.List < Employee > employeeList = new java.util.ArrayList < Employee > ();

        employeeList.add( new Employee (111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0) );
        employeeList.add( new Employee (122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0) );
        employeeList.add( new Employee (133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0) );
        employeeList.add( new Employee (144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0) );
        employeeList.add(new Employee (155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee (166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee (177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee (188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee (199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee (200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee (211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee (222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee (233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee (244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee (255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee (266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee (277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        System.out.println("Who is the oldest employee in the organization? What is his age and which department he belongs to?");
        java.util.Optional < Employee > oldestEmployeeWrapper = employeeList.stream().max( java.util.Comparator.comparingInt(Employee::getAge));
        //System.out.println(oldestEmployeeWrapper);
      Employee oldestEmployee = oldestEmployeeWrapper.get();
        //System.out.println(oldestEmployee);

        System.out.println("Name : "+oldestEmployee.getName());

        System.out.println("Age : "+oldestEmployee.getAge());

        System.out.println("Department : "+oldestEmployee.getDepartment());

        System.out.println("How many male and female employees are there in the organization?");
        java.util.Map < String, Long> noOfMaleAndFemaleEmployees = employeeList.stream().collect( java.util.stream.Collectors.groupingBy(Employee::getGender, java.util.stream.Collectors.counting()));

        System.out.println(noOfMaleAndFemaleEmployees);

        System.out.println("Print the name of all departments in the organization?");

        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

        System.out.println(" What is the average age of male and female employees?");

        java.util.Map < String, Double> avgAgeOfMaleAndFemaleEmployees = employeeList.stream()
                .collect( java.util.stream.Collectors.groupingBy(Employee::getGender, java.util.stream.Collectors.averagingInt(Employee::getAge)));

        System.out.println("avgAgeOfMaleAndFemaleEmployees : " + avgAgeOfMaleAndFemaleEmployees);

        System.out.println("Get the details of highest paid employee in the organization?");

        java.util.Optional < Employee > highestPaidEmployeeWrapper = employeeList.stream()	.collect( java.util.stream.Collectors.maxBy( java.util.Comparator.comparingDouble(Employee::getSalary)));

    Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();

        System.out.println("Details Of Highest Paid Employee : ");

        System.out.println("==================================");

        System.out.println("ID : " + highestPaidEmployee.getId());

        System.out.println("Name : " + highestPaidEmployee.getName());

        System.out.println("Age : " + highestPaidEmployee.getAge());

        System.out.println("Gender : " + highestPaidEmployee.getGender());

        System.out.println("Department : " + highestPaidEmployee.getDepartment());

        System.out.println("Year Of Joining : " + highestPaidEmployee.getYearOfJoining());

        System.out.println("Salary : " + highestPaidEmployee.getSalary());

        System.out.println(" Get the names of all employees who have joined after 2015?");

        employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee::getName)
                .forEach(System.out::println);

        System.out.println("Count the number of employees in each department?");
        java.util.Map < String, Long> employeeCountByDepartment = employeeList.stream()
                .collect( java.util.stream.Collectors.groupingBy(Employee::getDepartment, java.util.stream.Collectors.counting()));

        java.util.Set < java.util.Map.Entry < String, Long> > entrySet = employeeCountByDepartment.entrySet();

        for (java.util.Map.Entry < String, Long> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("What is the average salary of each department?");
        java.util.Map < String, Double> avgSalaryOfDepartments = employeeList.stream().collect(
                java.util.stream.Collectors.groupingBy(Employee::getDepartment, java.util.stream.Collectors.averagingDouble(Employee::getSalary)));

        java.util.Set < java.util.Map.Entry < String, Double> > entrySet1 = avgSalaryOfDepartments.entrySet();

        for (java.util.Map.Entry < String, Double> entry : entrySet1) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("Get the details of youngest male employee in the product development department?");

        java.util.Optional < Employee > youngestMaleEmployeeInProductDevelopmentWrapper = employeeList.stream()
                .filter(e -> e.getGender() == "Male" && e.getDepartment() == "Product Development")
                .min( java.util.Comparator.comparingInt(Employee::getAge));

        Employee youngestMaleEmployeeInProductDevelopment = youngestMaleEmployeeInProductDevelopmentWrapper.get();

        System.out.println("Details Of Youngest Male Employee In Product Development");

        System.out.println("----------------------------------------------");

        System.out.println("ID : " + youngestMaleEmployeeInProductDevelopment.getId());

        System.out.println("Name : " + youngestMaleEmployeeInProductDevelopment.getName());

        System.out.println("Age : " + youngestMaleEmployeeInProductDevelopment.getAge());

        System.out.println("Year Of Joinging : " + youngestMaleEmployeeInProductDevelopment.getYearOfJoining());

        System.out.println("Salary : " + youngestMaleEmployeeInProductDevelopment.getSalary());

        System.out.println(" Who has the most working experience in the organization?");

        java.util.Optional < Employee > seniorMostEmployeeWrapper = employeeList.stream()
                .sorted( java.util.Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();

       Employee seniorMostEmployee = seniorMostEmployeeWrapper.get();

        System.out.println("Senior Most Employee Details :");

        System.out.println("----------------------------");

        System.out.println("ID : " + seniorMostEmployee.getId());

        System.out.println("Name : " + seniorMostEmployee.getName());

        System.out.println("Age : " + seniorMostEmployee.getAge());

        System.out.println("Gender : " + seniorMostEmployee.getGender());

        System.out.println("Age : " + seniorMostEmployee.getDepartment());

        System.out.println("Year Of Joinging : " + seniorMostEmployee.getYearOfJoining());

        System.out.println("How many male and female employees are there in the sales and marketing team?");

        java.util.Map < String, Long> countMaleFemaleEmployeesInSalesMarketing = employeeList.stream()
                .filter(e -> e.getDepartment() == "Sales And Marketing")
                .collect( java.util.stream.Collectors.groupingBy(Employee::getGender, java.util.stream.Collectors.counting()));

        System.out.println("countMaleFemaleEmployeesInSalesMarketing  : " + countMaleFemaleEmployeesInSalesMarketing);

        System.out.println("What is the average salary of male and female employees?");

        java.util.Map < String, Double> avgSalaryOfMaleAndFemaleEmployees = employeeList.stream()
                .collect( java.util.stream.Collectors.groupingBy(Employee::getGender, java.util.stream.Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(avgSalaryOfMaleAndFemaleEmployees);

        System.out.println("List down the names of all employees in each department?");
        java.util.Map < String, java.util.List < Employee > > employeeListByDepartment = employeeList.stream()
                .collect( java.util.stream.Collectors.groupingBy(Employee::getDepartment));

        java.util.Set < java.util.Map.Entry < String, java.util.List < Employee > > > entrySet2 = employeeListByDepartment.entrySet();

        for (java.util.Map.Entry < String, java.util.List < Employee > > entry : entrySet2) {
            System.out.println("--------------------------------------");

            System.out.println("Employees In " + entry.getKey() + " : ");

            System.out.println("--------------------------------------");

            java.util.List <Employee > list = entry.getValue();

            for (Employee e : list) {
                System.out.println(e.getName());
            }
        }

        System.out.println("What is the average salary and total salary of the whole organization?");
        java.util.DoubleSummaryStatistics employeeSalaryStatistics = employeeList.stream()
                .collect( java.util.stream.Collectors.summarizingDouble(Employee::getSalary));

        System.out.println("Average Salary = " + employeeSalaryStatistics.getAverage());

        System.out.println("Total Salary = " + employeeSalaryStatistics.getSum());

        System.out.println("Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.");

        java.util.Map < Boolean, java.util.List <Employee > > partitionEmployeesByAge = employeeList.stream()
                .collect( java.util.stream.Collectors.partitioningBy( e -> e.getAge() > 25));

        java.util.Set < java.util.Map.Entry < Boolean, java.util.List < Employee > > > entrySet3 = partitionEmployeesByAge.entrySet();

        for (java.util.Map.Entry < Boolean, java.util.List <Employee > > entry : entrySet3) {
            System.out.println("----------------------------");

            if (entry.getKey()) {
                System.out.println("Employees older than 25 years :");
            } else {
                System.out.println("Employees younger than or equal to 25 years :");
            }

            System.out.println("----------------------------");

            java.util.List <Employee > list = entry.getValue();

            for (Employee e : list) {
                System.out.println(e.getName());
            }
        }
    }

}
