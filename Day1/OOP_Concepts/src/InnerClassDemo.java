class Company {
    private String companyName;
    private static String HR_POLICY = "Maximum 21 days paid leave";
    Company(String companyName){
        this.companyName = companyName;
    }
    // Static Inner class
    static class Policy {
        public void showPolicy(){
            System.out.println("Company HR Policy: "+ HR_POLICY);
        }
    }
    // Non-Static inner class (Member inner class)
    class Department{
        private String deptName;
        Department(String deptName){
            this.deptName = deptName;
        }
        void showDetails(){
            System.out.println("Company: "+ companyName);
            System.out.println("Department: "+ deptName);
        }
    }
}
public class InnerClassDemo {
    public static void main(String[] args) {
        // Static inner class
        Company.Policy policy = new Company.Policy();
        policy.showPolicy();

        // Non static or member inner class
        Company company = new Company("ABC Company");
        Company.Department it = company.new Department("IT");
        it.showDetails();
    }
}
