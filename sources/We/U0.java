package We;

import ff.C5844E;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public final class U0 {

    /* renamed from: a  reason: collision with root package name */
    private final Date f65740a;

    /* renamed from: b  reason: collision with root package name */
    private Date f65741b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicInteger f65742c;

    /* renamed from: d  reason: collision with root package name */
    private final String f65743d;

    /* renamed from: e  reason: collision with root package name */
    private final String f65744e;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f65745f;

    /* renamed from: g  reason: collision with root package name */
    private b f65746g;

    /* renamed from: h  reason: collision with root package name */
    private Long f65747h;

    /* renamed from: i  reason: collision with root package name */
    private Double f65748i;

    /* renamed from: j  reason: collision with root package name */
    private final String f65749j;

    /* renamed from: k  reason: collision with root package name */
    private String f65750k;

    /* renamed from: l  reason: collision with root package name */
    private final String f65751l;

    /* renamed from: m  reason: collision with root package name */
    private final String f65752m;

    /* renamed from: n  reason: collision with root package name */
    private String f65753n;

    /* renamed from: o  reason: collision with root package name */
    private final p003if.a f65754o;

    public static final class a {
    }

    public enum b {
        Ok,
        Exited,
        Crashed,
        Abnormal
    }

    public U0(b bVar, Date date, Date date2, int i10, String str, String str2, Boolean bool, Long l10, Double d10, String str3, String str4, String str5, String str6, String str7) {
        this.f65754o = new p003if.a();
        this.f65746g = bVar;
        this.f65740a = date;
        this.f65741b = date2;
        this.f65742c = new AtomicInteger(i10);
        this.f65743d = str;
        this.f65744e = str2;
        this.f65745f = bool;
        this.f65747h = l10;
        this.f65748i = d10;
        this.f65749j = str3;
        this.f65750k = str4;
        this.f65751l = str5;
        this.f65752m = str6;
        this.f65753n = str7;
    }

    private double a(Date date) {
        return ((double) Math.abs(date.getTime() - this.f65740a.getTime())) / 1000.0d;
    }

    private long e(Date date) {
        long time = date.getTime();
        if (time < 0) {
            return Math.abs(time);
        }
        return time;
    }

    /* renamed from: b */
    public U0 clone() {
        return new U0(this.f65746g, this.f65740a, this.f65741b, this.f65742c.get(), this.f65743d, this.f65744e, this.f65745f, this.f65747h, this.f65748i, this.f65749j, this.f65750k, this.f65751l, this.f65752m, this.f65753n);
    }

    public void c() {
        d(C5627g.a());
    }

    public void d(Date date) {
        C5664z a10 = this.f65754o.a();
        try {
            this.f65745f = null;
            if (this.f65746g == b.Ok) {
                this.f65746g = b.Exited;
            }
            if (date != null) {
                this.f65741b = date;
            } else {
                this.f65741b = C5627g.a();
            }
            Date date2 = this.f65741b;
            if (date2 != null) {
                this.f65748i = Double.valueOf(a(date2));
                this.f65747h = Long.valueOf(e(this.f65741b));
            }
            if (a10 != null) {
                a10.close();
                return;
            }
            return;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public U0(String str, C5844E e10, String str2, String str3) {
        this(b.Ok, C5627g.a(), C5627g.a(), 0, str, S0.a(), Boolean.TRUE, (Long) null, (Double) null, e10 != null ? e10.a() : null, (String) null, str2, str3, (String) null);
    }
}
