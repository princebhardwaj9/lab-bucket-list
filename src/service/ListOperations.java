package service;

import model.*;

import java.util.*;

/*
public List add(TouristPlace places)
public List remove(TouristPlace places)
public Object sortByDestination(List places)
public Object sortByRank(List places)
public Object reset(List places)
Use lamda operations to sort.
The return type of all the methods are list.
 */

public class ListOperations{
	
	List<TouristPlace> placesList=new ArrayList<TouristPlace>();
	
	public List<TouristPlace> add(TouristPlace places) {
		//List<String> placesAdd=new ArrayList<String>();
		placesList.add(places);
		return placesList;
	}
	public List<TouristPlace> remove(TouristPlace places) {
		placesList.remove(places);
		return placesList;
	}
	public List sortByDestination(List<TouristPlace> places) {
		Collections.sort(places,(m1,m2)->m1.getDestination().compareTo(m2.getDestination()));
		return places;
	}
	public List sortByRank(List<TouristPlace> places) {
		Collections.sort(places,(m1,m2)->m1.getRank().compareTo(m2.getRank()));
		return places;
	}
	public List reset(List<TouristPlace> places) {
		places.clear();
		return places;
	}
}