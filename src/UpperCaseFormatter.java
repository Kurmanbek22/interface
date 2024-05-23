public class UpperCaseFormatter implements MassageFormatter{
    @Override
    public void formatMassage(String massage) {
        System.out.println(massage.toUpperCase());
    }
}
