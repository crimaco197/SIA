/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sia;

// import java.security.acl.Group;
/**
 *
 * @author estig
 */
public class Student {

    private int id;
    private String name;
    private double papa;
    private String birthDay;
    private String information;
    private String email;
    private String cellPhone;
    private String address;
    private final Unal unal;
    private final Subjects subjects;
    
    public Student() {
        this.unal = new Unal();
        this.subjects = new Subjects();
    }

    public void setInformation(String name) {
        if ("CRISTIAN".equals(name)) {
            setName(name);
            setBirthday(name);
            setId(name);
            setAddress(name);
            setEmail(name);
            setCellphone(name);
            setPAPA(name);
            unal.setInformationUN(name.toUpperCase());
            this.information = (getName() + "\n" + "ID: " + getId() + "\n" + getBirthday() + "\n" + getAddress() + "\n" + getEmail() + "\n" + getCellphone() + "\n" + "PAPA: " + getPAPA() + "\n\n" + unal.getInformationUN());

            //unal.setInformationUN(name.toUpperCase());
            // System.out.println(unal.getInformationUN());
        } else {
            setName(name);
            setBirthday(name);
            setId(name);
            setAddress(name);
            setEmail(name);
            setCellphone(name);
            setPAPA(name);
            this.information = (getName() + "\n" + "ID: " + getId() + "\n" + getBirthday() + "\n" + getAddress() + "\n" + getEmail() + "\n" + getCellphone() + "\n" + "PAPA: " + getPAPA() + "\n\n" + unal.getInformationUN());
        }
    }

    public String getInformation() {
        return this.information;
    }

    public String getName() {
        return "Name: " + this.name;
    }

    public void setName(String name) {

        if ("CRISTIAN".equals(name)) {
            this.name = name;
        } else {
            System.out.println("Invalid name, using default name...");
            this.name = "Pepito Perez";
        }
    }

    public int getId() {
        return id;
    }

    public void setId(String name) {
        if ("CRISTIAN".equals(name)) {
            this.id = 1032494634;
        } else {
            this.id = 1010244322;
        }

    }

    public double getPAPA() {
        return this.papa;
    }

    public void setPAPA(String name) {
        if ("CRISTIAN".equals(name)) {
            this.papa = 4.3;
        } else {
            this.papa = 3.6;
        }
    }

    public String getBirthday() {
        return "Birthday: " + this.birthDay;
    }

    public void setBirthday(String name) {
        if ("CRISTIAN".equals(name)) {
            this.birthDay = "Nov/18/1997";
        } else {
            this.birthDay = "Ene/01/1989";
        }

    }

    public String getCellphone() {
        return "Cellphone: " + this.cellPhone;

    }

    public void setCellphone(String name) {
        if ("CRISTIAN".equals(name)) {
            this.cellPhone = "(+57)318 5707 044";
        } else {
            this.cellPhone = "(+61)451 993 479";
        }
    }

    public String getEmail() {
        return "Email: " + this.email;

    }

    public void setEmail(String name) {
        if ("CRISTIAN".equals(name)) {
            this.email = "crmartinezco@unal.edu.co";
        } else {
            this.email = "pepereza@unal.edu.co";
        }
    }

    public String getAddress() {
        return "Address: " + this.address;
    }

    public void setAddress(String name) {
        if ("CRISTIAN".equals(name)) {
            this.address = "Calle 7D # 78-94";
        } else {
            this.address = "Calle 58 sur # 77H-49";
        }
    }

}
