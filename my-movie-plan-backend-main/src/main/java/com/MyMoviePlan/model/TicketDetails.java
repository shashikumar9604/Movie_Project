package com.MyMoviePlan.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class TicketDetails {

    public TicketDetails(String name, String name2, String startTime, double amount2, String name3, String image,
			String bgImage) {
		// TODO Auto-generated constructor stub
	}

	private String auditoriumName;

    private String showName;

    private String showTiming;

    private double amount;

    private String movieName;

    private String movieImage;

    private String movieBgImage;
}
