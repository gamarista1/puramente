package Jb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class e {
    public static void a(boolean z10) {
        b(z10, "", new Object[0]);
    }

    public static void b(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new AssertionError("hardAssert failed: " + String.format(str, objArr));
        }
    }

    public static Long c(Object obj) {
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return null;
    }

    public static String d(List list) {
        if (list.isEmpty()) {
            return "/";
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!z10) {
                sb2.append("/");
            }
            sb2.append(str);
            z10 = false;
        }
        return sb2.toString();
    }

    public static List e(String str) {
        ArrayList arrayList = new ArrayList();
        String[] split = str.split("/", -1);
        for (int i10 = 0; i10 < split.length; i10++) {
            if (!split[i10].isEmpty()) {
                arrayList.add(split[i10]);
            }
        }
        return arrayList;
    }
}
