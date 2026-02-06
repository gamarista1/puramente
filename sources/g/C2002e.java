package g;

import Rg.k;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1795s;
import androidx.lifecycle.C1798v;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import h.C2012a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.V;
import yf.C6787a;

/* renamed from: g.e  reason: case insensitive filesystem */
public abstract class C2002e {

    /* renamed from: h  reason: collision with root package name */
    private static final b f20804h = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Map f20805a = new LinkedHashMap();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Map f20806b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map f20807c = new LinkedHashMap();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final List f20808d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final transient Map f20809e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    private final Map f20810f = new LinkedHashMap();

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f20811g = new Bundle();

    /* renamed from: g.e$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C1999b f20812a;

        /* renamed from: b  reason: collision with root package name */
        private final C2012a f20813b;

        public a(C1999b bVar, C2012a aVar) {
            C6496s.h(bVar, "callback");
            C6496s.h(aVar, "contract");
            this.f20812a = bVar;
            this.f20813b = aVar;
        }

        public final C1999b a() {
            return this.f20812a;
        }

        public final C2012a b() {
            return this.f20813b;
        }
    }

    /* renamed from: g.e$b */
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: g.e$c */
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final C1790m f20814a;

        /* renamed from: b  reason: collision with root package name */
        private final List f20815b = new ArrayList();

        public c(C1790m mVar) {
            C6496s.h(mVar, "lifecycle");
            this.f20814a = mVar;
        }

        public final void a(C1795s sVar) {
            C6496s.h(sVar, "observer");
            this.f20814a.a(sVar);
            this.f20815b.add(sVar);
        }

        public final void b() {
            for (C1795s d10 : this.f20815b) {
                this.f20814a.d(d10);
            }
            this.f20815b.clear();
        }
    }

    /* renamed from: g.e$d */
    static final class d extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final d f20816a = new d();

        d() {
            super(0);
        }

        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(Cf.c.f62630a.e(2147418112) + 65536);
        }
    }

    /* renamed from: g.e$e  reason: collision with other inner class name */
    public static final class C0346e extends C2000c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2002e f20817a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f20818b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2012a f20819c;

        C0346e(C2002e eVar, String str, C2012a aVar) {
            this.f20817a = eVar;
            this.f20818b = str;
            this.f20819c = aVar;
        }

        public C2012a a() {
            return this.f20819c;
        }

        public void c(Object obj, androidx.core.app.c cVar) {
            Object obj2 = this.f20817a.f20806b.get(this.f20818b);
            C2012a aVar = this.f20819c;
            if (obj2 != null) {
                int intValue = ((Number) obj2).intValue();
                this.f20817a.f20808d.add(this.f20818b);
                try {
                    this.f20817a.i(intValue, this.f20819c, obj, cVar);
                } catch (Exception e10) {
                    this.f20817a.f20808d.remove(this.f20818b);
                    throw e10;
                }
            } else {
                throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
            }
        }

        public void d() {
            this.f20817a.p(this.f20818b);
        }
    }

    /* renamed from: g.e$f */
    public static final class f extends C2000c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2002e f20820a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f20821b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2012a f20822c;

        f(C2002e eVar, String str, C2012a aVar) {
            this.f20820a = eVar;
            this.f20821b = str;
            this.f20822c = aVar;
        }

        public C2012a a() {
            return this.f20822c;
        }

        public void c(Object obj, androidx.core.app.c cVar) {
            Object obj2 = this.f20820a.f20806b.get(this.f20821b);
            C2012a aVar = this.f20822c;
            if (obj2 != null) {
                int intValue = ((Number) obj2).intValue();
                this.f20820a.f20808d.add(this.f20821b);
                try {
                    this.f20820a.i(intValue, this.f20822c, obj, cVar);
                } catch (Exception e10) {
                    this.f20820a.f20808d.remove(this.f20821b);
                    throw e10;
                }
            } else {
                throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
            }
        }

        public void d() {
            this.f20820a.p(this.f20821b);
        }
    }

    private final void d(int i10, String str) {
        this.f20805a.put(Integer.valueOf(i10), str);
        this.f20806b.put(str, Integer.valueOf(i10));
    }

    private final void g(String str, int i10, Intent intent, a aVar) {
        C1999b bVar;
        if (aVar != null) {
            bVar = aVar.a();
        } else {
            bVar = null;
        }
        if (bVar == null || !this.f20808d.contains(str)) {
            this.f20810f.remove(str);
            this.f20811g.putParcelable(str, new C1998a(i10, intent));
            return;
        }
        aVar.a().a(aVar.b().parseResult(i10, intent));
        this.f20808d.remove(str);
    }

    private final int h() {
        for (Number number : k.i(d.f20816a)) {
            if (!this.f20805a.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* access modifiers changed from: private */
    public static final void n(C2002e eVar, String str, C1999b bVar, C2012a aVar, C1798v vVar, C1790m.a aVar2) {
        C6496s.h(eVar, "this$0");
        C6496s.h(str, "$key");
        C6496s.h(bVar, "$callback");
        C6496s.h(aVar, "$contract");
        C6496s.h(vVar, "<anonymous parameter 0>");
        C6496s.h(aVar2, "event");
        if (C1790m.a.ON_START == aVar2) {
            eVar.f20809e.put(str, new a(bVar, aVar));
            if (eVar.f20810f.containsKey(str)) {
                Object obj = eVar.f20810f.get(str);
                eVar.f20810f.remove(str);
                bVar.a(obj);
            }
            C1998a aVar3 = (C1998a) u1.b.a(eVar.f20811g, str, C1998a.class);
            if (aVar3 != null) {
                eVar.f20811g.remove(str);
                bVar.a(aVar.parseResult(aVar3.b(), aVar3.a()));
            }
        } else if (C1790m.a.ON_STOP == aVar2) {
            eVar.f20809e.remove(str);
        } else if (C1790m.a.ON_DESTROY == aVar2) {
            eVar.p(str);
        }
    }

    private final void o(String str) {
        if (((Integer) this.f20806b.get(str)) == null) {
            d(h(), str);
        }
    }

    public final boolean e(int i10, int i11, Intent intent) {
        String str = (String) this.f20805a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        g(str, i11, intent, (a) this.f20809e.get(str));
        return true;
    }

    public final boolean f(int i10, Object obj) {
        C1999b bVar;
        String str = (String) this.f20805a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f20809e.get(str);
        if (aVar != null) {
            bVar = aVar.a();
        } else {
            bVar = null;
        }
        if (bVar == null) {
            this.f20811g.remove(str);
            this.f20810f.put(str, obj);
            return true;
        }
        C1999b a10 = aVar.a();
        C6496s.f(a10, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.f20808d.remove(str)) {
            return true;
        }
        a10.a(obj);
        return true;
    }

    public abstract void i(int i10, C2012a aVar, Object obj, androidx.core.app.c cVar);

    public final void j(Bundle bundle) {
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                if (stringArrayList2 != null) {
                    this.f20808d.addAll(stringArrayList2);
                }
                Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                if (bundle2 != null) {
                    this.f20811g.putAll(bundle2);
                }
                int size = stringArrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String str = stringArrayList.get(i10);
                    if (this.f20806b.containsKey(str)) {
                        Integer num = (Integer) this.f20806b.remove(str);
                        if (!this.f20811g.containsKey(str)) {
                            V.d(this.f20805a).remove(num);
                        }
                    }
                    Integer num2 = integerArrayList.get(i10);
                    C6496s.g(num2, "rcs[i]");
                    int intValue = num2.intValue();
                    String str2 = stringArrayList.get(i10);
                    C6496s.g(str2, "keys[i]");
                    d(intValue, str2);
                }
            }
        }
    }

    public final void k(Bundle bundle) {
        C6496s.h(bundle, "outState");
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(this.f20806b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(this.f20806b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(this.f20808d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.f20811g));
    }

    public final C2000c l(String str, C1798v vVar, C2012a aVar, C1999b bVar) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(vVar, "lifecycleOwner");
        C6496s.h(aVar, "contract");
        C6496s.h(bVar, "callback");
        C1790m lifecycle = vVar.getLifecycle();
        if (!lifecycle.b().b(C1790m.b.STARTED)) {
            o(str);
            c cVar = (c) this.f20807c.get(str);
            if (cVar == null) {
                cVar = new c(lifecycle);
            }
            cVar.a(new C2001d(this, str, bVar, aVar));
            this.f20807c.put(str, cVar);
            return new C0346e(this, str, aVar);
        }
        throw new IllegalStateException(("LifecycleOwner " + vVar + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.").toString());
    }

    public final C2000c m(String str, C2012a aVar, C1999b bVar) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(aVar, "contract");
        C6496s.h(bVar, "callback");
        o(str);
        this.f20809e.put(str, new a(bVar, aVar));
        if (this.f20810f.containsKey(str)) {
            Object obj = this.f20810f.get(str);
            this.f20810f.remove(str);
            bVar.a(obj);
        }
        C1998a aVar2 = (C1998a) u1.b.a(this.f20811g, str, C1998a.class);
        if (aVar2 != null) {
            this.f20811g.remove(str);
            bVar.a(aVar.parseResult(aVar2.b(), aVar2.a()));
        }
        return new f(this, str, aVar);
    }

    public final void p(String str) {
        Integer num;
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        if (!this.f20808d.contains(str) && (num = (Integer) this.f20806b.remove(str)) != null) {
            this.f20805a.remove(num);
        }
        this.f20809e.remove(str);
        if (this.f20810f.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f20810f.get(str));
            this.f20810f.remove(str);
        }
        if (this.f20811g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C1998a) u1.b.a(this.f20811g, str, C1998a.class)));
            this.f20811g.remove(str);
        }
        c cVar = (c) this.f20807c.get(str);
        if (cVar != null) {
            cVar.b();
            this.f20807c.remove(str);
        }
    }
}
