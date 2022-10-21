public class Medic extends Hero{
    int healPoints;

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }
    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность DAMAGE");
    }
    public void increaseExperience(){
        int calculate=(getHealPoints()*10)/100;
        healPoints+=calculate;
        System.out.println("heal points now are: "+healPoints);
    }
}
