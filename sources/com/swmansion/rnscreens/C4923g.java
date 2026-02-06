package com.swmansion.rnscreens;

import androidx.activity.G;
import androidx.activity.H;
import androidx.fragment.app.C1769q;
import androidx.fragment.app.C1773v;
import kotlin.jvm.internal.C6496s;

/* renamed from: com.swmansion.rnscreens.g  reason: case insensitive filesystem */
public final class C4923g {

    /* renamed from: a  reason: collision with root package name */
    private final C1769q f59793a;

    /* renamed from: b  reason: collision with root package name */
    private final G f59794b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f59795c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f59796d = true;

    public C4923g(C1769q qVar, G g10) {
        C6496s.h(qVar, "fragment");
        C6496s.h(g10, "onBackPressedCallback");
        this.f59793a = qVar;
        this.f59794b = g10;
    }

    public final boolean a() {
        return this.f59796d;
    }

    public final void b() {
        H onBackPressedDispatcher;
        if (!this.f59795c && this.f59796d) {
            C1773v activity = this.f59793a.getActivity();
            if (!(activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null)) {
                onBackPressedDispatcher.i(this.f59793a, this.f59794b);
            }
            this.f59795c = true;
        }
    }

    public final void c() {
        if (this.f59795c) {
            this.f59794b.h();
            this.f59795c = false;
        }
    }

    public final void d(boolean z10) {
        this.f59796d = z10;
    }
}
