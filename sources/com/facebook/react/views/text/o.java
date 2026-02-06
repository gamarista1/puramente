package com.facebook.react.views.text;

import U5.a;
import android.os.Build;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.facebook.react.common.mapbuffer.a;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.I;
import com.facebook.react.uimanager.W;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import java.util.ArrayList;
import java.util.Iterator;

public class o {

    /* renamed from: F  reason: collision with root package name */
    private static final int f42182F = 0;

    /* renamed from: A  reason: collision with root package name */
    protected int f42183A = -1;

    /* renamed from: B  reason: collision with root package name */
    protected String f42184B = null;

    /* renamed from: C  reason: collision with root package name */
    protected String f42185C = null;

    /* renamed from: D  reason: collision with root package name */
    protected boolean f42186D = false;

    /* renamed from: E  reason: collision with root package name */
    protected float f42187E = Float.NaN;

    /* renamed from: a  reason: collision with root package name */
    protected float f42188a = Float.NaN;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f42189b = false;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f42190c = true;

    /* renamed from: d  reason: collision with root package name */
    protected float f42191d = Float.NaN;

    /* renamed from: e  reason: collision with root package name */
    protected int f42192e;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f42193f = false;

    /* renamed from: g  reason: collision with root package name */
    protected int f42194g;

    /* renamed from: h  reason: collision with root package name */
    protected float f42195h = Float.NaN;

    /* renamed from: i  reason: collision with root package name */
    protected int f42196i = -1;

    /* renamed from: j  reason: collision with root package name */
    protected int f42197j = -1;

    /* renamed from: k  reason: collision with root package name */
    protected float f42198k = -1.0f;

    /* renamed from: l  reason: collision with root package name */
    protected float f42199l = -1.0f;

    /* renamed from: m  reason: collision with root package name */
    protected float f42200m = Float.NaN;

    /* renamed from: n  reason: collision with root package name */
    protected int f42201n = 0;

    /* renamed from: o  reason: collision with root package name */
    protected int f42202o = -1;

    /* renamed from: p  reason: collision with root package name */
    protected r f42203p = r.NONE;

    /* renamed from: q  reason: collision with root package name */
    protected float f42204q = 0.0f;

    /* renamed from: r  reason: collision with root package name */
    protected float f42205r = 0.0f;

    /* renamed from: s  reason: collision with root package name */
    protected float f42206s = 0.0f;

    /* renamed from: t  reason: collision with root package name */
    protected int f42207t = 1426063360;

    /* renamed from: u  reason: collision with root package name */
    protected boolean f42208u = false;

    /* renamed from: v  reason: collision with root package name */
    protected boolean f42209v = false;

    /* renamed from: w  reason: collision with root package name */
    protected boolean f42210w = true;

    /* renamed from: x  reason: collision with root package name */
    protected I.e f42211x = null;

    /* renamed from: y  reason: collision with root package name */
    protected I.f f42212y = null;

    /* renamed from: z  reason: collision with root package name */
    protected int f42213z = -1;

    private o() {
    }

    private void A(float f10) {
        this.f42195h = f10;
    }

    private void B(I.f fVar) {
        this.f42212y = fVar;
    }

    private void C(String str) {
        this.f42208u = false;
        this.f42209v = false;
        if (str != null) {
            for (String str2 : str.split("-")) {
                if ("underline".equals(str2)) {
                    this.f42208u = true;
                } else if ("strikethrough".equals(str2)) {
                    this.f42209v = true;
                }
            }
        }
    }

    private void D(int i10) {
        if (i10 != this.f42207t) {
            this.f42207t = i10;
        }
    }

    private void E(float f10) {
        this.f42204q = G.h(f10);
    }

    private void F(float f10) {
        this.f42205r = G.h(f10);
    }

    private void G(float f10) {
        if (f10 != this.f42206s) {
            this.f42206s = f10;
        }
    }

