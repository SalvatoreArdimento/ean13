package dbmanagement;

public class Card {
    private int id ;
    private String cardNo ;

    public void setId(int id){
        this.id = id;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public int getId() {
        return id;
    }

    public String getCardNo() {
        return cardNo;
    }
}
