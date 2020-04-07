package collection;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PassportOfficeTest {

    @Test
    public void add() {
        Citizen citizen1 = new Citizen("4010205850", "Ivan Ivanov");
        Citizen citizen2 = new Citizen("7895366545", "Sergey Sergeev");
        PassportOffice office = new PassportOffice();
        office.add(citizen1);
        office.add(citizen2);
        assertThat(office.get(citizen1.getPassport()), is(citizen1.getPassport()));
    }


    @Test
    public void addwhenfalse() {

        Citizen citizen1 = new Citizen("4010205850", "Ivan Ivanov");
        Citizen citizen2 = new Citizen("7895366545", "Sergey Sergeev");
        Citizen citizen3 = new Citizen("7895366545", "Vasiy Vasin");
        PassportOffice office = new PassportOffice();
        office.add(citizen1);
        office.add(citizen2);
        boolean result= office.add(citizen3);
        assertThat(result, is(false));
    }


}