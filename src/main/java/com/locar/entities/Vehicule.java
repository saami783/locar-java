package com.locar.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String modele;
    private float caution;
    private int nbKm;
    private int nbPlace;
    private String couleur;
    private int annee;
    private String boiteVitesse;
    private String fuel;
    private int nbCheveaux;
    private boolean isDisponible;
    private String etat;
    private String description;
    private String folder;
    @OneToMany(mappedBy = "vehicule", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Tarif> tarifs;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;
    @OneToMany(mappedBy = "vehicule", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<VehiculeImages> images;
    private Date createdAt;

    public Vehicule() {
        this.tarifs = new ArrayList<>();
        this.images = new ArrayList<>();
    }

    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public float getCaution() {
        return caution;
    }

    public void setCaution(float caution) {
        this.caution = caution;
    }

    public int getNbKm() {
        return nbKm;
    }

    public void setNbKm(int nbKm) {
        this.nbKm = nbKm;
    }

    public int getNbPlace() {
        return nbPlace;
    }

    public void setNbPlace(int nbPlace) {
        this.nbPlace = nbPlace;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getBoiteVitesse() {
        return boiteVitesse;
    }

    public void setBoiteVitesse(String boiteVitesse) {
        this.boiteVitesse = boiteVitesse;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getNbCheveaux() {
        return nbCheveaux;
    }

    public void setNbCheveaux(int nbCheveux) {
        this.nbCheveaux = nbCheveux;
    }

    public void setIsDisponible(boolean disponible) {
        this.isDisponible = disponible;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public List<Tarif> getTarifs() {
        return this.tarifs;
    }

    public List<Tarif> addTarifs(Tarif tarif) {
        if (!this.tarifs.contains(tarif)) {
            this.tarifs.add(tarif);
        }

        return this.tarifs;
    }

    public List<Tarif> removeTarifs(Tarif tarif) {
        this.tarifs.remove(tarif);
        return this.tarifs;
    }

    public List<VehiculeImages> getImages() {
        return this.images;
    }

    public List<VehiculeImages> addImages(VehiculeImages image) {
        if (!this.images.contains(image)) {
            this.images.add(image);
        }

        return this.images;
    }

    public List<VehiculeImages> removeImages(VehiculeImages image) {
        this.images.remove(image);
        return this.images;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public boolean isDisponible() {
        return isDisponible;
    }

    public void setDisponible(boolean disponible) {
        isDisponible = disponible;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public void setTarifs(List<Tarif> tarifs) {
        this.tarifs = tarifs;
    }

    public void setImages(List<VehiculeImages> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "id=" + id +
                ", modele='" + modele + '\'' +
                ", caution=" + caution +
                ", nbKm=" + nbKm +
                ", nbPlace=" + nbPlace +
                ", couleur='" + couleur + '\'' +
                ", annee=" + annee +
                ", boiteVitesse='" + boiteVitesse + '\'' +
                ", fuel='" + fuel + '\'' +
                ", nbCheveaux=" + nbCheveaux +
                ", isDisponible=" + isDisponible +
                ", etat='" + etat + '\'' +
                ", description='" + description + '\'' +
                ", tarifs=" + tarifs +
                ", categorie=" + categorie +
                ", images=" + images +
                '}';
    }
}
