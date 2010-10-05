package showgo.modell.inszenierung;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class StabileHeirat {

	//	mapM (key: Mann-Objekt, value: Präferenzliste des entsprechenden Mann-Objekts)
	//	mapF (key: Frau-Objekt, value: Präferenzliste des entsprechenden Frau-Objekts)
	//	mapM (bei ShowGO: Schauspieler), mapF (bei ShowGO: Darstellerposten)
	public static Map stabileHeirat(HashMap mapF, HashMap mapM) {
		Map vorschlag = new HashMap();
		Object p, e;
		while ((!mapM.isEmpty()) && (!mapF.isEmpty())) {
			vorschlag = findePaare(mapF, mapM);
			Iterator it = mapF.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry entry = (Map.Entry) it.next();
				p = (Object) entry.getKey();
				e = (Object) vorschlag.get(p);
				mapM.remove(e);
			}
		}
		return vorschlag;
	}
	
	private static Map findePaare(HashMap mapF, HashMap mapM) {
		//	   next[m]+1: Index des nächsten Elements auf der Präferenzliste von mapM
		int next[] = new int[mapM.size()];
		//	   prefer[w, m]: w-tes Element auf der Liste vom m-ten Element in mapM
		Map prefer = new HashMap();
		//	   rank ist invers zur Präferenzliste
		Map rank = new HashMap();
		Map fiancee = new HashMap();
		List praeferenzen;
		Map map;
		Object element1;
		Object element2;
		Object d;
		int rankWS, rankWfW;
		Iterator iterator_Mann, iterator_Frau;
		Map.Entry entry;
		//
		iterator_Mann = mapM.entrySet().iterator();
		while (iterator_Mann.hasNext()) {
			entry = (Map.Entry) iterator_Mann.next();
			element1 = (Object) entry.getKey();
			prefer.put(element1, mapM.get(element1));
		}
		//
		iterator_Frau = mapF.entrySet().iterator();
		while (iterator_Frau.hasNext()) {
			entry = (Map.Entry) iterator_Frau.next();
			d = (Object) entry.getKey();
			praeferenzen = (List) entry.getValue();
			map = new HashMap();
			for (int j = 0; j < praeferenzen.size(); j++) {
				map.put(praeferenzen.get(j), new Integer(j));
			}
			rank.put(d, map);
		}
		//
		iterator_Mann = mapM.entrySet().iterator();
		for (int m = 0; m < mapM.size(); m++) {
			entry = (Map.Entry) iterator_Mann.next();
			element1 = (Object) entry.getKey();
			do {
				d = (Object) ((List) prefer.get(element1)).get(next[m]);
				element2 = (Object) fiancee.get(d);
				if (element2 != null) {
					//	   rank[w, s] < rank[w, fiancee[w]]
					rankWS =
						((Integer) ((Map) rank.get(d)).get(element1))
							.intValue();
					rankWfW =
						((Integer) ((Map) rank.get(d)).get(element2))
							.intValue();
					if (rankWS < rankWfW) {
						fiancee.put(d, element1);
						element1 = element2;
					}
				} else {
					fiancee.put(d, element1);
					element1 = element2;
				}
			} while ((element1 != null) && (++next[m] < mapF.size()));
		}
		return fiancee;
	}
	
	public static void main(String[] args) {
		HashMap m = new HashMap();
		String[] mA = {/*"2",*/ "5", "1"/*, "3", "4"*/};
		String[] mB = {"1"/*, "2", "3", "4"*/, "5"};
		String[] mC = {/*"2", "3", */"5"/*, "4"*/, "1"};
		String[] mD = {"1"/*, "3", "2", "4"*/, "5"};
		String[] mE = {"5"/*, "3", "2"*/, "1"/*, "4"*/};
		m.put("A", Arrays.asList(mA));
		m.put("B", Arrays.asList(mB));
		m.put("C", Arrays.asList(mC));
		m.put("D", Arrays.asList(mD));
		m.put("E", Arrays.asList(mE));
		HashMap f = new HashMap();
		String[] f1 = {"E", "A", "D", "B", "C"};
		String[] f2 = {"D", "E", "B", "A", "C"};
		String[] f3 = {"A", "D", "B", "C", "E"};
		String[] f4 = {"C", "B", "D", "A", "E"};
		String[] f5 = {"D", "B", "C", "E", "A"};
		f.put("1", Arrays.asList(f1));
//		f.put("2", Arrays.asList(f2));
//		f.put("3", Arrays.asList(f3));
//		f.put("4", Arrays.asList(f4));
		f.put("5", Arrays.asList(f5));
		System.out.println(stabileHeirat(m, f));		
	}
}