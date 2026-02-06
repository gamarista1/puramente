package We;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import p003if.a;

/* renamed from: We.a  reason: case insensitive filesystem */
public final class C5615a {

    /* renamed from: i  reason: collision with root package name */
    static final Integer f65780i = 8192;

    /* renamed from: j  reason: collision with root package name */
    static final Integer f65781j = 64;

    /* renamed from: k  reason: collision with root package name */
    private static final b f65782k = new b();

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap f65783a;

    /* renamed from: b  reason: collision with root package name */
    private final a f65784b;

    /* renamed from: c  reason: collision with root package name */
    private Double f65785c;

    /* renamed from: d  reason: collision with root package name */
    private Double f65786d;

    /* renamed from: e  reason: collision with root package name */
    private final String f65787e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f65788f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f65789g;

    /* renamed from: h  reason: collision with root package name */
    final C5654u f65790h;

    /* renamed from: We.a$b */
    private static class b extends ThreadLocal {
        private b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public DecimalFormat initialValue() {
            return new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT));
        }
    }

    public C5615a(C5654u uVar) {
        this(new ConcurrentHashMap(), (Double) null, (Double) null, (String) null, true, false, uVar);
    }

    public void a() {
        this.f65788f = false;
    }

    public Double b() {
        return this.f65786d;
    }

    public Double c() {
        return this.f65785c;
    }

    public boolean d() {
        return this.f65788f;
    }

    public boolean e() {
        return this.f65789g;
    }

    public void f(Double d10) {
        if (d()) {
            this.f65786d = d10;
        }
    }

    public C5615a(ConcurrentHashMap concurrentHashMap, Double d10, Double d11, String str, boolean z10, boolean z11, C5654u uVar) {
        this.f65784b = new a();
        this.f65783a = concurrentHashMap;
        this.f65785c = d10;
        this.f65786d = d11;
        this.f65790h = uVar;
        this.f65787e = str;
        this.f65788f = z10;
        this.f65789g = z11;
    }

    public void g(g1 g1Var) {
    }
}
