package credentional.abstractfactory.bankTeam;

import credentional.abstractfactory.Developer;

class JavaDeveloper implements Developer {

    @Override
    public void startWorking() {
        System.out.println("Developer start working");
    }
}
