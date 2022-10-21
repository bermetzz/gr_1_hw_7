public class Main {
    public static void main(String[] args){
        Medic medic=new Medic();
        medic.setHealPoints(10);
        HavingSuperAbility[] havingSuperAbilities={new Magic(), new Warrior(), medic};
        for (int i = 0; i < havingSuperAbilities.length; i++) {
            havingSuperAbilities[i].applySuperAbility();
            if(havingSuperAbilities[i] instanceof Medic){
                ((Medic) havingSuperAbilities[i]).increaseExperience();
            }
        }
    }
}
