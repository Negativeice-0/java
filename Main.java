package business.Classing;

public class Main {

    public static void main(String[] args) {
        Business myBusiness = new Business();
        myBusiness.setYearsOfOperation(2);
        myBusiness.setNumOfEmployees(5);
        myBusiness.setRevenue(250000);

        System.out.println(myBusiness.getRevenue());
    }
}