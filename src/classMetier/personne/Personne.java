package classMetier.personne;

import classMetier.Util.Adresse;
import classMetier.Util.Regex;

import java.util.regex.Pattern;

public abstract class Personne {
    private String nom;
    private String prenom;
    private String mail;
    private String tel;
    private Adresse adresse;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom)throws IllegalArgumentException {

            if (Pattern.matches(Regex.getRegexNom(),nom)) {
                this.nom = nom;
            }
            else {
                throw new IllegalArgumentException("Nom incorrecte");
            }
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom)throws IllegalArgumentException {

            if (Pattern.matches(Regex.getRegexPrenom(),prenom)){
                this.prenom = prenom;
            }
            else {
                throw new IllegalArgumentException("Prenom incorrecte");
            }
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail)throws IllegalArgumentException {
            if (Pattern.matches(Regex.getRegexMail(),mail)){
                this.mail = mail;
            }
            else {
                throw new IllegalArgumentException("mail incorrecte");
            }
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel)throws IllegalArgumentException {
            if (Pattern.matches(Regex.getRegexTel(),tel)){
                this.tel = tel;
            }
            else {
                throw new IllegalArgumentException("Numéro de téléphone incorrecte");
            }
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        if (adresse==null){
            throw new NullPointerException("l'adresse ne peut etre null");
        }
        else {
            this.adresse = adresse;
        }
    }

    /**
     * constructeur Personne
     * @param nom String (controle ar REGEX)
     * @param prenom String (controle ar REGEX)
     * @param mail String (controle ar REGEX)
     * @param tel String (controle ar REGEX)
     * @param adresse Adresse
     */
    public Personne(String nom, String prenom, String mail, String tel, Adresse adresse) {
        setNom(nom);
        setPrenom(prenom);
        setMail(mail);
        setTel(tel);
        setAdresse(adresse);
    }
}
