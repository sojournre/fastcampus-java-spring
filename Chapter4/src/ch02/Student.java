package ch02;

import java.util.Objects;

public class Student implements Cloneable {
    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return studentId == student.studentId;
        if (o instanceof Student) {
            Student std = (Student) o;
            if (this.studentId == std.studentId)
                return true;
            else return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
//        return Objects.hash(studentId);
        return studentId;
    }
}
