package com.MyMoviePlan.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "movies")
public class MovieEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(length = Integer.MAX_VALUE, columnDefinition = "TEXT")
    private String image;

    @Column(name = "bg_image", length = Integer.MAX_VALUE, columnDefinition="TEXT")
    private String bgImage;

    @Column(length = 9000)
    private String story;

    private String year;

    private String duration;

    private String caption;

    @Column(name = "added_on")
    @Temporal(TemporalType.DATE)
    private Date addedOn;

    @Temporal(TemporalType.DATE)
    private Date release;

    private String language;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ElementCollection
    @CollectionTable(name = "movie_genres", joinColumns = @JoinColumn(name = "movie_id"))
    @Column(name = "genre")
    private List<String> genres;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(targetEntity = ActorEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "movie_id", referencedColumnName = "id")
    private List<ActorEntity> casts;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(targetEntity = ActorEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "movie_id", referencedColumnName = "id")
    private List<ActorEntity> crews;

    public MovieEntity(String name, String image, String bgImage, String story, String year,
                       String duration, String caption, Date addedOn, Date release, String language,
                       List<String> genres, List<ActorEntity> casts, List<ActorEntity> crews) {
        this.name = name;
        this.image = image;
        this.bgImage = bgImage;
        this.story = story;
        this.year = year;
        this.duration = duration;
        this.caption = caption;
        this.addedOn = addedOn;
        this.release = release;
        this.language = language;
        this.genres = genres;
        this.casts = casts;
        this.crews = crews;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getBgImage() {
		return bgImage;
	}

	public void setBgImage(String bgImage) {
		this.bgImage = bgImage;
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public Date getAddedOn() {
		return addedOn;
	}

	public void setAddedOn(Date addedOn) {
		this.addedOn = addedOn;
	}

	public Date getRelease() {
		return release;
	}

	public void setRelease(Date release) {
		this.release = release;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public List<String> getGenres() {
		return genres;
	}

	public void setGenres(List<String> genres) {
		this.genres = genres;
	}

	public List<ActorEntity> getCasts() {
		return casts;
	}

	public void setCasts(List<ActorEntity> casts) {
		this.casts = casts;
	}

	public List<ActorEntity> getCrews() {
		return crews;
	}

	public void setCrews(List<ActorEntity> crews) {
		this.crews = crews;
	}

   
}
