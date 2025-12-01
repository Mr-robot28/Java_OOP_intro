package com.hospital.calling;

import com.hospital.details.Hospital;

public class HospitalCaller {
	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		String name1 = hospital.hospitalName = "City Care Hospital";
		String loc1 = hospital.location = "Baner, Pune";
		int doc1 = hospital.totalDoctors = 85;
		int nurse1 = hospital.totalNurses = 150;
		int beds1 = hospital.totalBeds = 300;
		String spec1 = hospital.specialization = "Multi-Speciality";
		boolean gov1 = hospital.isGovernment = false;
		double rate1 = hospital.rating = 4.6;
		String headDoc1 = hospital.headDoctor = "Dr. Neha Kulkarni";
		int year1 = hospital.establishedYear = 1998;

		System.out.println("Hospital Name: " + hospital.hospitalName);
		System.out.println("Location: " + hospital.location);
		System.out.println("Total Doctors: " + hospital.totalDoctors);
		System.out.println("Total Nurses: " + hospital.totalNurses);
		System.out.println("Total Beds: " + hospital.totalBeds);
		System.out.println("Specialization: " + hospital.specialization);
		System.out.println("Is Government: " + hospital.isGovernment);
		System.out.println("Rating: " + hospital.rating);
		System.out.println("Head Doctor: " + hospital.headDoctor);
		System.out.println("Established Year: " + hospital.establishedYear);
	}

}
