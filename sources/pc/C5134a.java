package pc;

import cc.C4479c;

/* renamed from: pc.a  reason: case insensitive filesystem */
public final class C5134a {

    /* renamed from: p  reason: collision with root package name */
    private static final C5134a f61256p = new C0901a().a();

    /* renamed from: a  reason: collision with root package name */
    private final long f61257a;

    /* renamed from: b  reason: collision with root package name */
    private final String f61258b;

    /* renamed from: c  reason: collision with root package name */
    private final String f61259c;

    /* renamed from: d  reason: collision with root package name */
    private final c f61260d;

    /* renamed from: e  reason: collision with root package name */
    private final d f61261e;

    /* renamed from: f  reason: collision with root package name */
    private final String f61262f;

    /* renamed from: g  reason: collision with root package name */
    private final String f61263g;

    /* renamed from: h  reason: collision with root package name */
    private final int f61264h;

    /* renamed from: i  reason: collision with root package name */
    private final int f61265i;

    /* renamed from: j  reason: collision with root package name */
    private final String f61266j;

    /* renamed from: k  reason: collision with root package name */
    private final long f61267k;

    /* renamed from: l  reason: collision with root package name */
    private final b f61268l;

    /* renamed from: m  reason: collision with root package name */
    private final String f61269m;

    /* renamed from: n  reason: collision with root package name */
    private final long f61270n;

    /* renamed from: o  reason: collision with root package name */
    private final String f61271o;

    /* renamed from: pc.a$a  reason: collision with other inner class name */
    public static final class C0901a {

        /* renamed from: a  reason: collision with root package name */
        private long f61272a = 0;

        /* renamed from: b  reason: collision with root package name */
        private String f61273b = "";

        /* renamed from: c  reason: collision with root package name */
        private String f61274c = "";

        /* renamed from: d  reason: collision with root package name */
        private c f61275d = c.UNKNOWN;

        /* renamed from: e  reason: collision with root package name */
        private d f61276e = d.UNKNOWN_OS;

        /* renamed from: f  reason: collision with root package name */
        private String f61277f = "";

        /* renamed from: g  reason: collision with root package name */
        private String f61278g = "";

        /* renamed from: h  reason: collision with root package name */
        private int f61279h = 0;

        /* renamed from: i  reason: collision with root package name */
        private int f61280i = 0;

        /* renamed from: j  reason: collision with root package name */
        private String f61281j = "";

        /* renamed from: k  reason: collision with root package name */
        private long f61282k = 0;

        /* renamed from: l  reason: collision with root package name */
        private b f61283l = b.UNKNOWN_EVENT;

        /* renamed from: m  reason: collision with root package name */
        private String f61284m = "";

        /* renamed from: n  reason: collision with root package name */
        private long f61285n = 0;

        /* renamed from: o  reason: collision with root package name */
        private String f61286o = "";

        C0901a() {
        }

        public C5134a a() {
            return new C5134a(this.f61272a, this.f61273b, this.f61274c, this.f61275d, this.f61276e, this.f61277f, this.f61278g, this.f61279h, this.f61280i, this.f61281j, this.f61282k, this.f61283l, this.f61284m, this.f61285n, this.f61286o);
        }

        public C0901a b(String str) {
            this.f61284m = str;
            return this;
        }

        public C0901a c(String str) {
            this.f61278g = str;
            return this;
        }

        public C0901a d(String str) {
            this.f61286o = str;
            return this;
        }

        public C0901a e(b bVar) {
            this.f61283l = bVar;
            return this;
        }

        public C0901a f(String str) {
            this.f61274c = str;
            return this;
        }

        public C0901a g(String str) {
            this.f61273b = str;
            return this;
        }

        public C0901a h(c cVar) {
            this.f61275d = cVar;
            return this;
        }

        public C0901a i(String str) {
            this.f61277f = str;
            return this;
        }

        public C0901a j(int i10) {
            this.f61279h = i10;
            return this;
        }

        public C0901a k(long j10) {
            this.f61272a = j10;
            return this;
        }

        public C0901a l(d dVar) {
            this.f61276e = dVar;
            return this;
        }

        public C0901a m(String str) {
            this.f61281j = str;
            return this;
        }

        public C0901a n(int i10) {
            this.f61280i = i10;
            return this;
        }
    }

    /* renamed from: pc.a$b */
    public enum b implements C4479c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f61291a;

        private b(int i10) {
            this.f61291a = i10;
        }

        public int d() {
            return this.f61291a;
        }
    }

    /* renamed from: pc.a$c */
    public enum c implements C4479c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f61297a;

        private c(int i10) {
            this.f61297a = i10;
        }

        public int d() {
            return this.f61297a;
        }
    }

    /* renamed from: pc.a$d */
    public enum d implements C4479c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f61303a;

        private d(int i10) {
            this.f61303a = i10;
        }

        public int d() {
            return this.f61303a;
        }
    }

    C5134a(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f61257a = j10;
        this.f61258b = str;
        this.f61259c = str2;
        this.f61260d = cVar;
        this.f61261e = dVar;
        this.f61262f = str3;
        this.f61263g = str4;
        this.f61264h = i10;
        this.f61265i = i11;
        this.f61266j = str5;
        this.f61267k = j11;
        this.f61268l = bVar;
        this.f61269m = str6;
        this.f61270n = j12;
        this.f61271o = str7;
    }

    public static C0901a p() {
        return new C0901a();
    }

    public String a() {
        return this.f61269m;
    }

    public long b() {
        return this.f61267k;
    }

    public long c() {
        return this.f61270n;
    }

    public String d() {
        return this.f61263g;
    }

    public String e() {
        return this.f61271o;
    }

    public b f() {
        return this.f61268l;
    }

    public String g() {
        return this.f61259c;
    }

    public String h() {
        return this.f61258b;
    }

    public c i() {
        return this.f61260d;
    }

    public String j() {
        return this.f61262f;
    }

    public int k() {
        return this.f61264h;
    }

    public long l() {
        return this.f61257a;
    }

    public d m() {
        return this.f61261e;
    }

    public String n() {
        return this.f61266j;
    }

    public int o() {
        return this.f61265i;
    }
}
