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
@Table(name = "prices")
public class PriceEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double general;

    private double silver;

    private double gold;
    
    

    public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public double getGeneral() {
		return general;
	}



	public void setGeneral(double general) {
		this.general = general;
	}



	public double getSilver() {
		return silver;
	}



	public void setSilver(double silver) {
		this.silver = silver;
	}



	public double getGold() {
		return gold;
	}



	public void setGold(double gold) {
		this.gold = gold;
	}



	public PriceEntity(double general, double silver, double gold) {
        this.general = general;
        this.silver = silver;
        this.gold = gold;
    }
}
