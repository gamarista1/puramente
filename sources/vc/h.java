package vc;

import Ac.o;
import Bc.h;
import Bc.k;
import com.google.firebase.perf.application.a;
import com.google.firebase.perf.application.b;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import uc.C5233a;
import xc.d;
import yc.C5293a;
import zc.C5313k;

public final class h extends b implements yc.b {

    /* renamed from: i  reason: collision with root package name */
    private static final C5233a f61771i = C5233a.e();

    /* renamed from: a  reason: collision with root package name */
    private final List f61772a;

    /* renamed from: b  reason: collision with root package name */
    private final GaugeManager f61773b;

    /* renamed from: c  reason: collision with root package name */
    private final C5313k f61774c;

    /* renamed from: d  reason: collision with root package name */
    private final h.b f61775d;

    /* renamed from: e  reason: collision with root package name */
    private final WeakReference f61776e;

    /* renamed from: f  reason: collision with root package name */
    private String f61777f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f61778g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f61779h;

    private h(C5313k kVar) {
        this(kVar, a.b(), GaugeManager.getInstance());
    }

    public static h c(C5313k kVar) {
        return new h(kVar);
    }

    private boolean h() {
        return this.f61775d.E();
    }

    private boolean i() {
        return this.f61775d.G();
    }

    private static boolean j(String str) {
        if (str.length() > 128) {
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt <= 31 || charAt > 127) {
                return false;
            }
        }
        return true;
    }

    public h B(long j10) {
        this.f61775d.R(j10);
        return this;
    }

    public h F(String str) {
        if (str != null) {
            this.f61775d.S(o.e(o.d(str), 2000));
        }
        return this;
    }

    public h G(String str) {
        this.f61777f = str;
        return this;
    }

    public void a(C5293a aVar) {
        if (aVar == null) {
            f61771i.j("Unable to add new SessionId to the Network Trace. Continuing without it.");
        } else if (h() && !i()) {
            this.f61772a.add(aVar);
        }
    }

    public Bc.h b() {
        SessionManager.getInstance().unregisterForSessionUpdates(this.f61776e);
        unregisterForAppState();
        k[] b10 = C5293a.b(d());
        if (b10 != null) {
            this.f61775d.z(Arrays.asList(b10));
        }
        Bc.h hVar = (Bc.h) this.f61775d.q();
        if (!d.c(this.f61777f)) {
            f61771i.a("Dropping network request from a 'User-Agent' that is not allowed");
            return hVar;
        } else if (!this.f61778g) {
            this.f61774c.B(hVar, getAppState());
            this.f61778g = true;
            return hVar;
        } else {
            if (this.f61779h) {
                f61771i.a("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
            }
            return hVar;
        }
    }

    /* access modifiers changed from: package-private */
    public List d() {
        List unmodifiableList;
        synchronized (this.f61772a) {
            try {
                ArrayList arrayList = new ArrayList();
                for (C5293a aVar : this.f61772a) {
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

    public long e() {
        return this.f61775d.C();
    }

    public String f() {
        return this.f61775d.D();
    }

    public boolean g() {
        return this.f61775d.F();
    }

    public h k(Map map) {
        this.f61775d.A().H(map);
        return this;
    }

    public h l(String str) {
        h.d dVar;
        if (str != null) {
            h.d dVar2 = h.d.HTTP_METHOD_UNKNOWN;
            String upperCase = str.toUpperCase();
            upperCase.hashCode();
            char c10 = 65535;
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (upperCase.equals("OPTIONS")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 70454:
                    if (upperCase.equals("GET")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 79599:
                    if (upperCase.equals("PUT")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 2213344:
                    if (upperCase.equals("HEAD")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 2461856:
                    if (upperCase.equals("POST")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 75900968:
                    if (upperCase.equals("PATCH")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 80083237:
                    if (upperCase.equals("TRACE")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1669334218:
                    if (upperCase.equals("CONNECT")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 2012838315:
                    if (upperCase.equals("DELETE")) {
                        c10 = 8;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    dVar = h.d.OPTIONS;
                    break;
                case 1:
                    dVar = h.d.GET;
                    break;
                case 2:
                    dVar = h.d.PUT;
                    break;
                case 3:
                    dVar = h.d.HEAD;
                    break;
                case 4:
                    dVar = h.d.POST;
                    break;
                case 5:
                    dVar = h.d.PATCH;
                    break;
                case 6:
                    dVar = h.d.TRACE;
                    break;
                case 7:
                    dVar = h.d.CONNECT;
                    break;
                case 8:
                    dVar = h.d.DELETE;
                    break;
                default:
                    dVar = h.d.HTTP_METHOD_UNKNOWN;
                    break;
            }
            this.f61775d.J(dVar);
        }
        return this;
    }

    public h n(int i10) {
        this.f61775d.K(i10);
        return this;
    }

    public void o() {
        this.f61779h = true;
    }

    public h p() {
        this.f61775d.L(h.e.GENERIC_CLIENT_ERROR);
        return this;
    }

    public h q(long j10) {
        this.f61775d.M(j10);
        return this;
    }

    public h s(long j10) {
        C5293a perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f61776e);
        this.f61775d.I(j10);
        a(perfSession);
        if (perfSession.e()) {
            this.f61773b.collectGaugeMetricOnce(perfSession.d());
        }
        return this;
    }

    public h u(String str) {
        if (str == null) {
            this.f61775d.B();
            return this;
        }
        if (j(str)) {
            this.f61775d.N(str);
        } else {
            C5233a aVar = f61771i;
            aVar.j("The content type of the response is not a valid content-type:" + str);
        }
        return this;
    }

    public h v(long j10) {
        this.f61775d.O(j10);
        return this;
    }

    public h w(long j10) {
        this.f61775d.P(j10);
        return this;
    }

    public h y(long j10) {
        this.f61775d.Q(j10);
        if (SessionManager.getInstance().perfSession().e()) {
            this.f61773b.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
        }
        return this;
    }

    public h(C5313k kVar, a aVar, GaugeManager gaugeManager) {
        super(aVar);
        this.f61775d = Bc.h.H0();
        this.f61776e = new WeakReference(this);
        this.f61774c = kVar;
        this.f61773b = gaugeManager;
        this.f61772a = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }
}
