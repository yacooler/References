public class MainApp {
    public static void main(String[] args) {
        Reference reference = new Reference();

        for (Reference.ReferenceRecord r: reference.getRecordSet()) {
            System.out.println(r);
        }

        Float price = reference.findPrice("Надземные", "Стальные", "100мм - 200мм");

        System.out.println(price);

    }
}
