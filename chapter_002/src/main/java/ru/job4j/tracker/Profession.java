package ru.job4j.tracker;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private String birthday;

    public Profession(String name,String surname,String education,String birthday){
        this.name=name;
        this.surname=birthday;
        this.education=education;
        this.birthday=birthday;
    }

    public Profession(){

    }

    public void earnMoney() {

    }

    public void payTaxes(){

    }
    public void getVacation(){

    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
