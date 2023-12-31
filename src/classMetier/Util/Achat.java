package classMetier.Util;

import classMetier.personne.Client;
import classMetier.sante.Medicament;
import classMetier.sante.Ordonnance;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Achat {
    private Client client;
    private ArrayList<Medicament> listMed;
    private double prix;
    private String date;

    private Ordonnance ordonnance;

    /**
     * constructeur Achat
     * @param client voir classe Client
     * @param listMed ArrayList<Medicament></>( liste medicament de l'achat)
     * @param prix double (2 chiffres apres la virgule)
     * @param date String (date format jj/mm/aaaa)
     * @param ordonnance voir classe Ordonnance
     */
    public Achat(Client client, ArrayList<Medicament> listMed, double prix, String date, Ordonnance ordonnance) {
        setClient(client);
        setListMed(listMed);
        setPrix(prix);
        setDate(date);
        setOrdonnance(ordonnance);
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        try{
            if (client != null){
                this.client = client;
            }
            else {
                throw new NullPointerException("Pas de client");
            }
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Medicament> getListMed() {
        return listMed;
    }

    public void setListMed(ArrayList<Medicament> listMed) {
        try{
            if (listMed.isEmpty()){
                throw new NullPointerException("listMed vide");
            }else {
                this.listMed = listMed;
            }
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix)throws IllegalArgumentException {
        if (prix>0) {
            this.prix = prix;
        }
        else {
            throw new IllegalArgumentException("le prix doit etre positif");
        }
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date)throws IllegalArgumentException {
        if (Pattern.matches(Regex.getRegexDate(),date)){
            this.date = date;
        }
        else {
            throw new IllegalArgumentException("date incorrecte");
        }
    }

    public Ordonnance getOrdonnance() {
            return ordonnance;
    }

    public void setOrdonnance(Ordonnance ordonnance) {
        this.ordonnance = ordonnance;
    }
}
