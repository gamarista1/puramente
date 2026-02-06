package com.google.firebase.perf.metrics;

import Ac.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import uc.C5233a;
import wc.e;
import yc.C5293a;
import zc.C5313k;

public class Trace extends com.google.firebase.perf.application.b implements Parcelable, yc.b {
    @Keep
    public static final Parcelable.Creator<Trace> CREATOR = new a();

    /* renamed from: m  reason: collision with root package name */
    private static final C5233a f57704m = C5233a.e();

    /* renamed from: n  reason: collision with root package name */
    private static final Map f57705n = new ConcurrentHashMap();

    /* renamed from: o  reason: collision with root package name */
    static final Parcelable.Creator f57706o = new b();

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference f57707a;

    /* renamed from: b  reason: collision with root package name */
    private final Trace f57708b;

    /* renamed from: c  reason: collision with root package name */
    private final GaugeManager f57709c;

    /* renamed from: d  reason: collision with root package name */
    private final String f57710d;

    /* renamed from: e  reason: collision with root package name */
    private final Map f57711e;

    /* renamed from: f  reason: collision with root package name */
    private final Map f57712f;

    /* renamed from: g  reason: collision with root package name */
    private final List f57713g;

    /* renamed from: h  reason: collision with root package name */
    private final List f57714h;

    /* renamed from: i  reason: collision with root package name */
    private final C5313k f57715i;

    /* renamed from: j  reason: collision with root package name */
    private final Ac.a f57716j;

    /* renamed from: k  reason: collision with root package name */
    private l f57717k;

