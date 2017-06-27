package com.pb.entity;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Address entity. @author MyEclipse Persistence Tools
 */

public class Address implements java.io.Serializable {

	// Fields

	private Integer addrId;
	private String province;
	private String city;
	private Double latitude;
	private Double longtitude;
	private String geohash;

	@JsonIgnore
	private Set bookstores = new HashSet(0);

	// Constructors

	/** default constructor */
	public Address() {
	}

	/** minimal constructor */
	public Address(Integer addrId) {
		this.addrId = addrId;
	}

	/** full constructor */
	public Address(Integer addrId, String province, String city,
			Double latitude, Double longtitude, String geohash, Set bookstores) {
		this.addrId = addrId;
		this.province = province;
		this.city = city;
		this.latitude = latitude;
		this.longtitude = longtitude;
		this.geohash = geohash;
		this.bookstores = bookstores;
	}

	// Property accessors

	public Integer getAddrId() {
		return this.addrId;
	}

	public void setAddrId(Integer addrId) {
		this.addrId = addrId;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongtitude() {
		return this.longtitude;
	}

	public void setLongtitude(Double longtitude) {
		this.longtitude = longtitude;
	}

	public String getGeohash() {
		return this.geohash;
	}

	public void setGeohash(String geohash) {
		this.geohash = geohash;
	}

	public Set getBookstores() {
		return this.bookstores;
	}

	public void setBookstores(Set bookstores) {
		this.bookstores = bookstores;
	}

}