package j3;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

public abstract class j {
    public static final List a(Map map, C6798l lVar) {
        Boolean bool;
        C6496s.h(map, "<this>");
        C6496s.h(lVar, "isArgumentMissing");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            C2137h hVar = (C2137h) entry.getValue();
            if (hVar != null) {
                bool = Boolean.valueOf(hVar.d());
            } else {
                bool = null;
            }
            C6496s.e(bool);
            if (!bool.booleanValue() && !hVar.b()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : linkedHashMap.keySet()) {
            if (((Boolean) lVar.invoke((String) next)).booleanValue()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
