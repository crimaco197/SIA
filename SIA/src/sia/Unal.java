/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sia;

/**
 *
 * @author estig
 */
public class Unal {

    private String state;
    private String name;
    private String headquarters;   //sede
    private int number;
    private String student;
    private String informationUN;

    public String getInformationUN() {
        return this.informationUN;
    }

    public void setInformationUN(String student) {
        if ("CRISTIAN".equals(student)) {
            setState(student);
            setHeadquarters(student);
            setName();
            setNumber();
            this.informationUN = (getName() + " " + getHeadquarters() + "\n" + "Phone: " + getNumber() + "\n" + getState());
        } else {
            setState(student);
            setHeadquarters(student);
            setName();
            setNumber();
            this.informationUN = (getName() + " " + getHeadquarters() + "\n" + "Phone: " + getNumber() + "\n" + getState());

        }
    }

    public String getState() {
        return "Estado: " + this.state;
    }

    public void setState(String student) {
        if ("CRISTIAN".equals(student)) {
            this.state = "Active";
        } else {
            this.state = "Inactive";
        }

    }

    public String getName() {
        return "Universidad " + name;
    }

    public void setName() {
        this.name = "Nacional de Colombia";

    }

    public String getHeadquarters() {
        return this.headquarters;
    }

    public void setHeadquarters(String student) {
        if ("CRISTIAN".equals(student)) {
            this.headquarters = "Sede Bogotá";
        } else {
            this.headquarters = "Sede Medellin";
        }

    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber() {
        if ("Sede Bogotá".equals(headquarters)) {
            this.number = 3165000;
        } else if ("Sede Medellin".equals(headquarters)) {
            this.number = 4309000;
        }

    }

}
