import ru.netology.services.WorkOrRestService;

public class Main {

    public static void main(String[] args) {
        WorkOrRestService service = new WorkOrRestService();
        System.out.println("В этом году можно отдыхать " + service.calcCash(100_000, 60_000, 150_000) + " месяцев");
    }
}
