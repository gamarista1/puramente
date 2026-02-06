package com.facebook.share.widget;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.C1769q;
import com.facebook.r;
import java.util.ArrayList;
import java.util.List;
import o7.B;
import o7.C3885a;
import o7.C3889e;
import o7.C3892h;
import o7.C3894j;
import o7.C3895k;
import t5.C4021N;
import u8.d;
import u8.f;
import u8.h;
import u8.m;
import v8.e;
import v8.g;

public final class a extends e {

    /* renamed from: o  reason: collision with root package name */
    private static final int f42388o = C3889e.c.Message.b();

    /* renamed from: n  reason: collision with root package name */
    private boolean f42389n;

    private class b extends C3895k.b {

        /* renamed from: com.facebook.share.widget.a$b$a  reason: collision with other inner class name */
        class C0654a implements C3894j.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C3885a f42391a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e f42392b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f42393c;

            C0654a(C3885a aVar, e eVar, boolean z10) {
                this.f42391a = aVar;
                this.f42392b = eVar;
                this.f42393c = z10;
            }

            public Bundle a() {
                return d.a(this.f42391a.c(), this.f42392b, this.f42393c);
            }

            public Bundle getParameters() {
                return f.a(this.f42391a.c(), this.f42392b, this.f42393c);
            }
        }

        private b() {
            super();
        }

        /* renamed from: d */
        public boolean a(e eVar, boolean z10) {
            if (eVar == null || !a.y(eVar.getClass())) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        public C3885a b(e eVar) {
            h.m(eVar);
            C3885a e10 = a.this.e();
            boolean r10 = a.this.r();
            a.A(a.this.f(), eVar, e10);
            C3894j.k(e10, new C0654a(e10, eVar, r10), a.z(eVar.getClass()));
            return e10;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.app.Activity r2) {
        /*
            r1 = this;
            int r0 = f42388o
            r1.<init>((android.app.Activity) r2, (int) r0)
            r2 = 0
            r1.f42389n = r2
            u8.m.y(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.widget.a.<init>(android.app.Activity):void");
    }

    /* access modifiers changed from: private */
    public static void A(Context context, e eVar, C3885a aVar) {
        String str;
        C3892h z10 = z(eVar.getClass());
        if (z10 == u8.e.MESSAGE_DIALOG) {
            str = "status";
        } else if (z10 == u8.e.MESSENGER_GENERIC_TEMPLATE) {
            str = "GenericTemplate";
        } else if (z10 == u8.e.MESSENGER_MEDIA_TEMPLATE) {
            str = "MediaTemplate";
        } else {
            str = "unknown";
        }
        C4021N n10 = new C4021N(context);
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_content_type", str);
        bundle.putString("fb_share_dialog_content_uuid", aVar.c().toString());
        bundle.putString("fb_share_dialog_content_page_id", eVar.b());
        n10.g("fb_messenger_share_dialog_show", bundle);
    }

    public static boolean y(Class cls) {
        C3892h z10 = z(cls);
        if (z10 == null || !C3894j.b(z10)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static C3892h z(Class cls) {
        if (g.class.isAssignableFrom(cls)) {
            return u8.e.MESSAGE_DIALOG;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public C3885a e() {
        return new C3885a(h());
    }

    /* access modifiers changed from: protected */
    public List g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b());
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public void k(C3889e eVar, r rVar) {
        m.w(h(), eVar, rVar);
    }

    public boolean r() {
        return this.f42389n;
    }

    public void t(boolean z10) {
        this.f42389n = z10;
    }

    a(Activity activity, int i10) {
        super(activity, i10);
        this.f42389n = false;
        m.y(i10);
    }

    a(C1769q qVar, int i10) {
        this(new B(qVar), i10);
    }

    a(Fragment fragment, int i10) {
        this(new B(fragment), i10);
    }

    private a(B b10, int i10) {
        super(b10, i10);
        this.f42389n = false;
        m.y(i10);
    }
}
