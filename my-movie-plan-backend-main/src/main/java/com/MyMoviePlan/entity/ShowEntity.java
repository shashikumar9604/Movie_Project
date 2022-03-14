package com.MyMoviePlan.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "shows")
public class ShowEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(name = "start_time")
    private String startTime;

    @JsonIgnore
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne(targetEntity = AuditoriumEntity.class)
    private AuditoriumEntity auditorium;

    //    @JsonManagedReference
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(targetEntity = MovieShowsEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "show_id", referencedColumnName = "id")
    private List<MovieShowsEntity> movieShows;

    public ShowEntity(String name, String startTime, List<MovieShowsEntity> movieShows) {
        this.name = name;
        this.startTime = startTime;
        this.movieShows = movieShows;
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



	public String getStartTime() {
		return startTime;
	}



	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}



	public AuditoriumEntity getAuditorium() {
		return auditorium;
	}



	public void setAuditorium(AuditoriumEntity auditorium) {
		this.auditorium = auditorium;
	}



	public List<MovieShowsEntity> getMovieShows() {
		return movieShows;
	}



	public ShowEntity setMovieShows(List<MovieShowsEntity> movieShows) {
        this.movieShows = movieShows;
        return this;
    }
}