    private void H(String str) {
        if (str == null || "none".equals(str)) {
            this.f42203p = r.NONE;
        } else if ("uppercase".equals(str)) {
            this.f42203p = r.UPPERCASE;
        } else if ("lowercase".equals(str)) {
            this.f42203p = r.LOWERCASE;
        } else if ("capitalize".equals(str)) {
            this.f42203p = r.CAPITALIZE;
        } else {
            a.I("ReactNative", "Invalid textTransform: " + str);
            this.f42203p = r.NONE;
        }
    }

    public static o a(com.facebook.react.common.mapbuffer.a aVar) {
        o oVar = new o();
        Iterator it = aVar.iterator();
        while (it.hasNext()) {
            a.c cVar = (a.c) it.next();
            switch (cVar.getKey()) {
                case 0:
                    oVar.q(Integer.valueOf(cVar.b()));
                    break;
                case 1:
                    oVar.p(Integer.valueOf(cVar.b()));
                    break;
                case 2:
                    oVar.A((float) cVar.c());
                    break;
                case 3:
                    oVar.r(cVar.d());
                    break;
                case 4:
                    oVar.s((float) cVar.c());
                    break;
                case 6:
                    oVar.v(cVar.d());
                    break;
                case 7:
                    oVar.t(cVar.d());
                    break;
                case 8:
                    oVar.u(cVar.e());
                    break;
                case 9:
                    oVar.o(cVar.f());
                    break;
                case 10:
                    oVar.x((float) cVar.c());
                    break;
                case 11:
                    oVar.y((float) cVar.c());
                    break;
                case StdKeyDeserializer.TYPE_CLASS /*15*/:
                    oVar.C(cVar.d());
                    break;
                case 18:
                    oVar.G((float) cVar.c());
                    break;
                case 19:
                    oVar.D(cVar.b());
                    break;
                case InboxPagingSource.PAGE_SIZE /*20*/:
                    oVar.E((float) cVar.c());
                    break;
                case 21:
                    oVar.F((float) cVar.c());
                    break;
                case 23:
                    oVar.w(cVar.d());
                    break;
                case 24:
                    oVar.n(cVar.d());
                    break;
                case 26:
                    oVar.B(I.f.values()[cVar.b()]);
                    break;
                case 27:
                    oVar.H(cVar.d());
                    break;
                case 29:
                    oVar.z((float) cVar.c());
                    break;
            }
        }
        return oVar;
    }

    public static int g(String str) {
        if (str == null) {
            return 0;
        }
        if (str.equals(Constants.NORMAL)) {
            return 1;
        }
        if (!str.equals("none")) {
            return 2;
        }
        return 0;
    }

    public static int h(W w10, int i10) {
        if (!w10.c("textAlign")) {
            return i10;
        }
        if (!"justify".equals(w10.b("textAlign")) || Build.VERSION.SDK_INT < 26) {
            return f42182F;
        }
        return 1;
    }

    public static int i(String str) {
        if (str == null || "undefined".equals(str)) {
            return -1;
        }
        if ("rtl".equals(str)) {
            return 1;
        }
        if ("ltr".equals(str)) {
            return 0;
        }
        U5.a.I("ReactNative", "Invalid layoutDirection: " + str);
        return -1;
    }

    public static int l(W w10, boolean z10, int i10) {
        if (!w10.c("textAlign")) {
            return i10;
        }
        String b10 = w10.b("textAlign");
        if ("justify".equals(b10)) {
            return 3;
        }
        if (b10 != null && !"auto".equals(b10)) {
            if (BlockAlignment.LEFT.equals(b10)) {
                if (z10) {
                    return 5;
                }
                return 3;
            } else if (BlockAlignment.RIGHT.equals(b10)) {
                if (z10) {
                    return 3;
                }
                return 5;
            } else if ("center".equals(b10)) {
                return 1;
            } else {
                U5.a.I("ReactNative", "Invalid textAlign: " + b10);
            }
        }
        return 0;
    }

    public static int m(String str) {
        if (str == null) {
            return 1;
        }
        if (str.equals("balanced")) {
            return 2;
        }
        if (!str.equals("simple")) {
            return 1;
        }
        return 0;
    }

