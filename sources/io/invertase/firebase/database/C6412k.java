package io.invertase.firebase.database;

import Gb.a;
import Gb.j;
import Ue.C5546a;
import com.facebook.react.bridge.ReadableArray;
import com.google.firebase.database.b;
import com.google.firebase.database.h;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import io.intercom.android.sdk.models.AttributeType;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: io.invertase.firebase.database.k  reason: case insensitive filesystem */
public class C6412k {

    /* renamed from: a  reason: collision with root package name */
    public h f71379a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap f71380b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private HashMap f71381c = new HashMap();

    C6412k(b bVar, ReadableArray readableArray) {
        this.f71379a = bVar;
        for (Map map : C5546a.f(readableArray)) {
            String str = (String) map.get("type");
            String str2 = (String) map.get("name");
            if ("orderBy".equals(str)) {
                h(str2, map);
            } else if ("limit".equals(str)) {
                g(str2, map);
            } else if ("filter".equals(str)) {
                f(str2, map);
            }
        }
    }

    private void e(String str, String str2, Map map) {
        if (AttributeType.NUMBER.equals(str2)) {
            double doubleValue = ((Double) map.get("value")).doubleValue();
            if (str == null) {
                this.f71379a = this.f71379a.e(doubleValue);
            } else {
                this.f71379a = this.f71379a.f(doubleValue, str);
            }
        } else if (AttributeType.BOOLEAN.equals(str2)) {
            boolean booleanValue = ((Boolean) map.get("value")).booleanValue();
            if (str == null) {
                this.f71379a = this.f71379a.j(booleanValue);
            } else {
                this.f71379a = this.f71379a.k(booleanValue, str);
            }
        } else if ("string".equals(str2)) {
            String str3 = (String) map.get("value");
            if (str == null) {
                this.f71379a = this.f71379a.h(str3);
            } else {
                this.f71379a = this.f71379a.i(str3, str);
            }
        } else if (!"null".equals(str2)) {
        } else {
            if (str == null) {
                this.f71379a = this.f71379a.h((String) null);
            } else {
                this.f71379a = this.f71379a.i((String) null, str);
            }
        }
    }

    private void f(String str, Map map) {
        String str2 = (String) map.get("valueType");
        String str3 = (String) map.get(SubscriberAttributeKt.JSON_NAME_KEY);
        if ("endAt".equals(str)) {
            e(str3, str2, map);
        } else if ("startAt".equals(str)) {
            i(str3, str2, map);
        }
    }

    private h g(String str, Map map) {
        int intValue = ((Double) map.get("value")).intValue();
        if ("limitToLast".equals(str)) {
            this.f71379a = this.f71379a.r(intValue);
        } else if ("limitToFirst".equals(str)) {
            this.f71379a = this.f71379a.q(intValue);
        }
        return this.f71379a;
    }

    private void h(String str, Map map) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -626148087:
                if (str.equals("orderByPriority")) {
                    c10 = 0;
                    break;
                }
                break;
            case 729747418:
                if (str.equals("orderByKey")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1200288727:
                if (str.equals("orderByChild")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1217630252:
                if (str.equals("orderByValue")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.f71379a = this.f71379a.u();
                return;
            case 1:
                this.f71379a = this.f71379a.t();
                return;
            case 2:
                this.f71379a = this.f71379a.s((String) map.get(SubscriberAttributeKt.JSON_NAME_KEY));
                return;
            case 3:
                this.f71379a = this.f71379a.v();
                return;
            default:
                return;
        }
    }

    private void i(String str, String str2, Map map) {
        if (AttributeType.NUMBER.equals(str2)) {
            double doubleValue = ((Double) map.get("value")).doubleValue();
            if (str == null) {
                this.f71379a = this.f71379a.z(doubleValue);
            } else {
                this.f71379a = this.f71379a.A(doubleValue, str);
            }
        } else if (AttributeType.BOOLEAN.equals(str2)) {
            boolean booleanValue = ((Boolean) map.get("value")).booleanValue();
            if (str == null) {
                this.f71379a = this.f71379a.E(booleanValue);
            } else {
                this.f71379a = this.f71379a.F(booleanValue, str);
            }
        } else if ("string".equals(str2)) {
            String str3 = (String) map.get("value");
            if (str == null) {
                this.f71379a = this.f71379a.C(str3);
            } else {
                this.f71379a = this.f71379a.D(str3, str);
            }
        } else if (!"null".equals(str2)) {
        } else {
            if (str == null) {
                this.f71379a = this.f71379a.C((String) null);
            } else {
                this.f71379a = this.f71379a.D((String) null, str);
            }
        }
    }

    public void a(String str, a aVar) {
        this.f71380b.put(str, aVar);
        this.f71379a.a(aVar);
    }

    public void b(String str, j jVar) {
        this.f71381c.put(str, jVar);
        this.f71379a.d(jVar);
    }

    public void c(a aVar) {
        this.f71379a.a(aVar);
    }

    public void d(j jVar) {
        this.f71379a.c(jVar);
    }

    public Boolean j(String str) {
        boolean z10;
        if (this.f71381c.containsKey(str) || this.f71380b.containsKey(str)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public Boolean k() {
        boolean z10;
        if (this.f71381c.size() > 0 || this.f71380b.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public void l() {
        if (k().booleanValue()) {
            Iterator it = this.f71381c.entrySet().iterator();
            while (it.hasNext()) {
                this.f71379a.x((j) ((Map.Entry) it.next()).getValue());
                it.remove();
            }
            Iterator it2 = this.f71380b.entrySet().iterator();
            while (it2.hasNext()) {
                this.f71379a.w((a) ((Map.Entry) it2.next()).getValue());
                it2.remove();
            }
        }
    }

    public void m(a aVar) {
        this.f71379a.w(aVar);
    }

    public void n(String str) {
        if (this.f71381c.containsKey(str)) {
            this.f71379a.x((j) this.f71381c.get(str));
            this.f71381c.remove(str);
        }
        if (this.f71380b.containsKey(str)) {
            this.f71379a.w((a) this.f71380b.get(str));
            this.f71380b.remove(str);
        }
    }
}
