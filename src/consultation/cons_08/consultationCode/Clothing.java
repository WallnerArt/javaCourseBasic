package consultation.cons_08.consultationCode;

public class Clothing extends Good{
    public Clothing(int id, String catalogNumber, String goodName, String producer) {
        super(id, catalogNumber, goodName, producer,"Clothing");
    }



    @Override
    void checkGoodOnWarehouse() {

    }
}
