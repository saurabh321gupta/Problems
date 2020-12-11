import java.io.IOException;
import java.util.*;

public class Test {

	/*String type;
	String value;
	List<Node> child;

	void show() {
		Map<String, String> map = new HashMap() {
			{
				put("country", "India");
			}
		};

		String smallest = "country";// getSmall();
		String value = map.get(smallest);

		String identifier = value;
		boolean isParent = true;// isParentExists(smallest);
		String parent = null;
		do {
			if (isParent) {
				parent = "country_group";// getParent(smallest);
				String parentValue = map.get(parent);
				if (parentValue == null) {
					parentValue = "Asia";// getParentValueFromDb(parent, value);
				}
				identifier = parentValue + ":" + identifier;
				value = parentValue;
				smallest = parent;
				parent = "region";// getParent(smallest);
			} else {
				break;
			}
		} while (parent != null);
		System.out.println(identifier);
		/// X : Asia : India = state (country)
		/// X : Asia = state (country_group)
		/// X = state (region)
*//*
    List<String> tracker = new ArrayList<>();
    List<List<List<String>>> list = new ArrayList<>();
	for(List<List<String>> x1 : list ){
	    StringBuilder sb = new StringBuilder();
        list.stream().forEach(x-> sb.append(x + ":"));
        sb.append("value for x1");
        String key = sb.toString();
        for(List<String> )*//*
    }


















	Map<String, Map<String, List<String>>> parentMap = new HashMap<>();



	parentMap.put("country_group", new HashMap(){{
	    put("X:Asia", Arrays.asList("state"));
        put("X:NAmerica", Arrays.asList("state"));
    }});

        parentMap.put("country", new HashMap(){{
            put("X:Asia:India", Arrays.asList("state"));
        }});

        parentMap.put("region", new HashMap(){{
            put("X", Arrays.asList("state"));
            put("y", Arrays.asList("city"));
            put("z", Arrays.asList("city"));
        }});


        Map x = parentMap.get("coutrn_group");
        if(x!=null){
            x.put("adadaw",wqddq);
        }
}*/

    public static void main(String[] args) throws IOException {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            int x = iterator.next();
            if(x==2){
                iterator.remove();
            }

           for(int y:set)
                System.out.println("iteration of y : "+ y);
            System.out.println();
        }

        System.out.println();

    }
}
