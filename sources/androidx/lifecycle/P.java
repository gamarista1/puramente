package androidx.lifecycle;

import Xg.x;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import mf.O;
import u1.c;
import x3.C2912d;

public final class P {

    /* renamed from: f  reason: collision with root package name */
    public static final a f17155f = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final Class[] f17156g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a  reason: collision with root package name */
    private final Map f17157a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f17158b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f17159c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f17160d;

    /* renamed from: e  reason: collision with root package name */
    private final C2912d.c f17161e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final P a(Bundle bundle, Bundle bundle2) {
            if (bundle != null) {
                ClassLoader classLoader = P.class.getClassLoader();
                C6496s.e(classLoader);
                bundle.setClassLoader(classLoader);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
                if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                    throw new IllegalStateException("Invalid bundle passed as restored state");
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = parcelableArrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj = parcelableArrayList.get(i10);
                    C6496s.f(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
                }
                return new P(linkedHashMap);
            } else if (bundle2 == null) {
                return new P();
            } else {
                HashMap hashMap = new HashMap();
                for (String next : bundle2.keySet()) {
                    C6496s.g(next, SubscriberAttributeKt.JSON_NAME_KEY);
                    hashMap.put(next, bundle2.get(next));
                }
                return new P(hashMap);
            }
        }

        public final boolean b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : P.f17156g) {
                C6496s.e(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }

        private a() {
        }
    }

    public P(Map map) {
        C6496s.h(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f17157a = linkedHashMap;
        this.f17158b = new LinkedHashMap();
        this.f17159c = new LinkedHashMap();
        this.f17160d = new LinkedHashMap();
        this.f17161e = new O(this);
        linkedHashMap.putAll(map);
    }

    /* access modifiers changed from: private */
    public static final Bundle f(P p10) {
        C6496s.h(p10, "this$0");
        for (Map.Entry entry : O.y(p10.f17158b).entrySet()) {
            p10.g((String) entry.getKey(), ((C2912d.c) entry.getValue()).a());
        }
        Set<String> keySet = p10.f17157a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(p10.f17157a.get(str));
        }
        return c.a(C6502A.a("keys", arrayList), C6502A.a("values", arrayList2));
    }

    public final Object c(String str) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        try {
            return this.f17157a.get(str);
        } catch (ClassCastException unused) {
            d(str);
            return null;
        }
    }

    public final Object d(String str) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        Object remove = this.f17157a.remove(str);
        android.support.v4.media.session.c.a(this.f17159c.remove(str));
        this.f17160d.remove(str);
        return remove;
    }

    public final C2912d.c e() {
        return this.f17161e;
    }

    public final void g(String str, Object obj) {
        D d10;
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        if (f17155f.b(obj)) {
            Object obj2 = this.f17159c.get(str);
            if (obj2 instanceof D) {
                d10 = (D) obj2;
            } else {
                d10 = null;
            }
            if (d10 != null) {
                d10.n(obj);
            } else {
                this.f17157a.put(str, obj);
            }
            x xVar = (x) this.f17160d.get(str);
            if (xVar != null) {
                xVar.setValue(obj);
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't put value with type ");
        C6496s.e(obj);
        sb2.append(obj.getClass());
        sb2.append(" into saved state");
        throw new IllegalArgumentException(sb2.toString());
    }

    public P() {
        this.f17157a = new LinkedHashMap();
        this.f17158b = new LinkedHashMap();
        this.f17159c = new LinkedHashMap();
        this.f17160d = new LinkedHashMap();
        this.f17161e = new O(this);
    }
}
