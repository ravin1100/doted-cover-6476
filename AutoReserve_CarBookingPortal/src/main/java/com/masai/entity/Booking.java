package com.masai.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Booking_Id")
	private int bookingId;
	
	@Column(name = "User_Id")
	private int userId;
	
	@Column(name = "Car_Id")
	private int carId;
	
	@Column(name = "Booking_Date")
	private LocalDate bookingDate;
	
	@Column(name = "Start_Date")
	private LocalDate startDate;
	
	@Column(name = "End_Date")
	private LocalDate endDate;
	
	@Column(name = "total_cost", nullable = false)
	private int total_cost;
	
	@Column(name = "booking_status", nullable = false)
	private BookingStatus booking_status;

	public Booking() {
		super();
	}

	public Booking(int userId, int carId, LocalDate bookingDate, LocalDate startDate, LocalDate endDate, int total_cost,
			BookingStatus booking_status) {
		super();
		this.userId = userId;
		this.carId = carId;
		this.bookingDate = bookingDate;
		this.startDate = startDate;
		this.endDate = endDate;
		this.total_cost = total_cost;
		this.booking_status = booking_status;
	}

	public int getBookingId() {
		return bookingId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public int getTotal_cost() {
		return total_cost;
	}

	public void setTotal_cost(int total_cost) {
		this.total_cost = total_cost;
	}

	public BookingStatus getBooking_status() {
		return booking_status;
	}

	public void setBooking_status(BookingStatus booking_status) {
		this.booking_status = booking_status;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", userId=" + userId + ", carId=" + carId + ", bookingDate="
				+ bookingDate + ", startDate=" + startDate + ", endDate=" + endDate + ", total_cost=" + total_cost
				+ ", booking_status=" + booking_status + "]";
	}
	


}
