package qe;

import Ff.g;
import Ff.k;
import Ff.n;
import Gf.e;
import Hf.a;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.File;
import java.lang.annotation.Annotation;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import lf.C6502A;
import lf.C6514M;
import mf.C6565s;
import ne.b;
import ne.c;
import qe.L;
import xf.C6781a;

public abstract class M {
    public static final void a(WritableArray writableArray, Object obj) {
        C6496s.h(writableArray, "<this>");
        if (obj == null || (obj instanceof C6514M)) {
            writableArray.pushNull();
        } else if (obj instanceof ReadableArray) {
            writableArray.pushArray((ReadableArray) obj);
        } else if (obj instanceof ReadableMap) {
            writableArray.pushMap((ReadableMap) obj);
        } else if (obj instanceof String) {
            writableArray.pushString((String) obj);
        } else if (obj instanceof Integer) {
            writableArray.pushInt(((Number) obj).intValue());
        } else if (obj instanceof Number) {
            writableArray.pushDouble(((Number) obj).doubleValue());
        } else if (obj instanceof Boolean) {
            writableArray.pushBoolean(((Boolean) obj).booleanValue());
        } else {
            Class<?> cls = obj.getClass();
            throw new IllegalArgumentException("Could not put '" + cls + "' to WritableArray");
        }
    }

    public static final void b(WritableMap writableMap, String str, Object obj) {
        C6496s.h(writableMap, "<this>");
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        if (obj == null || (obj instanceof C6514M)) {
            writableMap.putNull(str);
        } else if (obj instanceof ReadableArray) {
            writableMap.putArray(str, (ReadableArray) obj);
        } else if (obj instanceof ReadableMap) {
            writableMap.putMap(str, (ReadableMap) obj);
        } else if (obj instanceof String) {
            writableMap.putString(str, (String) obj);
        } else if (obj instanceof Integer) {
            writableMap.putInt(str, ((Number) obj).intValue());
        } else if (obj instanceof Number) {
            writableMap.putDouble(str, ((Number) obj).doubleValue());
        } else if (obj instanceof Boolean) {
            writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
        } else {
            Class<?> cls = obj.getClass();
            throw new IllegalArgumentException("Could not put '" + cls + "' to WritableMap");
        }
    }

    public static final WritableArray c(Collection collection, L.a aVar) {
        C6496s.h(collection, "<this>");
        C6496s.h(aVar, "containerProvider");
        WritableArray a10 = aVar.a();
        for (Object c10 : collection) {
            a(a10, L.f61392a.c(c10, aVar));
        }
        return a10;
    }

    public static final WritableArray d(Pair pair, L.a aVar) {
        C6496s.h(pair, "<this>");
        C6496s.h(aVar, "containerProvider");
        WritableArray a10 = aVar.a();
        L l10 = L.f61392a;
        Object c10 = l10.c(pair.c(), aVar);
        Object c11 = l10.c(pair.d(), aVar);
        a(a10, c10);
        a(a10, c11);
        return a10;
    }

    public static final WritableArray e(double[] dArr, L.a aVar) {
        C6496s.h(dArr, "<this>");
        C6496s.h(aVar, "containerProvider");
        WritableArray a10 = aVar.a();
        for (double pushDouble : dArr) {
            a10.pushDouble(pushDouble);
        }
        return a10;
    }

    public static final WritableArray f(float[] fArr, L.a aVar) {
        C6496s.h(fArr, "<this>");
        C6496s.h(aVar, "containerProvider");
        WritableArray a10 = aVar.a();
        for (float f10 : fArr) {
            a10.pushDouble((double) f10);
        }
        return a10;
    }

    public static final WritableArray g(int[] iArr, L.a aVar) {
        C6496s.h(iArr, "<this>");
        C6496s.h(aVar, "containerProvider");
        WritableArray a10 = aVar.a();
        for (int pushInt : iArr) {
            a10.pushInt(pushInt);
        }
        return a10;
    }

    public static final WritableArray h(Object[] objArr, L.a aVar) {
        C6496s.h(objArr, "<this>");
        C6496s.h(aVar, "containerProvider");
        WritableArray a10 = aVar.a();
        for (Object c10 : objArr) {
            a(a10, L.f61392a.c(c10, aVar));
        }
        return a10;
    }

    public static final WritableArray i(boolean[] zArr, L.a aVar) {
        C6496s.h(zArr, "<this>");
        C6496s.h(aVar, "containerProvider");
        WritableArray a10 = aVar.a();
        for (boolean pushBoolean : zArr) {
            a10.pushBoolean(pushBoolean);
        }
        return a10;
    }

