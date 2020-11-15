package check;
import constants.Constants;

public class Check {
    private String firstName = "慎太郎";
    private String lastName = "塙";

    public void name(String firstName,String lastName) {
        System.out.println(firstName+lastName);
    }

 public static void main(String[] args) {
        Check    pn   = new Check();
        Pet      pet  = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
        RobotPet rp = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
        pn.name(pn.firstName, pn.lastName);
        pet.introduce();
        rp.introduce();
    }
 }
