package es.ucm.fdi.tfg.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Film {

    @Id
    private String uuid;

    private String name;

    private String idDirector;

    private String trailer;

    private String description;

    private String genre;

    private int duration;

    private int valoration;

    private String country;

    /**
     * @return the uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * @param uuid the uuid to set
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the idDirector
     */
    public String getIdDirector() {
        return idDirector;
    }

    /**
     * @param idDirector the idDirector to set
     */
    public void setIdDirector(String idDirector) {
        this.idDirector = idDirector;
    }

    /**
     * @return the trailer
     */
    public String getTrailer() {
        return trailer;
    }

    /**
     * @param trailer the trailer to set
     */
    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return the duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * @return the valoration
     */
    public int getValoration() {
        return valoration;
    }

    /**
     * @param valoration the valoration to set
     */
    public void setValoration(int valoration) {
        this.valoration = valoration;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }


}