    private void n(String str) {
        if (str == null) {
            this.f42211x = null;
        } else {
            this.f42211x = I.e.c(str);
        }
    }

    private void o(boolean z10) {
        if (z10 != this.f42190c) {
            this.f42190c = z10;
            s(this.f42198k);
            y(this.f42199l);
        }
    }

    private void p(Integer num) {
        boolean z10;
        if (num != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f42193f = z10;
        if (z10) {
            this.f42194g = num.intValue();
        }
    }

    private void q(Integer num) {
        boolean z10;
        if (num != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f42189b = z10;
        if (z10) {
            this.f42192e = num.intValue();
        }
    }

    private void r(String str) {
        this.f42184B = str;
    }

    private void s(float f10) {
        double ceil;
        this.f42198k = f10;
        if (f10 != -1.0f) {
            if (this.f42190c) {
                ceil = Math.ceil((double) G.k(f10, this.f42191d));
            } else {
                ceil = Math.ceil((double) G.h(f10));
            }
            f10 = (float) ceil;
        }
        this.f42197j = (int) f10;
    }

    private void t(String str) {
        this.f42213z = m.b(str);
    }

    private void u(com.facebook.react.common.mapbuffer.a aVar) {
        if (aVar == null || aVar.getCount() == 0) {
            this.f42185C = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = aVar.iterator();
        while (it.hasNext()) {
            String d10 = ((a.c) it.next()).d();
            if (d10 != null) {
                char c10 = 65535;
                switch (d10.hashCode()) {
                    case -1983120972:
                        if (d10.equals("stylistic-thirteen")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1933522176:
                        if (d10.equals("stylistic-fifteen")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -1534462052:
                        if (d10.equals("stylistic-eighteen")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case -1195362251:
                        if (d10.equals("proportional-nums")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case -1061392823:
                        if (d10.equals("lining-nums")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case -771984547:
                        if (d10.equals("tabular-nums")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case -659678800:
                        if (d10.equals("oldstyle-nums")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case 296506098:
                        if (d10.equals("stylistic-eight")) {
                            c10 = 7;
                            break;
                        }
                        break;
                    case 309330544:
                        if (d10.equals("stylistic-seven")) {
                            c10 = 8;
                            break;
                        }
                        break;
                    case 310339585:
                        if (d10.equals("stylistic-three")) {
                            c10 = 9;
                            break;
                        }
                        break;
                    case 604478526:
                        if (d10.equals("stylistic-eleven")) {
                            c10 = 10;
                            break;
                        }
                        break;
                    case 979426287:
                        if (d10.equals("stylistic-five")) {
                            c10 = 11;
                            break;
                        }
                        break;
                    case 979432035:
                        if (d10.equals("stylistic-four")) {
                            c10 = 12;
                            break;
                        }
                        break;
                    case 979664367:
                        if (d10.equals("stylistic-nine")) {
                            c10 = 13;
                            break;
                        }
                        break;
                    case 1001434505:
                        if (d10.equals("stylistic-one")) {
                            c10 = 14;
                            break;
                        }
                        break;
                    case 1001438213:
                        if (d10.equals("stylistic-six")) {
                            c10 = 15;
                            break;
                        }
                        break;
                    case 1001439040:
                        if (d10.equals("stylistic-ten")) {
                            c10 = 16;
                            break;
                        }
                        break;
                    case 1001439599:
                        if (d10.equals("stylistic-two")) {
                            c10 = 17;
                            break;
                        }
                        break;
                    case 1030714463:
                        if (d10.equals("stylistic-sixteen")) {
                            c10 = 18;
                            break;
                        }
                        break;
                    case 1044065430:
                        if (d10.equals("stylistic-twelve")) {
                            c10 = 19;
                            break;
                        }
                        break;
                    case 1044067310:
                        if (d10.equals("stylistic-twenty")) {
                            c10 = 20;
                            break;
                        }
                        break;
                    case 1183323111:
                        if (d10.equals("small-caps")) {
                            c10 = 21;
                            break;
                        }
                        break;
                    case 1463562569:
                        if (d10.equals("stylistic-nineteen")) {
                            c10 = 22;
                            break;
                        }
                        break;
                    case 1648446397:
                        if (d10.equals("stylistic-fourteen")) {
                            c10 = 23;
                            break;
                        }
                        break;
                    case 2097122634:
                        if (d10.equals("stylistic-seventeen")) {
                            c10 = 24;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        arrayList.add("'ss13'");
                        break;
                    case 1:
                        arrayList.add("'ss15'");
                        break;
                    case 2:
                        arrayList.add("'ss18'");
                        break;
                    case 3:
                        arrayList.add("'pnum'");
                        break;
                    case 4:
                        arrayList.add("'lnum'");
                        break;
                    case 5:
                        arrayList.add("'tnum'");
                        break;
                    case 6:
                        arrayList.add("'onum'");
                        break;
                    case 7:
                        arrayList.add("'ss08'");
                        break;
                    case 8:
                        arrayList.add("'ss07'");
                        break;
                    case 9:
                        arrayList.add("'ss03'");
                        break;
                    case 10:
                        arrayList.add("'ss11'");
                        break;
                    case 11:
                        arrayList.add("'ss05'");
                        break;
                    case 12:
                        arrayList.add("'ss04'");
                        break;
                    case 13:
                        arrayList.add("'ss09'");
                        break;
                    case StdKeyDeserializer.TYPE_URL /*14*/:
                        arrayList.add("'ss01'");
                        break;
                    case StdKeyDeserializer.TYPE_CLASS /*15*/:
                        arrayList.add("'ss06'");
                        break;
                    case 16:
                        arrayList.add("'ss10'");
                        break;
                    case 17:
                        arrayList.add("'ss02'");
                        break;
                    case 18:
                        arrayList.add("'ss16'");
                        break;
                    case 19:
                        arrayList.add("'ss12'");
                        break;
                    case InboxPagingSource.PAGE_SIZE /*20*/:
                        arrayList.add("'ss20'");
                        break;
                    case 21:
                        arrayList.add("'smcp'");
                        break;
                    case 22:
                        arrayList.add("'ss19'");
                        break;
                    case 23:
                        arrayList.add("'ss14'");
                        break;
                    case 24:
                        arrayList.add("'ss17'");
                        break;
                }
            }
        }
        this.f42185C = TextUtils.join(", ", arrayList);
    }

    private void v(String str) {
        this.f42183A = m.d(str);
    }

    private void w(String str) {
        this.f42202o = i(str);
    }

    private void x(float f10) {
        this.f42200m = f10;
    }

    private void y(float f10) {
        float f11;
        this.f42199l = f10;
        if (f10 == -1.0f) {
            this.f42188a = Float.NaN;
            return;
        }
        if (this.f42190c) {
            f11 = G.j(f10);
        } else {
            f11 = G.h(f10);
        }
        this.f42188a = f11;
    }

    private void z(float f10) {
        if (f10 != this.f42191d) {
            this.f42191d = f10;
            s(this.f42198k);
            y(this.f42199l);
        }
    }

    public int b() {
        return this.f42197j;
    }

    public float c() {
        if (!Float.isNaN(this.f42188a) && !Float.isNaN(this.f42187E)) {
            float f10 = this.f42187E;
            if (f10 > this.f42188a) {
                return f10;
            }
        }
        return this.f42188a;
    }

    public String d() {
        return this.f42184B;
    }

    public int e() {
        return this.f42213z;
    }

    public int f() {
        return this.f42183A;
    }

    public float j() {
        float f10;
        if (this.f42190c) {
            f10 = G.j(this.f42200m);
        } else {
            f10 = G.h(this.f42200m);
        }
        int i10 = this.f42197j;
        if (i10 > 0) {
            return f10 / ((float) i10);
        }
        throw new IllegalArgumentException("FontSize should be a positive value. Current value: " + this.f42197j);
    }

    public float k() {
        return this.f42195h;
    }
}
