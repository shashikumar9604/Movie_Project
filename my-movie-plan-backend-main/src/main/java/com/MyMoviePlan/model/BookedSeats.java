package com.MyMoviePlan.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookedSeats {

    public BookedSeats(int count2, List<String> seats2) {
		// TODO Auto-generated constructor stub
	}
	private int count;
    private List<String> seats;
}
