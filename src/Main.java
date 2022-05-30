import com.stepik_course.figure.Circle;
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Окружность", 5);
        System.out.println(circle.getName() + " с радиусом: " + circle.r);
        System.out.println();
    }
}
