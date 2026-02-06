package io.intercom.android.sdk.utilities;

import U8.b;
import U8.c;
import Y.C1500m;
import Y.M0;
import Y.P;
import Y.Y0;
import android.view.Window;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import qf.C6658d;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LU8/b;", "systemUiController", "Lr0/x0;", "color", "Llf/M;", "applyStatusBarColor-4WTKRHQ", "(LU8/b;J)V", "applyStatusBarColor", "", "darkContentEnabled", "ApplyStatusBarContentColor", "(ZLY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ApplyStatusBarColorKt {
    public static final void ApplyStatusBarContentColor(boolean z10, C1500m mVar, int i10) {
        int i11;
        int i12;
        C1500m h10 = mVar.h(-744586031);
        if ((i10 & 14) == 0) {
            if (h10.b(z10)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) != 2 || !h10.i()) {
            boolean z11 = false;
            b e10 = c.e((Window) null, h10, 0, 1);
            Boolean valueOf = Boolean.valueOf(z10);
            h10.T(-266901048);
            boolean S10 = h10.S(e10);
            if ((i11 & 14) == 4) {
                z11 = true;
            }
            boolean z12 = S10 | z11;
            Object A10 = h10.A();
            if (z12 || A10 == C1500m.f10026a.a()) {
                A10 = new ApplyStatusBarColorKt$ApplyStatusBarContentColor$1$1(e10, z10, (C6658d<? super ApplyStatusBarColorKt$ApplyStatusBarContentColor$1$1>) null);
                h10.r(A10);
            }
            h10.M();
            P.f(e10, valueOf, (p) A10, h10, ((i11 << 3) & 112) | 512);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new a(z10, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ApplyStatusBarContentColor$lambda$1(boolean z10, int i10, C1500m mVar, int i11) {
        ApplyStatusBarContentColor(z10, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* renamed from: applyStatusBarColor-4WTKRHQ  reason: not valid java name */
    public static final void m710applyStatusBarColor4WTKRHQ(b bVar, long j10) {
        C6496s.h(bVar, "systemUiController");
        b.a(bVar, j10, !ColorExtensionsKt.m718isDarkColor8_81llA(j10), (C6798l) null, 4, (Object) null);
    }
}