    /* renamed from: l  reason: collision with root package name */
    private l f57718l;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, false, (a) null);
        }

        /* renamed from: b */
        public Trace[] newArray(int i10) {
            return new Trace[i10];
        }
    }

    class b implements Parcelable.Creator {
        b() {
        }

        /* renamed from: a */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, true, (a) null);
        }

        /* renamed from: b */
        public Trace[] newArray(int i10) {
            return new Trace[i10];
        }
    }

    /* synthetic */ Trace(Parcel parcel, boolean z10, a aVar) {
        this(parcel, z10);
    }

    private void b(String str, String str2) {
        if (k()) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", new Object[]{this.f57710d}));
        } else if (this.f57712f.containsKey(str) || this.f57712f.size() < 5) {
            e.d(str, str2);
        } else {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", new Object[]{5}));
        }
    }

    public static Trace c(String str) {
        return new Trace(str);
    }

    private a l(String str) {
        a aVar = (a) this.f57711e.get(str);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(str);
        this.f57711e.put(str, aVar2);
        return aVar2;
    }

    private void n(l lVar) {
        if (!this.f57714h.isEmpty()) {
            Trace trace = (Trace) this.f57714h.get(this.f57714h.size() - 1);
            if (trace.f57718l == null) {
                trace.f57718l = lVar;
            }
        }
    }

    public void a(C5293a aVar) {
        if (aVar == null) {
            f57704m.j("Unable to add new SessionId to the Trace. Continuing without it.");
        } else if (i() && !k()) {
            this.f57713g.add(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public Map d() {
        return this.f57711e;
    }

    @Keep
    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public l e() {
        return this.f57718l;
    }

    /* access modifiers changed from: package-private */
    public List f() {
        List unmodifiableList;
        synchronized (this.f57713g) {
            try {
                ArrayList arrayList = new ArrayList();
                for (C5293a aVar : this.f57713g) {
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                }
                unmodifiableList = Collections.unmodifiableList(arrayList);
            } finally {
            }
        }
        return unmodifiableList;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            if (j()) {
                f57704m.k("Trace '%s' is started but not stopped when it is destructed!", this.f57710d);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    /* access modifiers changed from: package-private */
    public l g() {
        return this.f57717k;
    }

    @Keep
    public String getAttribute(String str) {
        return (String) this.f57712f.get(str);
    }

    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f57712f);
    }

    @Keep
    public long getLongMetric(String str) {
        a aVar;
        if (str != null) {
            aVar = (a) this.f57711e.get(str.trim());
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return 0;
        }
        return aVar.a();
    }

    public String getName() {
        return this.f57710d;
    }

    /* access modifiers changed from: package-private */
    public List h() {
        return this.f57714h;
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        if (this.f57717k != null) {
            return true;
        }
        return false;
    }

    @Keep
    public void incrementMetric(String str, long j10) {
        String e10 = e.e(str);
        if (e10 != null) {
            f57704m.d("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, e10);
        } else if (!i()) {
            f57704m.k("Cannot increment metric '%s' for trace '%s' because it's not started", str, this.f57710d);
        } else if (k()) {
            f57704m.k("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, this.f57710d);
        } else {
            a l10 = l(str.trim());
            l10.b(j10);
            f57704m.b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(l10.a()), this.f57710d);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        if (!i() || k()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        if (this.f57718l != null) {
            return true;
        }
        return false;
    }

    @Keep
    public void putAttribute(String str, String str2) {
        boolean z10;
        try {
            str = str.trim();
            str2 = str2.trim();
            b(str, str2);
            f57704m.b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f57710d);
            z10 = true;
        } catch (Exception e10) {
            f57704m.d("Can not set attribute '%s' with value '%s' (%s)", str, str2, e10.getMessage());
            z10 = false;
        }
        if (z10) {
            this.f57712f.put(str, str2);
        }
    }

    @Keep
    public void putMetric(String str, long j10) {
        String e10 = e.e(str);
        if (e10 != null) {
            f57704m.d("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, e10);
        } else if (!i()) {
            f57704m.k("Cannot set value for metric '%s' for trace '%s' because it's not started", str, this.f57710d);
        } else if (k()) {
            f57704m.k("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, this.f57710d);
        } else {
            l(str.trim()).c(j10);
            f57704m.b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j10), this.f57710d);
        }
    }

    @Keep
    public void removeAttribute(String str) {
        if (k()) {
            f57704m.c("Can't remove a attribute from a Trace that's stopped.");
        } else {
            this.f57712f.remove(str);
        }
    }

    @Keep
    public void start() {
        if (!com.google.firebase.perf.config.a.g().K()) {
            f57704m.a("Trace feature is disabled.");
            return;
        }
        String f10 = e.f(this.f57710d);
        if (f10 != null) {
            f57704m.d("Cannot start trace '%s'. Trace name is invalid.(%s)", this.f57710d, f10);
        } else if (this.f57717k != null) {
            f57704m.d("Trace '%s' has already started, should not start again!", this.f57710d);
        } else {
            this.f57717k = this.f57716j.a();
            registerForAppState();
            C5293a perfSession = SessionManager.getInstance().perfSession();
            SessionManager.getInstance().registerForSessionUpdates(this.f57707a);
            a(perfSession);
            if (perfSession.e()) {
                this.f57709c.collectGaugeMetricOnce(perfSession.d());
            }
        }
    }

    @Keep
    public void stop() {
        if (!i()) {
            f57704m.d("Trace '%s' has not been started so unable to stop!", this.f57710d);
        } else if (k()) {
            f57704m.d("Trace '%s' has already stopped, should not stop again!", this.f57710d);
        } else {
            SessionManager.getInstance().unregisterForSessionUpdates(this.f57707a);
            unregisterForAppState();
            l a10 = this.f57716j.a();
            this.f57718l = a10;
            if (this.f57708b == null) {
                n(a10);
                if (!this.f57710d.isEmpty()) {
                    this.f57715i.C(new b(this).a(), getAppState());
                    if (SessionManager.getInstance().perfSession().e()) {
                        this.f57709c.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
                        return;
                    }
                    return;
                }
                f57704m.c("Trace name is empty, no log is sent to server");
            }
        }
    }

    @Keep
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f57708b, 0);
        parcel.writeString(this.f57710d);
        parcel.writeList(this.f57714h);
        parcel.writeMap(this.f57711e);
        parcel.writeParcelable(this.f57717k, 0);
        parcel.writeParcelable(this.f57718l, 0);
        synchronized (this.f57713g) {
            parcel.writeList(this.f57713g);
        }
    }

    private Trace(String str) {
        this(str, C5313k.k(), new Ac.a(), com.google.firebase.perf.application.a.b(), GaugeManager.getInstance());
    }

    public Trace(String str, C5313k kVar, Ac.a aVar, com.google.firebase.perf.application.a aVar2) {
        this(str, kVar, aVar, aVar2, GaugeManager.getInstance());
    }

    public Trace(String str, C5313k kVar, Ac.a aVar, com.google.firebase.perf.application.a aVar2, GaugeManager gaugeManager) {
        super(aVar2);
        this.f57707a = new WeakReference(this);
        this.f57708b = null;
        this.f57710d = str.trim();
        this.f57714h = new ArrayList();
        this.f57711e = new ConcurrentHashMap();
        this.f57712f = new ConcurrentHashMap();
        this.f57716j = aVar;
        this.f57715i = kVar;
        this.f57713g = Collections.synchronizedList(new ArrayList());
        this.f57709c = gaugeManager;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private Trace(Parcel parcel, boolean z10) {
        super(z10 ? null : com.google.firebase.perf.application.a.b());
        this.f57707a = new WeakReference(this);
        Class<Trace> cls = Trace.class;
        this.f57708b = (Trace) parcel.readParcelable(cls.getClassLoader());
        this.f57710d = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f57714h = arrayList;
        parcel.readList(arrayList, cls.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f57711e = concurrentHashMap;
        this.f57712f = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, a.class.getClassLoader());
        Class<l> cls2 = l.class;
        this.f57717k = (l) parcel.readParcelable(cls2.getClassLoader());
        this.f57718l = (l) parcel.readParcelable(cls2.getClassLoader());
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        this.f57713g = synchronizedList;
        parcel.readList(synchronizedList, C5293a.class.getClassLoader());
        if (z10) {
            this.f57715i = null;
            this.f57716j = null;
            this.f57709c = null;
            return;
        }
        this.f57715i = C5313k.k();
        this.f57716j = new Ac.a();
        this.f57709c = GaugeManager.getInstance();
    }
}
