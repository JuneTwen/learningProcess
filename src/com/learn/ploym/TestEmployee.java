package com.learn.ploym;

public class TestEmployee {
    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());
    }
    public void testWork(Employee e){
        if(e instanceof Staff){
            ((Staff)e).work();
        }else if(e instanceof Manager){
            ((Manager)e).manage();
        }else {
            System.out.println("----");
        }
    }
    public static void main(String[] args) {

        TestEmployee testE = new TestEmployee();
        Employee manager = new Manager("jackey",6000,10000);
        Employee staff = new Staff("smith",4000);
        testE.showEmpAnnual(manager);
        testE.showEmpAnnual(staff);
        testE.testWork(manager);
        testE.testWork(staff);

    }
}
