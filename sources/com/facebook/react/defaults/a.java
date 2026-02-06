package com.facebook.react.defaults;

import M7.b;
import M7.f;
import kotlin.Pair;
import lf.C6502A;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f40636a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f40637b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f40638c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f40639d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f40640e;

    /* renamed from: com.facebook.react.defaults.a$a  reason: collision with other inner class name */
    public static final class C0637a extends f {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f40641b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f40642c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f40643d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0637a(boolean z10, boolean z11, boolean z12) {
            super(z10);
            this.f40641b = z10;
            this.f40642c = z11;
            this.f40643d = z12;
        }

        public boolean enableEventEmitterRetentionDuringGesturesOnAndroid() {
            if (this.f40641b || this.f40642c) {
                return true;
            }
            return false;
        }

        public boolean enableFabricRenderer() {
            if (this.f40641b || this.f40642c) {
                return true;
            }
            return false;
        }

        public boolean useFabricInterop() {
            if (this.f40641b || this.f40642c) {
                return true;
            }
            return false;
        }

        public boolean useTurboModules() {
            if (this.f40641b || this.f40643d) {
                return true;
            }
            return false;
        }
    }

    private a() {
    }

    public static final boolean a() {
        return f40637b;
    }

    public static final void c(boolean z10, boolean z11, boolean z12) {
        Pair b10 = f40636a.b(z10, z11, z12);
        boolean booleanValue = ((Boolean) b10.a()).booleanValue();
        String str = (String) b10.b();
        if (booleanValue) {
            b.q(new C0637a(z12, z11, z10));
            f40637b = z11;
            f40638c = z10;
            f40639d = z11;
            f40640e = z12;
            e.f40647a.a();
            return;
        }
        throw new IllegalStateException(str.toString());
    }

    public static /* synthetic */ void d(boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            z12 = true;
        }
        c(z10, z11, z12);
    }

    public final Pair b(boolean z10, boolean z11, boolean z12) {
        if (z11 && !z10) {
            return C6502A.a(Boolean.FALSE, "fabricEnabled=true requires turboModulesEnabled=true (is now false) - Please update your DefaultNewArchitectureEntryPoint.load() parameters.");
        }
        if (!z12 || (z10 && z11)) {
            return C6502A.a(Boolean.TRUE, "");
        }
        return C6502A.a(Boolean.FALSE, "bridgelessEnabled=true requires (turboModulesEnabled=true AND fabricEnabled=true) - Please update your DefaultNewArchitectureEntryPoint.load() parameters.");
    }
}
