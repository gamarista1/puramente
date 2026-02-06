package ce;

import Ef.m;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6531o;
import mf.C6565s;
import mf.O;
import u1.c;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f53765a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f53766b = new Bundle();

    /* renamed from: c  reason: collision with root package name */
    private final Lazy f53767c = C6531o.b(new d(this));

    public e(Context context) {
        C6496s.h(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("expo.modules.kotlin.PersistentDataManager", 0);
        C6496s.g(sharedPreferences, "getSharedPreferences(...)");
        this.f53765a = sharedPreferences;
    }

    private final Bundle g() {
        return (Bundle) this.f53767c.getValue();
    }

    private final Bundle j() {
        String string;
        Bundle b10;
        Bundle bundle = new Bundle();
        if (!(this.f53765a.getLong("expire", 0) <= new Date().getTime() || (string = this.f53765a.getString("bundle", (String) null)) == null || (b10 = f.d(string)) == null)) {
            bundle = b10;
        }
        this.f53765a.edit().clear().apply();
        return bundle;
    }

    /* access modifiers changed from: private */
    public static final Bundle o(e eVar) {
        return eVar.j();
    }

    public final e b(String str, Bundle bundle) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(bundle, "value");
        this.f53766b.putBundle(str, bundle);
        return this;
    }

    public final e c(String str, Serializable serializable) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(serializable, "value");
        this.f53766b.putSerializable(str, serializable);
        return this;
    }

    public final e d(String str, ArrayList arrayList) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(arrayList, "value");
        this.f53766b.putStringArrayList(str, arrayList);
        return this;
    }

    public final e e(String str, Map map) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(map, "value");
        Bundle bundle = this.f53766b;
        Pair[] pairArr = (Pair[]) O.D(map).toArray(new Pair[0]);
        bundle.putBundle(str, c.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        return this;
    }

    public final e f(String str, Map map) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(map, "value");
        Bundle bundle = this.f53766b;
        Pair[] pairArr = (Pair[]) O.D(map).toArray(new Pair[0]);
        bundle.putBundle(str, c.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        return this;
    }

    public final void h() {
        SharedPreferences.Editor edit = this.f53765a.edit();
        edit.putString("bundle", f.c(this.f53766b));
        edit.putLong("expire", new Date().getTime() + 300000);
        edit.commit();
    }

    public final Bundle i(String str) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        return g().getBundle(str);
    }

    public final Serializable k(String str) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        Bundle g10 = g();
        if (Build.VERSION.SDK_INT >= 33) {
            return g10.getSerializable(str, Serializable.class);
        }
        return g10.getSerializable(str);
    }

    public final ArrayList l(String str) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        return g().getStringArrayList(str);
    }

    public final Map m(String str) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        Bundle bundle = g().getBundle(str);
        if (bundle == null) {
            return null;
        }
        Set<String> keySet = bundle.keySet();
        C6496s.e(keySet);
        Iterable iterable = keySet;
        LinkedHashMap linkedHashMap = new LinkedHashMap(m.d(O.e(C6565s.y(iterable, 10)), 16));
        for (Object next : iterable) {
            linkedHashMap.put(next, Integer.valueOf(bundle.getInt((String) next)));
        }
        return linkedHashMap;
    }

    public final Map n(String str) {
        Serializable serializable;
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        Bundle bundle = g().getBundle(str);
        if (bundle == null) {
            return null;
        }
        Set<String> keySet = bundle.keySet();
        C6496s.g(keySet, "keySet(...)");
        Iterable iterable = keySet;
        LinkedHashMap linkedHashMap = new LinkedHashMap(m.d(O.e(C6565s.y(iterable, 10)), 16));
        for (Object next : iterable) {
            String str2 = (String) next;
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = bundle.getSerializable(str2, Serializable.class);
            } else {
                serializable = bundle.getSerializable(str2);
            }
            if (serializable != null) {
                linkedHashMap.put(next, serializable);
            } else {
                throw new IllegalStateException("For a key '" + str2 + "' there should be a serializable class available");
            }
        }
        return linkedHashMap;
    }
}
