package collection;

import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!citizens.containsKey(citizen.getPassport())  ) {
            citizens.put(citizen.getPassport(), citizen);
            rsl=true;
        }
        return rsl;
    }


    public String get(String passport) {
        return passport;
    }

    public static void main(String[] args) {
        Citizen citizen1= new Citizen("4010","qwwq5467w");
        Citizen citizen2= new Citizen("4010","qww12qw");
        Citizen citizen3= new Citizen("4040","qw2342qw");
        PassportOffice passportOffice=new PassportOffice();
        System.out.println(passportOffice.add(citizen1));
        System.out.println(passportOffice.add(citizen2));
        System.out.println(passportOffice.add(citizen3));
        System.out.println();
    }

}