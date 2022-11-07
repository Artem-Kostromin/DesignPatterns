package credentional.abstractfactory.bankTeam;

import credentional.abstractfactory.ProjectManager;

public class BankPM implements ProjectManager {
    @Override
    public void startWorking() {
        System.out.println("Bank PM start working");
    }
}
