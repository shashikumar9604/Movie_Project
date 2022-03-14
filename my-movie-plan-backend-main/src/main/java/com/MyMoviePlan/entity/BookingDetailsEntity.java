package com.MyMoviePlan.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "booking_details")
public class BookingDetailsEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "auditorium_id")
    private int auditoriumId;

    @Column(name = "show_id")
    private int showId;

    @Column(name = "movie_show_id")
    private int movieShowId;

    @Column(name = "movie_id")
    private int movieId;
    
    

    public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getAuditoriumId() {
		return auditoriumId;
	}



	public void setAuditoriumId(int auditoriumId) {
		this.auditoriumId = auditoriumId;
	}



	public int getShowId() {
		return showId;
	}



	public void setShowId(int showId) {
		this.showId = showId;
	}



	public int getMovieShowId() {
		return movieShowId;
	}



	public void setMovieShowId(int movieShowId) {
		this.movieShowId = movieShowId;
	}



	public int getMovieId() {
		return movieId;
	}



	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}



	public BookingDetailsEntity(int auditoriumId, int showId, int movieShowId, int movieId) {
        this.auditoriumId = auditoriumId;
        this.showId = showId;
        this.movieShowId = movieShowId;
        this.movieId = movieId;
    }
}
