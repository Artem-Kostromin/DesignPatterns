package credentional.abstractfactory.bankTeam;

import credentional.abstractfactory.Developer;
import credentional.abstractfactory.ProjectManager;
import credentional.abstractfactory.TeamFactory;
import credentional.abstractfactory.Tester;

public class BankTeamFactory implements TeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankPM();
    }
}
