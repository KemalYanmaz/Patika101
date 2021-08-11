public class BBankasi {
    private String bankaAdi;
    private String terminalID;
    private String password;

    public BBankasi(String bankaAdi,String terminalID,String password){
        this.bankaAdi = bankaAdi;
        this.terminalID = terminalID;
        this.password = password;
    }

    public void connect(){
        System.out.println(this.getBankaAdi() + " bağlanıldı");
    }

    public void payment(double price,String cardNumber,String expiredDate,String cvc){
        System.out.println("İşlem başarılı oldu");
    }

    public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getTerminalID() {
        return terminalID;
    }

    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
