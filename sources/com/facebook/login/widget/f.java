package com.facebook.login.widget;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.C1769q;
import com.facebook.C3286a;
import com.facebook.C3294i;
import com.facebook.C3324n;
import com.facebook.C3327q;
import com.facebook.I;
import com.facebook.W;
import com.facebook.login.widget.k;
import com.facebook.r;
import g.C2000c;
import g.C2003f;
import h.C2012a;
import io.intercom.android.sdk.metrics.MetricTracker;
import j.C2115a;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;
import lf.C6521e;
import lf.C6531o;
import mf.C6565s;
import o7.C3884A;
import o7.C3889e;
import o7.C3906w;
import t5.C4021N;
import t7.C4049a;
import y7.C4199e;
import y7.C4213t;
import y7.D;
import y7.G;
import y7.O;
import y7.P;
import y7.Q;
import yf.C6787a;

public abstract class f extends C3327q {

    /* renamed from: A  reason: collision with root package name */
    private static final String f40135A = f.class.getName();

    /* renamed from: z  reason: collision with root package name */
    public static final a f40136z = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public boolean f40137j;

    /* renamed from: k  reason: collision with root package name */
    private String f40138k;

    /* renamed from: l  reason: collision with root package name */
    private String f40139l;

    /* renamed from: m  reason: collision with root package name */
    private final b f40140m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f40141n;

    /* renamed from: o  reason: collision with root package name */
    private k.c f40142o;

    /* renamed from: p  reason: collision with root package name */
    private d f40143p;

    /* renamed from: q  reason: collision with root package name */
    private long f40144q;

    /* renamed from: r  reason: collision with root package name */
    private k f40145r;

    /* renamed from: s  reason: collision with root package name */
    private C3294i f40146s;

    /* renamed from: t  reason: collision with root package name */
    private Lazy f40147t;

    /* renamed from: u  reason: collision with root package name */
    private Float f40148u;

    /* renamed from: v  reason: collision with root package name */
    private int f40149v;

    /* renamed from: w  reason: collision with root package name */
    private final String f40150w;

    /* renamed from: x  reason: collision with root package name */
    private C3324n f40151x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public C2000c f40152y;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private C4199e f40153a = C4199e.FRIENDS;

        /* renamed from: b  reason: collision with root package name */
        private List f40154b = C6565s.n();

        /* renamed from: c  reason: collision with root package name */
        private C4213t f40155c = C4213t.NATIVE_WITH_FALLBACK;

        /* renamed from: d  reason: collision with root package name */
        private String f40156d = "rerequest";

        /* renamed from: e  reason: collision with root package name */
        private G f40157e = G.FACEBOOK;

        /* renamed from: f  reason: collision with root package name */
        private boolean f40158f;

        /* renamed from: g  reason: collision with root package name */
        private String f40159g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f40160h;

        public final String a() {
            return this.f40156d;
        }

        public final C4199e b() {
            return this.f40153a;
        }

        public final C4213t c() {
            return this.f40155c;
        }

        public final G d() {
            return this.f40157e;
        }

        public final String e() {
            return this.f40159g;
        }

        public final List f() {
            return this.f40154b;
        }

        public final boolean g() {
            return this.f40160h;
        }

        public final boolean h() {
            return this.f40158f;
        }

        public final void i(String str) {
            C6496s.h(str, "<set-?>");
            this.f40156d = str;
        }

        public final void j(C4199e eVar) {
            C6496s.h(eVar, "<set-?>");
            this.f40153a = eVar;
        }

        public final void k(C4213t tVar) {
            C6496s.h(tVar, "<set-?>");
            this.f40155c = tVar;
        }

        public final void l(G g10) {
            C6496s.h(g10, "<set-?>");
            this.f40157e = g10;
        }

        public final void m(String str) {
            this.f40159g = str;
        }

        public final void n(List list) {
            C6496s.h(list, "<set-?>");
            this.f40154b = list;
        }

