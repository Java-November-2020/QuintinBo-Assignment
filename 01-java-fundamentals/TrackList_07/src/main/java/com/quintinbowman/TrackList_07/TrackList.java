package com.quintinbowman.TrackList_07;

import java.util.HashMap;
import java.util.Set;

public class TrackList {

	public static void main(String[] args) {
		 HashMap<String, String> TrackLists = new HashMap<String, String>();
	        TrackLists.put("Shake This", "To know is not enough, you must apply.");
	        TrackLists.put("Make Amends", "Reprecussion, Consequenses, The bible is a good read, with a"
	        		+ "lot of contradictions.");
	        TrackLists.put("All Bad", "It was all good, til it went bad.");
	        TrackLists.put("Unnecessary Pain", "I went so long not caring that it's no longer erratic,"
	        		+ "now it's a normal habit.");
	        
	        Set<String> lyrics = TrackLists.keySet();
	        for(String song : lyrics) {
	            System.out.println(song);
	            System.out.println(TrackLists.get(song));    
	        }

	}

}