    public static final WritableMap j(Bundle bundle, L.a aVar) {
        C6496s.h(bundle, "<this>");
        C6496s.h(aVar, "containerProvider");
        WritableMap b10 = aVar.b();
        for (String next : bundle.keySet()) {
            Object c10 = L.f61392a.c(bundle.get(next), aVar);
            C6496s.e(next);
            b(b10, next, c10);
        }
        return b10;
    }

    public static final WritableMap k(Map map, L.a aVar) {
        C6496s.h(map, "<this>");
        C6496s.h(aVar, "containerProvider");
        WritableMap b10 = aVar.b();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            b(b10, String.valueOf(key), L.f61392a.c(entry.getValue(), aVar));
        }
        return b10;
    }

    public static final WritableMap l(c cVar, L.a aVar) {
        String str;
        Object obj;
        C6496s.h(cVar, "<this>");
        C6496s.h(aVar, "containerProvider");
        WritableMap b10 = aVar.b();
        Iterable<n> e10 = e.e(C6781a.e(cVar.getClass()));
        ArrayList arrayList = new ArrayList(C6565s.y(e10, 10));
        for (n nVar : e10) {
            Iterator it = nVar.getAnnotations().iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Annotation) obj) instanceof b) {
                    break;
                }
            }
            b bVar = (b) obj;
            if (bVar != null) {
                String key = bVar.key();
                if (!C6496s.c(key, "")) {
                    str = key;
                }
                if (str == null) {
                    str = nVar.getName();
                }
                a.b(nVar, true);
                b(b10, str, L.f61392a.c(nVar.get(cVar), aVar));
            }
            arrayList.add(C6514M.f71813a);
        }
        return b10;
    }

    public static final Object m(Enum enumR) {
        Object obj;
        C6496s.h(enumR, "<this>");
        g f10 = e.f(O.b(enumR.getClass()));
        if (f10 == null) {
            throw new IllegalArgumentException("Cannot convert enum without the primary constructor to js value");
        } else if (f10.getParameters().isEmpty()) {
            return enumR.name();
        } else {
            if (f10.getParameters().size() == 1) {
                String name = ((k) C6565s.o0(f10.getParameters())).getName();
                C6496s.e(name);
                Iterator it = e.d(O.b(enumR.getClass())).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C6496s.c(((n) obj).getName(), name)) {
                        break;
                    }
                }
                C6496s.f(obj, "null cannot be cast to non-null type kotlin.reflect.KProperty1<kotlin.Enum<*>, *>");
                return ((n) obj).get(enumR);
            }
            Class<?> cls = enumR.getClass();
            throw new IllegalStateException("Enum '" + cls + "' cannot be used as return type (incompatible with JS)");
        }
    }

    public static final String n(Uri uri) {
        C6496s.h(uri, "<this>");
        String uri2 = uri.toString();
        C6496s.g(uri2, "toString(...)");
        return uri2;
    }

    public static final String o(File file) {
        C6496s.h(file, "<this>");
        String absolutePath = file.getAbsolutePath();
        C6496s.g(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    public static final String p(URI uri) {
        C6496s.h(uri, "<this>");
        String uri2 = uri.toString();
        C6496s.g(uri2, "toString(...)");
        return uri2;
    }

    public static final String q(URL url) {
        C6496s.h(url, "<this>");
        String url2 = url.toString();
        C6496s.g(url2, "toString(...)");
        return url2;
    }

    public static final Collection r(Collection collection) {
        C6496s.h(collection, "<this>");
        Iterable<Object> iterable = collection;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (Object b10 : iterable) {
            arrayList.add(L.b(L.f61392a, b10, (L.a) null, true, 2, (Object) null));
        }
        return arrayList;
    }

    public static final Map s(Bundle bundle) {
        C6496s.h(bundle, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String next : bundle.keySet()) {
            linkedHashMap.put(next, L.b(L.f61392a, bundle.get(next), (L.a) null, true, 2, (Object) null));
        }
        return linkedHashMap;
    }

    public static final Map t(Map map) {
        C6496s.h(map, "<this>");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(C6502A.a(String.valueOf(entry.getKey()), L.b(L.f61392a, entry.getValue(), (L.a) null, true, 2, (Object) null)));
        }
        return mf.O.w(arrayList);
    }
}
