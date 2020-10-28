import java.util.*;

public class Reference {

    private Set<ReferenceRecord> recordSet = new HashSet<>();

    public Reference() {
        init();
    }


    public Set<ReferenceRecord> getRecordSet() {
        return recordSet;
    }

    public Float findPrice(String placement, String type, String diameter){
        for (ReferenceRecord r: recordSet) {
            if (r.placement.equalsIgnoreCase(placement)
                    && r.type.equalsIgnoreCase(type)
                    && r.diameter.equalsIgnoreCase(diameter)) return r.price;
        }
        return null;
    }



    private void init() {
        recordSet.add(new ReferenceRecord("Надземные", "Стальные", "100мм и менее", 330f));
        recordSet.add(new ReferenceRecord("Надземные", "Стальные", "100мм - 200мм", 520f));
        recordSet.add(new ReferenceRecord("Подземные", "Стальные", "500 мм", 1600f));
        recordSet.add(new ReferenceRecord("Подземные", "Полипропиленовые", "300 мм", 790f));
    }


    public class ReferenceRecord {

        public String placement;
        public String type;
        public String diameter;
        public Float price;

        public ReferenceRecord(String placement, String type, String diameter, Float price) {
            this.placement = placement;
            this.type = type;
            this.diameter = diameter;
            this.price = price;
        }

        @Override
        public int hashCode() {
            return Objects.hash(placement, type, diameter, price);
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("ReferenceRecord{");
            sb.append("placement='").append(placement).append('\'');
            sb.append(", type='").append(type).append('\'');
            sb.append(", diameter='").append(diameter).append('\'');
            sb.append(", price=").append(price);
            sb.append('}');
            return sb.toString();
        }
    }

}
