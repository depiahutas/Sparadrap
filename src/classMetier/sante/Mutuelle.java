package classMetier.sante;

import classMetier.Util.Adresse;

public class Mutuelle {
    private Adresse adresse;
    private String nom;
    private String tel;
    private String mail;
    private int txPECR;

    /**
     * constructeur Mutuelle
     * @param adresse Adresse
     * @param nom String (controle par REGEX)
     * @param tel String (controle par REGEX)
     * @param mail String (controle par REGEX)
     * @param txPECR int (controle par REGEX)
     */
    public Mutuelle(Adresse adresse, String nom, String tel, String mail, int txPECR) {
        setAdresse(adresse);
        setNom(nom);
        setTel(tel);
        setMail(mail);
        setTxPECR(txPECR);
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        if (adresse == null) {
            throw new NullPointerException("l'adresse ne peut etre null");
        } else {
            this.adresse = adresse;
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if(nom==null){
            throw new NullPointerException("le nom ne peut etre null");
        }
        else {
            this.nom = nom;
        }
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        if(tel==null){
            throw new NullPointerException("le tel ne peut etre null");
        }
        else {
            this.tel = tel;
        }
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        if(mail==null){
            throw new NullPointerException("le mail ne peut etre null");
        }
        else {
            this.mail = mail;
        }
    }


    public int getTxPECR() {
        return txPECR;
    }

    public void setTxPECR(int txPECR) {

        this.txPECR = txPECR;
    }
}
