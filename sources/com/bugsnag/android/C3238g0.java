package com.bugsnag.android;

import K4.k;
import L4.d;
import android.content.Context;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6787a;

/* renamed from: com.bugsnag.android.g0  reason: case insensitive filesystem */
public final class C3238g0 {

    /* renamed from: a  reason: collision with root package name */
    private final File f38708a;

    /* renamed from: b  reason: collision with root package name */
    private final C6787a f38709b;

    /* renamed from: c  reason: collision with root package name */
    private final File f38710c;

    /* renamed from: d  reason: collision with root package name */
    private final C6787a f38711d;

    /* renamed from: e  reason: collision with root package name */
    private final d f38712e;

    /* renamed from: f  reason: collision with root package name */
    private final S0 f38713f;

    /* renamed from: g  reason: collision with root package name */
    private C3235f0 f38714g;

    /* renamed from: h  reason: collision with root package name */
    private C3235f0 f38715h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f38716i;

    /* renamed from: j  reason: collision with root package name */
    private c f38717j;

    /* renamed from: com.bugsnag.android.g0$a */
    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f38718a = new a();

        a() {
            super(0);
        }

        /* renamed from: a */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* renamed from: com.bugsnag.android.g0$b */
    static final class b extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f38719a = new b();

        b() {
            super(0);
        }

        /* renamed from: a */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* renamed from: com.bugsnag.android.g0$c */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final String f38720a;

        /* renamed from: b  reason: collision with root package name */
        private final String f38721b;

        public c(String str, String str2) {
            this.f38720a = str;
            this.f38721b = str2;
        }

        public final String a() {
            return this.f38720a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C6496s.c(this.f38720a, cVar.f38720a) && C6496s.c(this.f38721b, cVar.f38721b);
        }

        public int hashCode() {
            String str = this.f38720a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f38721b;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            return "DeviceIds(deviceId=" + this.f38720a + ", internalDeviceId=" + this.f38721b + ')';
        }
    }

    public C3238g0(Context context, File file, C6787a aVar, File file2, C6787a aVar2, d dVar, k kVar, S0 s02) {
        this.f38708a = file;
        this.f38709b = aVar;
        this.f38710c = file2;
        this.f38711d = aVar2;
        this.f38712e = dVar;
        this.f38713f = s02;
        this.f38716i = kVar.p();
    }

    private final String b() {
        C3235f0 f0Var = null;
        if (!this.f38716i) {
            return null;
        }
        C3235f0 f0Var2 = this.f38714g;
        if (f0Var2 == null) {
            C6496s.v("persistence");
            f0Var2 = null;
        }
        String a10 = f0Var2.a(false);
        if (a10 != null) {
            return a10;
        }
        String a11 = ((r1) this.f38712e.get()).a(false);
        if (a11 != null) {
            return a11;
        }
        C3235f0 f0Var3 = this.f38714g;
        if (f0Var3 == null) {
            C6496s.v("persistence");
        } else {
            f0Var = f0Var3;
        }
        return f0Var.a(true);
    }

    private final String c() {
        C3235f0 f0Var = null;
        if (!this.f38716i) {
            return null;
        }
        C3235f0 f0Var2 = this.f38715h;
        if (f0Var2 == null) {
            C6496s.v("internalPersistence");
        } else {
            f0Var = f0Var2;
        }
        return f0Var.a(true);
    }

    public final c a() {
        c cVar = this.f38717j;
        if (cVar != null) {
            return cVar;
        }
        this.f38714g = new C3232e0(this.f38708a, this.f38709b, this.f38713f);
        this.f38715h = new C3232e0(this.f38710c, this.f38711d, this.f38713f);
        String b10 = b();
        String c10 = c();
        if (!(b10 == null && c10 == null)) {
            this.f38717j = new c(b10, c10);
        }
        return this.f38717j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3238g0(Context context, File file, C6787a aVar, File file2, C6787a aVar2, d dVar, k kVar, S0 s02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? new File(context.getFilesDir(), "device-id") : file, (i10 & 4) != 0 ? a.f38718a : aVar, (i10 & 8) != 0 ? new File(context.getFilesDir(), "internal-device-id") : file2, (i10 & 16) != 0 ? b.f38719a : aVar2, dVar, kVar, s02);
    }
}
