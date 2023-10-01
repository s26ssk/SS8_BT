package BTtrenlop;

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee saleEmployee = new SaleEmployee(1, "lee", 23, "Japanese");
        Employee developer = new Developer(2, "khanh", 25, "Java");

        saleEmployee.chamCong();
        saleEmployee.work();
        doing(saleEmployee);

        developer.chamCong();
        developer.work();
        doing(developer);
    }
    public static void doing(Employee employee){
        if(employee instanceof Developer){
            ((Developer) employee).fixBug();
        } else {
            ((SaleEmployee) employee).sale();
        }
    }
}