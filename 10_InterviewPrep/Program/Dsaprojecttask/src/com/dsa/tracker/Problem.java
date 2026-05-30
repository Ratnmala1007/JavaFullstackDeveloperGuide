package com.dsa.tracker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Problem1 {

	int id;
	String name;
	String topic;
	String difficulty;
	String status;
	@Override
	public String toString() {
		return "Problem1 [id=" + id + ", name=" + name + ", topic=" + topic + ", difficulty=" + difficulty + ", status="
				+ status + "]";
	}
}

public class Problem {
	public static void main(String[] args) {
		List<Problem1> problems = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();
		
		Problem1 p = new Problem1();
		Problem1 p1 = new Problem1();
		Problem1 p2 = new Problem1();

		// List 1
		p.id = 1;
		p.name = "Two sum";
		p.topic = "Array";
		p.difficulty = "easy";
		p.status = "not solve";
		// List 2
		p1.id = 2;
		p1.name = "subsequences";
		p1.topic = "String";
		p1.difficulty = "medium";
		p1.status = "solved";

		// List 3

		p2.id = 3;
		p2.name = "Subset";
		p2.topic = "Array";
		p2.difficulty = "medium";
		p2.status = "solved";

		problems.add(p);
		problems.add(p1);
		problems.add(p2);

		for (Problem1 prob : problems) {

//			if("Array".equals(prob.topic)) {
//			System.out.println(prob);
//			
//		}
			String topic = prob.topic;
			String status = prob.status;

			if (map.containsKey(status)) {
				map.put(status, map.get(status) + 1);
			} else {
				map.put(status, 1);
			}
		}
		for (String key : map.keySet()) {
			System.out.println(key + " → " + map.get(key));
		}
	}

}