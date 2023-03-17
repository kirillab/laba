public class Student {
    private int course, group, id;
    private String secondName, firstName, thirdName, date, address, phone,faculty;


    Student(int id, int group, String firstName, String secondName){
        this.id = id;
        this.group = group;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    Student(String secondName, String firstName, String thirdName,
            String date, String address, String phone, int id,
            String faculty, int course, int group){
        this(id,group,firstName,secondName);
        this.faculty = faculty;
        this.course = course;
        this.thirdName = thirdName;
        this.date = date;
        this.address = address;
        this.phone = phone;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getSecondName(){
        return this.secondName;
    }
    public String getThirdName(){
        return this.thirdName;
    }
    public String getDate(){
        return this.date;
    }
    public String getAddress(){
        return this.address;
    }
    public String getFaculty(){
        return this.faculty;
    }
    public String getPhone(){
        return this.phone;
    }
    public int getId(){
        return this.id;
    }
    public int getGroup(){
        return this.group;
    }
    public int getCourse(){
        return this.course;
    }


    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setSecondName(String secondName){
        this.secondName = secondName;
    }
    public void setThirdName(String thirdName){
        this.thirdName = thirdName;
    }

    public void setDate(String date){
        this.date = date;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public void getFaculty(String faculty){
        this.faculty = faculty;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setGroup(int group){
        this.group = group;
    }
    public void setCourse(){
        this.course = course;
    }

    @Override
    public String toString(){
        return "Id: " + id + "\n" +
                "Фамилия: " + secondName + "\n" +
                "Имя: " + firstName + "\n" +
                "Отчество: " + thirdName + "\n" +
                "Факультет: " + faculty + "\n" +
                "Группа: " + group + "\n" +
                "Курс: " + course + "\n" +
                "Дата рождения: " + date + "\n" +
                "Номер телефона: " + phone + "\n" +
                "Адрес: " + address + "\n"+
                "----------------------------------\n";
        }

}
