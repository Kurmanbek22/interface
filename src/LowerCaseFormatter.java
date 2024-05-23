import java.time.LocalDate;

public class LowerCaseFormatter implements MassageFormatter{
    @Override
    public void formatMassage(String massage) {
        System.out.println(massage.toLowerCase());

    }
}
