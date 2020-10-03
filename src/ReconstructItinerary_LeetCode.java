//Given a list of airline tickets represented by pairs of departure and arrival airports [from, to], reconstruct the itinerary in order. All of the tickets belong to a man who departs from JFK. Thus, the itinerary must begin with JFK.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*Input: [["MUC", "LHR"], ["JFK", "MUC"], ["SFO", "SJC"], ["LHR", "SFO"]]
        Output: ["JFK", "MUC", "LHR", "SFO", "SJC"]
        
        Input: [["JFK","SFO"],["JFK","ATL"],["SFO","ATL"],["ATL","JFK"],["ATL","SFO"]]
        Output: ["JFK","ATL","JFK","SFO","ATL","SFO"]
        Explanation: Another possible reconstruction is ["JFK","SFO","ATL","JFK","ATL","SFO"].
        But it is larger in lexical order.*/
public class ReconstructItinerary_LeetCode {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		List<List<String>> tickets = new ArrayList<List<String>>() {
			{
				add(new ArrayList<String>() {
					{
						add("JFK");
						add("SFO");
					}
				});

				add(new ArrayList<String>() {
					{
						add("JFK");
						add("ATL");
					}
				});

				add(new ArrayList<String>() {
					{
						add("SFO");
						add("ATL");
					}
				});

				add(new ArrayList<String>() {
					{
						add("ATL");
						add("JFK");
					}
				});

				add(new ArrayList<String>() {
					{
						add("ATL");
						add("SFO");
					}
				});
			}
		};
		List<String> result = findItinerary(tickets);
		System.out.println(result != null ? result.toString() : "null");
	}

	public static List<String> findItinerary(List<List<String>> tickets) {
		List<String> result = new ArrayList<String>(tickets.size() + 1);
		Map<String, List<String>> map = new HashMap<>();
		Map<String, Integer> pointer = new HashMap<String, Integer>();
		tickets.stream().forEach(ticket -> {
			String start = ticket.get(0);
			List<String> value = map.get(start);
			pointer.put(start, 0);
			if (value == null) {
				map.put(start, new ArrayList<String>() {
					{
						add(ticket.get(1));
					}
				});
			} else {
				value.add(ticket.get(1));
			}
		});

		map.forEach((k, v) -> {
			Collections.sort(v);
		});

		String start = "JFK";
		int size = tickets.size() + 1;
		int count = 0;

		result.add(start);
		count++;
		while (true) {
			List<String> end = map.get(start);
			Integer x = pointer.get(start);
			if (end == null || x >= end.size()) {
				break;
			} else {
				String dest = end.get(x);
				result.add(dest);
				pointer.put(start, x + 1);
				start = dest;
				count++;
			}
		}

		if (count != size) {
			result = null;
		}
		return result;
	}
}
