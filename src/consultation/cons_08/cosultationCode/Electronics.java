package consultation.cons_08.cosultationCode;

public class Electronics extends Good{
    public Electronics(int id, String catalogNumber, String goodName, String producer) {
        super(id, catalogNumber, goodName, producer, "Electronics");
    }

    @Override
    void checkGoodOnWarehouse() {
        //...
    }
}
