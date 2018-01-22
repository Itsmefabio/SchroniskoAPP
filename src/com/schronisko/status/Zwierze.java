package com.schronisko.status;

import javax.persistence.*;

@Entity
@Table(name = "zwierzeta")
public class Zwierze {
	public Zwierze() {}
	 int id;
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getWiek() {
		return wiek;
	}
	public void setWiek(int wiek) {
		this.wiek = wiek;
	}
	public int getWaga() {
		return waga;
	}
	public void setWaga(int waga) {
		this.waga = waga;
	}
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getPlec() {
		return plec;
	}
	public void setPlec(String plec) {
		this.plec = plec;
	}
	public String getOpiekun() {
		return opiekun;
	}
	public void setOpiekun(String opiekun) {
		this.opiekun = opiekun;
	}
	int wiek;
	int waga;
	String imie;
	String plec;
	String opiekun;

}