        public final void o(boolean z10) {
            this.f40160h = z10;
        }
    }

    protected class c implements View.OnClickListener {
        public c() {
        }

        /* access modifiers changed from: private */
        public static final void g(D d10, DialogInterface dialogInterface, int i10) {
            Class<c> cls = c.class;
            if (!C4049a.d(cls)) {
                try {
                    C6496s.h(d10, "$loginManager");
                    d10.x();
                } catch (Throwable th2) {
                    C4049a.b(th2, cls);
                }
            }
        }

        /* access modifiers changed from: protected */
        public D b() {
            if (C4049a.d(this)) {
                return null;
            }
            try {
                D c10 = D.f49579j.c();
                c10.G(f.this.getDefaultAudience());
                c10.J(f.this.getLoginBehavior());
                c10.K(c());
                c10.F(f.this.getAuthType());
                c10.I(d());
                c10.N(f.this.getShouldSkipAccountDeduplication());
                c10.L(f.this.getMessengerPageId());
                c10.M(f.this.getResetMessengerState());
                return c10;
            } catch (Throwable th2) {
                C4049a.b(th2, this);
                return null;
            }
        }

        /* access modifiers changed from: protected */
        public final G c() {
            if (C4049a.d(this)) {
                return null;
            }
            try {
                return G.FACEBOOK;
            } catch (Throwable th2) {
                C4049a.b(th2, this);
                return null;
            }
        }

        /* access modifiers changed from: protected */
        public final boolean d() {
            C4049a.d(this);
            return false;
        }

        /* access modifiers changed from: protected */
        public final void e() {
            if (!C4049a.d(this)) {
                try {
                    D b10 = b();
                    C2000c r10 = f.this.f40152y;
                    if (r10 != null) {
                        C2012a a10 = r10.a();
                        C6496s.f(a10, "null cannot be cast to non-null type com.facebook.login.LoginManager.FacebookLoginActivityResultContract");
                        D.c cVar = (D.c) a10;
                        C3324n callbackManager = f.this.getCallbackManager();
                        if (callbackManager == null) {
                            callbackManager = new C3889e();
                        }
                        cVar.c(callbackManager);
                        r10.b(f.this.getProperties().f());
                    } else if (f.this.getFragment() != null) {
                        C1769q fragment = f.this.getFragment();
                        if (fragment != null) {
                            f fVar = f.this;
                            b10.v(fragment, fVar.getProperties().f(), fVar.getLoggerID());
                        }
                    } else if (f.this.getNativeFragment() != null) {
                        Fragment nativeFragment = f.this.getNativeFragment();
                        if (nativeFragment != null) {
                            f fVar2 = f.this;
                            b10.u(nativeFragment, fVar2.getProperties().f(), fVar2.getLoggerID());
                        }
                    } else {
                        b10.s(f.this.getActivity(), f.this.getProperties().f(), f.this.getLoggerID());
                    }
                } catch (Throwable th2) {
                    C4049a.b(th2, this);
                }
            }
        }

        /* access modifiers changed from: protected */
        public final void f(Context context) {
            String str;
            String str2;
            if (!C4049a.d(this)) {
                try {
                    C6496s.h(context, "context");
                    D b10 = b();
                    if (f.this.f40137j) {
                        String string = f.this.getResources().getString(O.f49635d);
                        C6496s.g(string, "resources.getString(R.st…loginview_log_out_action)");
                        String string2 = f.this.getResources().getString(O.f49632a);
                        C6496s.g(string2, "resources.getString(R.st…_loginview_cancel_action)");
                        W b11 = W.f39382h.b();
                        if (b11 != null) {
                            str = b11.getName();
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            U u10 = U.f71764a;
                            String string3 = f.this.getResources().getString(O.f49637f);
                            C6496s.g(string3, "resources.getString(R.st…k_loginview_logged_in_as)");
                            str2 = String.format(string3, Arrays.copyOf(new Object[]{b11.getName()}, 1));
                            C6496s.g(str2, "format(format, *args)");
                        } else {
                            str2 = f.this.getResources().getString(O.f49638g);
                            C6496s.g(str2, "{\n          resources.ge…using_facebook)\n        }");
                        }
                        AlertDialog.Builder builder = new AlertDialog.Builder(context);
                        builder.setMessage(str2).setCancelable(true).setPositiveButton(string, new g(b10)).setNegativeButton(string2, (DialogInterface.OnClickListener) null);
                        builder.create().show();
                        return;
                    }
                    b10.x();
                } catch (Throwable th2) {
                    C4049a.b(th2, this);
                }
            }
        }

        public void onClick(View view) {
            if (!C4049a.d(this)) {
                try {
                    C6496s.h(view, "v");
                    f.this.b(view);
                    C3286a.c cVar = C3286a.f39402l;
                    C3286a e10 = cVar.e();
                    boolean g10 = cVar.g();
                    if (g10) {
                        Context context = f.this.getContext();
                        C6496s.g(context, "context");
                        f(context);
                    } else {
                        e();
                    }
                    C4021N n10 = new C4021N(f.this.getContext());
                    Bundle bundle = new Bundle();
                    int i10 = 1;
                    if (e10 != null) {
                        i10 = 0;
                    }
                    bundle.putInt("logging_in", i10);
                    bundle.putInt("access_token_expired", g10 ? 1 : 0);
                    n10.g("fb_login_view_usage", bundle);
                } catch (Throwable th2) {
                    C4049a.b(th2, this);
                }
            }
        }
    }

    public enum d {
        AUTOMATIC(MetricTracker.CarouselSource.AUTOMATIC, 0),
        DISPLAY_ALWAYS("display_always", 1),
        NEVER_DISPLAY("never_display", 2);
        

        /* renamed from: c  reason: collision with root package name */
        public static final a f40162c = null;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final d f40163d = null;

        /* renamed from: a  reason: collision with root package name */
        private final String f40168a;

        /* renamed from: b  reason: collision with root package name */
        private final int f40169b;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(int i10) {
                for (d dVar : d.values()) {
                    if (dVar.c() == i10) {
                        return dVar;
                    }
                }
                return null;
            }

            public final d b() {
                return d.f40163d;
            }

            private a() {
            }
        }

        static {
            d dVar;
            f40162c = new a((DefaultConstructorMarker) null);
            f40163d = dVar;
        }

        private d(String str, int i10) {
            this.f40168a = str;
            this.f40169b = i10;
        }

        public final int c() {
            return this.f40169b;
        }

        public String toString() {
            return this.f40168a;
        }
    }

    public /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f40170a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.facebook.login.widget.f$d[] r0 = com.facebook.login.widget.f.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.login.widget.f$d r1 = com.facebook.login.widget.f.d.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.facebook.login.widget.f$d r1 = com.facebook.login.widget.f.d.DISPLAY_ALWAYS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.facebook.login.widget.f$d r1 = com.facebook.login.widget.f.d.NEVER_DISPLAY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f40170a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.widget.f.e.<clinit>():void");
        }
    }

    /* renamed from: com.facebook.login.widget.f$f  reason: collision with other inner class name */
    public static final class C0634f extends C3294i {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f40171f;

        C0634f(f fVar) {
            this.f40171f = fVar;
        }

        /* access modifiers changed from: protected */
        public void d(C3286a aVar, C3286a aVar2) {
            this.f40171f.F();
            this.f40171f.D();
        }
    }

    static final class g extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final g f40172a = new g();

        g() {
            super(0);
        }

        /* renamed from: a */
        public final D invoke() {
            return D.f49579j.c();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected f(Context context, AttributeSet attributeSet, int i10, int i11, String str, String str2) {
        super(context, attributeSet, i10, i11, str, str2);
        C6496s.h(context, "context");
        C6496s.h(str, "analyticsButtonCreatedEventName");
        C6496s.h(str2, "analyticsButtonTappedEventName");
        this.f40140m = new b();
        this.f40142o = k.c.BLUE;
        this.f40143p = d.f40162c.b();
        this.f40144q = 6000;
        this.f40147t = C6531o.b(g.f40172a);
        this.f40149v = 255;
        String uuid = UUID.randomUUID().toString();
        C6496s.g(uuid, "randomUUID().toString()");
        this.f40150w = uuid;
    }

    /* access modifiers changed from: private */
    public static final void A(C3324n.a aVar) {
    }

    private final void H(C3906w wVar) {
        if (!C4049a.d(this) && wVar != null) {
            try {
                if (wVar.m() && getVisibility() == 0) {
                    x(wVar.l());
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    private final void t() {
        if (!C4049a.d(this)) {
            try {
                int i10 = e.f40170a[this.f40143p.ordinal()];
                if (i10 == 1) {
                    I.t().execute(new c(o7.W.K(getContext()), this));
                } else if (i10 == 2) {
                    String string = getResources().getString(O.f49639h);
                    C6496s.g(string, "resources.getString(R.st…facebook_tooltip_default)");
                    x(string);
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void u(String str, f fVar) {
        C6496s.h(str, "$appId");
        C6496s.h(fVar, "this$0");
        fVar.getActivity().runOnUiThread(new e(fVar, C3884A.u(str, false)));
    }

    /* access modifiers changed from: private */
    public static final void v(f fVar, C3906w wVar) {
        C6496s.h(fVar, "this$0");
        fVar.H(wVar);
    }

    private final void x(String str) {
        if (!C4049a.d(this)) {
            try {
                k kVar = new k(str, this);
                kVar.h(this.f40142o);
                kVar.g(this.f40144q);
                kVar.i();
                this.f40145r = kVar;
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    private final int z(String str) {
        if (C4049a.d(this)) {
            return 0;
        }
        try {
            return getCompoundPaddingLeft() + getCompoundDrawablePadding() + f(str) + getCompoundPaddingRight();
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    public final void B(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes;
        if (!C4049a.d(this)) {
            try {
                C6496s.h(context, "context");
                d.a aVar = d.f40162c;
                this.f40143p = aVar.b();
                obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, Q.f49663W, i10, i11);
                C6496s.g(obtainStyledAttributes, "context\n            .the…efStyleAttr, defStyleRes)");
                this.f40137j = obtainStyledAttributes.getBoolean(Q.f49664X, true);
                setLoginText(obtainStyledAttributes.getString(Q.f49668a0));
                setLogoutText(obtainStyledAttributes.getString(Q.f49670b0));
                d a10 = aVar.a(obtainStyledAttributes.getInt(Q.f49672c0, aVar.b().c()));
                if (a10 == null) {
                    a10 = aVar.b();
                }
                this.f40143p = a10;
                if (obtainStyledAttributes.hasValue(Q.f49665Y)) {
                    this.f40148u = Float.valueOf(obtainStyledAttributes.getDimension(Q.f49665Y, 0.0f));
                }
                int integer = obtainStyledAttributes.getInteger(Q.f49666Z, 255);
                this.f40149v = integer;
                int max = Math.max(0, integer);
                this.f40149v = max;
                this.f40149v = Math.min(255, max);
                obtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public final void C(C3324n nVar, r rVar) {
        C6496s.h(nVar, "callbackManager");
        C6496s.h(rVar, "callback");
        ((D) this.f40147t.getValue()).C(nVar, rVar);
        C3324n nVar2 = this.f40151x;
        if (nVar2 == null) {
            this.f40151x = nVar;
        } else if (nVar2 != nVar) {
            Log.w(f40135A, "You're registering a callback on the one Facebook login button with two different callback managers. It's almost wrong and may cause unexpected results. Only the first callback manager will be used for handling activity result with androidx.");
        }
    }

    /* access modifiers changed from: protected */
    public final void D() {
        if (!C4049a.d(this)) {
            try {
                setCompoundDrawablesWithIntrinsicBounds(C2115a.b(getContext(), P5.b.f33465a), (Drawable) null, (Drawable) null, (Drawable) null);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void E() {
        GradientDrawable gradientDrawable;
        if (!C4049a.d(this)) {
            try {
                Float f10 = this.f40148u;
                if (f10 != null) {
                    float floatValue = f10.floatValue();
                    Drawable background = getBackground();
                    if (Build.VERSION.SDK_INT >= 29 && (background instanceof StateListDrawable)) {
                        int a10 = ((StateListDrawable) background).getStateCount();
                        for (int i10 = 0; i10 < a10; i10++) {
                            Drawable a11 = ((StateListDrawable) background).getStateDrawable(i10);
                            if (a11 instanceof GradientDrawable) {
                                gradientDrawable = (GradientDrawable) a11;
                            } else {
                                gradientDrawable = null;
                            }
                            if (gradientDrawable != null) {
                                gradientDrawable.setCornerRadius(floatValue);
                            }
                        }
                    }
                    if (background instanceof GradientDrawable) {
                        ((GradientDrawable) background).setCornerRadius(floatValue);
                    }
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void F() {
        if (!C4049a.d(this)) {
            try {
                Resources resources = getResources();
                if (isInEditMode() || !C3286a.f39402l.g()) {
                    String str = this.f40138k;
                    if (str != null) {
                        setText(str);
                        return;
                    }
                    String string = resources.getString(getLoginButtonContinueLabel());
                    C6496s.g(string, "resources.getString(loginButtonContinueLabel)");
                    int width = getWidth();
                    if (width != 0 && z(string) > width) {
                        string = resources.getString(O.f49633b);
                        C6496s.g(string, "resources.getString(R.st…_loginview_log_in_button)");
                    }
                    setText(string);
                    return;
                }
                String str2 = this.f40139l;
                if (str2 == null) {
                    str2 = resources.getString(O.f49636e);
                }
                setText(str2);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void G() {
        if (!C4049a.d(this)) {
            try {
                getBackground().setAlpha(this.f40149v);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void c(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (!C4049a.d(this)) {
            try {
                C6496s.h(context, "context");
                super.c(context, attributeSet, i10, i11);
                setInternalOnClickListener(getNewLoginClickListener());
                B(context, attributeSet, i10, i11);
                if (isInEditMode()) {
                    setBackgroundColor(getResources().getColor(P5.a.f33464a));
                    setLoginText("Continue with Facebook");
                } else {
                    this.f40146s = new C0634f(this);
                }
                F();
                E();
                G();
                D();
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public final String getAuthType() {
        return this.f40140m.a();
    }

    public final C3324n getCallbackManager() {
        return this.f40151x;
    }

    public final C4199e getDefaultAudience() {
        return this.f40140m.b();
    }

    /* access modifiers changed from: protected */
    public int getDefaultRequestCode() {
        if (C4049a.d(this)) {
            return 0;
        }
        try {
            return C3889e.c.Login.b();
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    public int getDefaultStyleResource() {
        return P.f49640a;
    }

    public final String getLoggerID() {
        return this.f40150w;
    }

    public final C4213t getLoginBehavior() {
        return this.f40140m.c();
    }

    /* access modifiers changed from: protected */
    public final int getLoginButtonContinueLabel() {
        return O.f49634c;
    }

    /* access modifiers changed from: protected */
    public final Lazy getLoginManagerLazy() {
        return this.f40147t;
    }

    public final G getLoginTargetApp() {
        return this.f40140m.d();
    }

    public final String getLoginText() {
        return this.f40138k;
    }

    public final String getLogoutText() {
        return this.f40139l;
    }

    public final String getMessengerPageId() {
        return this.f40140m.e();
    }

    /* access modifiers changed from: protected */
    public c getNewLoginClickListener() {
        return new c();
    }

    public final List<String> getPermissions() {
        return this.f40140m.f();
    }

    /* access modifiers changed from: protected */
    public final b getProperties() {
        return this.f40140m;
    }

    public final boolean getResetMessengerState() {
        return this.f40140m.g();
    }

    public final boolean getShouldSkipAccountDeduplication() {
        return this.f40140m.h();
    }

    public final long getToolTipDisplayTime() {
        return this.f40144q;
    }

    public final d getToolTipMode() {
        return this.f40143p;
    }

    public final k.c getToolTipStyle() {
        return this.f40142o;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        if (!C4049a.d(this)) {
            try {
                super.onAttachedToWindow();
                if (getContext() instanceof C2003f) {
                    Context context = getContext();
                    C6496s.f(context, "null cannot be cast to non-null type androidx.activity.result.ActivityResultRegistryOwner");
                    this.f40152y = ((C2003f) context).getActivityResultRegistry().m("facebook-login", ((D) this.f40147t.getValue()).i(this.f40151x, this.f40150w), new d());
                }
                C3294i iVar = this.f40146s;
                if (iVar != null && iVar.c()) {
                    iVar.e();
                    F();
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (!C4049a.d(this)) {
            try {
                super.onDetachedFromWindow();
                C2000c cVar = this.f40152y;
                if (cVar != null) {
                    cVar.d();
                }
                C3294i iVar = this.f40146s;
                if (iVar != null) {
                    iVar.f();
                }
                w();
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!C4049a.d(this)) {
            try {
                C6496s.h(canvas, "canvas");
                super.onDraw(canvas);
                if (!this.f40141n && !isInEditMode()) {
                    this.f40141n = true;
                    t();
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (!C4049a.d(this)) {
            try {
                super.onLayout(z10, i10, i11, i12, i13);
                F();
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        if (!C4049a.d(this)) {
            try {
                Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
                int compoundPaddingTop = getCompoundPaddingTop() + ((int) Math.ceil((double) (Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom)))) + getCompoundPaddingBottom();
                Resources resources = getResources();
                int y10 = y(i10);
                String str = this.f40139l;
                if (str == null) {
                    str = resources.getString(O.f49636e);
                    C6496s.g(str, "resources.getString(R.st…loginview_log_out_button)");
                }
                setMeasuredDimension(View.resolveSize(Math.max(y10, z(str)), i10), compoundPaddingTop);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i10) {
        if (!C4049a.d(this)) {
            try {
                C6496s.h(view, "changedView");
                super.onVisibilityChanged(view, i10);
                if (i10 != 0) {
                    w();
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public final void setAuthType(String str) {
        C6496s.h(str, "value");
        this.f40140m.i(str);
    }

    public final void setDefaultAudience(C4199e eVar) {
        C6496s.h(eVar, "value");
        this.f40140m.j(eVar);
    }

    public final void setLoginBehavior(C4213t tVar) {
        C6496s.h(tVar, "value");
        this.f40140m.k(tVar);
    }

    /* access modifiers changed from: protected */
    public final void setLoginManagerLazy(Lazy lazy) {
        C6496s.h(lazy, "<set-?>");
        this.f40147t = lazy;
    }

    public final void setLoginTargetApp(G g10) {
        C6496s.h(g10, "value");
        this.f40140m.l(g10);
    }

    public final void setLoginText(String str) {
        this.f40138k = str;
        F();
    }

    public final void setLogoutText(String str) {
        this.f40139l = str;
        F();
    }

    public final void setMessengerPageId(String str) {
        this.f40140m.m(str);
    }

    public final void setPermissions(String... strArr) {
        C6496s.h(strArr, "permissions");
        this.f40140m.n(C6565s.s(Arrays.copyOf(strArr, strArr.length)));
    }

    @C6521e
    public final void setPublishPermissions(List<String> list) {
        C6496s.h(list, "permissions");
        this.f40140m.n(list);
    }

    @C6521e
    public final void setReadPermissions(List<String> list) {
        C6496s.h(list, "permissions");
        this.f40140m.n(list);
    }

    public final void setResetMessengerState(boolean z10) {
        this.f40140m.o(z10);
    }

    public final void setToolTipDisplayTime(long j10) {
        this.f40144q = j10;
    }

    public final void setToolTipMode(d dVar) {
        C6496s.h(dVar, "<set-?>");
        this.f40143p = dVar;
    }

    public final void setToolTipStyle(k.c cVar) {
        C6496s.h(cVar, "<set-?>");
        this.f40142o = cVar;
    }

    public final void w() {
        k kVar = this.f40145r;
        if (kVar != null) {
            kVar.d();
        }
        this.f40145r = null;
    }

    /* access modifiers changed from: protected */
    public final int y(int i10) {
        if (C4049a.d(this)) {
            return 0;
        }
        try {
            Resources resources = getResources();
            String str = this.f40138k;
            if (str == null) {
                str = resources.getString(O.f49634c);
                int z10 = z(str);
                if (View.resolveSize(z10, i10) < z10) {
                    str = resources.getString(O.f49633b);
                }
            }
            return z(str);
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return 0;
        }
    }

    public final void setPermissions(List<String> list) {
        C6496s.h(list, "value");
        this.f40140m.n(list);
    }

    @C6521e
    public final void setPublishPermissions(String... strArr) {
        C6496s.h(strArr, "permissions");
        this.f40140m.n(C6565s.s(Arrays.copyOf(strArr, strArr.length)));
    }

    @C6521e
    public final void setReadPermissions(String... strArr) {
        C6496s.h(strArr, "permissions");
        this.f40140m.n(C6565s.s(Arrays.copyOf(strArr, strArr.length)));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        this(context, (AttributeSet) null, 0, 0, "fb_login_button_create", "fb_login_button_did_tap");
        C6496s.h(context, "context");
    }
}
