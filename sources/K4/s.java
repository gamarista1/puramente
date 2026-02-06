package K4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.V;
import mf.C6565s;
import mf.O;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final s f32405a = new s();

    private s() {
    }

    private final boolean a(Object obj) {
        if ((obj instanceof ArrayList) || (obj instanceof LinkedList) || (obj instanceof CopyOnWriteArrayList) || (obj instanceof Vector)) {
            return true;
        }
        return false;
    }

    private final boolean b(Object obj) {
        if ((obj instanceof HashMap) || (obj instanceof TreeMap) || (obj instanceof ConcurrentMap) || (obj instanceof EnumMap) || (obj instanceof Hashtable) || (obj instanceof WeakHashMap)) {
            return true;
        }
        return false;
    }

    public final String c(int i10, String str) {
        int length = str.length() - i10;
        if (length < 25) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String substring = str.substring(0, i10);
        C6496s.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb2.append(substring);
        sb2.append("***<");
        sb2.append(length);
        sb2.append("> CHARS TRUNCATED***");
        return sb2.toString();
    }

    public final v d(int i10, List list) {
        int a10;
        int b10;
        Map map;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < size) {
            int i14 = i11 + 1;
            s sVar = f32405a;
            Object obj = list.get(i11);
            if (obj instanceof String) {
                String str = (String) obj;
                if (str.length() > i10) {
                    list.set(i11, sVar.c(i10, str));
                    i12++;
                    i13 += str.length() - i10;
                    i11 = i14;
                }
            }
            if (sVar.b(obj)) {
                if (obj != null) {
                    v e10 = sVar.e(i10, V.d(obj));
                    a10 = e10.a();
                    b10 = e10.b();
                    map = obj;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                }
            } else if (sVar.a(obj)) {
                if (obj != null) {
                    v d10 = sVar.d(i10, V.c(obj));
                    a10 = d10.a();
                    b10 = d10.b();
                    map = obj;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any?>");
                }
            } else if (obj instanceof Map) {
                Map d11 = V.d(O.B((Map) obj));
                v e11 = sVar.e(i10, d11);
                a10 = e11.a();
                b10 = e11.b();
                map = d11;
            } else if (obj instanceof Collection) {
                List h12 = C6565s.h1((Collection) obj);
                v d12 = sVar.d(i10, h12);
                a10 = d12.a();
                b10 = d12.b();
                map = h12;
            } else {
                i11 = i14;
            }
            list.set(i11, map);
            i12 += a10;
            i13 += b10;
            i11 = i14;
        }
        return new v(i12, i13);
    }

    public final v e(int i10, Map map) {
        int a10;
        int b10;
        Map map2;
        int i11 = 0;
        int i12 = 0;
        for (Map.Entry entry : map.entrySet()) {
            s sVar = f32405a;
            Object value = entry.getValue();
            if (value instanceof String) {
                String str = (String) value;
                if (str.length() > i10) {
                    entry.setValue(sVar.c(i10, str));
                    i11++;
                    i12 += str.length() - i10;
                }
            }
            if (sVar.b(value)) {
                if (value != null) {
                    v e10 = sVar.e(i10, V.d(value));
                    a10 = e10.a();
                    b10 = e10.b();
                    map2 = value;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                }
            } else if (sVar.a(value)) {
                if (value != null) {
                    v d10 = sVar.d(i10, V.c(value));
                    a10 = d10.a();
                    b10 = d10.b();
                    map2 = value;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any?>");
                }
            } else if (value instanceof Map) {
                Map d11 = V.d(O.B((Map) value));
                v e11 = sVar.e(i10, d11);
                a10 = e11.a();
                b10 = e11.b();
                map2 = d11;
            } else if (value instanceof Collection) {
                List h12 = C6565s.h1((Collection) value);
                v d12 = sVar.d(i10, h12);
                a10 = d12.a();
                b10 = d12.b();
                map2 = h12;
            }
            entry.setValue(map2);
            i11 += a10;
            i12 += b10;
        }
        return new v(i11, i12);
    }
}
