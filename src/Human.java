public class Human implements Comparable<Human> {
    private String name;
    private String lastname;
    int year;
    int averageMark;

    public Human(String name, String lastname, int year, int averageMark) {
        this.name = name;
        this.lastname = lastname;
        this.year = year;
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Name " + name + " LastName " + lastname + " Year " + year + " Average Mark " + averageMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(int averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public int compareTo(Human other) {
        if (this.averageMark == other.averageMark) {
            return 0;
        } else if (this.averageMark < other.averageMark) {
            return -1;
        } else {
            return 1;
        }


//        return this.name.compareTo(other.name);
    }
}

