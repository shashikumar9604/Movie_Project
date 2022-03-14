package com.MyMoviePlan.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "movie_shows")
public class MovieShowsEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Temporal(TemporalType.DATE)
    @Column(name = "show_start")
    private Date start;

    @Temporal(TemporalType.DATE)
    @Column(name = "show_end")
    private Date end;

    @Column(name = "movie_id")
    private int movieId;

    @JsonIgnore
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne(targetEntity = ShowEntity.class)
    private ShowEntity show;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @JoinColumn(name = "movie_show_id", referencedColumnName = "id")
    @OneToMany(targetEntity = BookingEntity.class, cascade = CascadeType.ALL)
//    @JoinTable(name = "movie_show_bookings",
//            joinColumns = @JoinColumn(name = "movie_show_id", unique = false),
//            inverseJoinColumns = @JoinColumn(name = "booking_id", unique = false))
    private List<BookingEntity> bookings;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToOne(targetEntity = PriceEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "price_id")
    private PriceEntity price;

    public MovieShowsEntity(int id, Date start, Date end, List<BookingEntity> bookings, int movieId) {
        this.id  = id;
        this.start = start;
        this.end = end;
        this.bookings = bookings;
        this.movieId = movieId;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public ShowEntity getShow() {
		return show;
	}

	public void setShow(ShowEntity show) {
		this.show = show;
	}

	public List<BookingEntity> getBookings() {
		return bookings;
	}

	public void setBookings(List<BookingEntity> bookings) {
		this.bookings = bookings;
	}

	public PriceEntity getPrice() {
		return price;
	}

	public void setPrice(PriceEntity price) {
		this.price = price;
	}

   
}
