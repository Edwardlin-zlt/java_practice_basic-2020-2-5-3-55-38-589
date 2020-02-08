import model.Student;
import model.Teacher;

public class Application {

    public static void main(String[] args) {

        Student stuLiLi = new Student("李莉", 20, false);
        printAll(stuLiLi);

        Student stuWangQi = new Student("王其", 21, true);
        Student stuZhaoYi = new Student("赵毅", 22, true);
        Teacher teacher = new Teacher("张龙", new Student[]{stuLiLi, stuWangQi});
        teacher.addStudent(stuZhaoYi);
        teacher.listStudents();
    }

    public static void printAll(Student stu) {
        System.out.println("姓名: " + stu.getName());
        System.out.println("年龄: " + stu.getAge() + "岁");
        if (stu.isMale()) {
            System.out.println("性别: 男");
        } else {
            System.out.println("性别: 女");
        }
        stu.study();
        stu.rest();
        System.out.println("======================");
    }
}
