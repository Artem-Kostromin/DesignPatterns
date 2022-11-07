package credentional.abstractfactory;

import credentional.abstractfactory.bankTeam.BankTeamFactory;

public class BankProject {
    public static void main(String[] args) {
        credentional.abstractfactory.TeamFactory teamFactory = new BankTeamFactory();
        teamFactory.getDeveloper().startWorking();
        teamFactory.getTester().startWorking();
        teamFactory.getProjectManager().startWorking();
    }
}
