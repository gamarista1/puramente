package m9;

import android.media.AudioAttributes;
import android.os.Bundle;
import ja.M;
import k9.C3700i;

/* renamed from: m9.e  reason: case insensitive filesystem */
public final class C3847e implements C3700i {

    /* renamed from: g  reason: collision with root package name */
    public static final C3847e f46631g = new C0699e().a();

    /* renamed from: h  reason: collision with root package name */
    public static final C3700i.a f46632h = new C3846d();

    /* renamed from: a  reason: collision with root package name */
    public final int f46633a;

    /* renamed from: b  reason: collision with root package name */
    public final int f46634b;

    /* renamed from: c  reason: collision with root package name */
    public final int f46635c;

    /* renamed from: d  reason: collision with root package name */
    public final int f46636d;

    /* renamed from: e  reason: collision with root package name */
    public final int f46637e;

    /* renamed from: f  reason: collision with root package name */
    private d f46638f;

    /* renamed from: m9.e$b */
    private static final class b {
        public static void a(AudioAttributes.Builder builder, int i10) {
            AudioAttributes.Builder unused = builder.setAllowedCapturePolicy(i10);
        }
    }

    /* renamed from: m9.e$c */
    private static final class c {
        public static void a(AudioAttributes.Builder builder, int i10) {
            AudioAttributes.Builder unused = builder.setSpatializationBehavior(i10);
        }
    }

    /* renamed from: m9.e$d */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final AudioAttributes f46639a;

        private d(C3847e eVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(eVar.f46633a).setFlags(eVar.f46634b).setUsage(eVar.f46635c);
            int i10 = M.f44981a;
            if (i10 >= 29) {
                b.a(usage, eVar.f46636d);
            }
            if (i10 >= 32) {
                c.a(usage, eVar.f46637e);
            }
            this.f46639a = usage.build();
        }
    }

    /* renamed from: m9.e$e  reason: collision with other inner class name */
    public static final class C0699e {

        /* renamed from: a  reason: collision with root package name */
        private int f46640a = 0;

        /* renamed from: b  reason: collision with root package name */
        private int f46641b = 0;

        /* renamed from: c  reason: collision with root package name */
        private int f46642c = 1;

        /* renamed from: d  reason: collision with root package name */
        private int f46643d = 1;

        /* renamed from: e  reason: collision with root package name */
        private int f46644e = 0;

        public C3847e a() {
            return new C3847e(this.f46640a, this.f46641b, this.f46642c, this.f46643d, this.f46644e);
        }

        public C0699e b(int i10) {
            this.f46643d = i10;
            return this;
        }

        public C0699e c(int i10) {
            this.f46640a = i10;
            return this;
        }

        public C0699e d(int i10) {
            this.f46641b = i10;
            return this;
        }

        public C0699e e(int i10) {
            this.f46644e = i10;
            return this;
        }

        public C0699e f(int i10) {
            this.f46642c = i10;
            return this;
        }
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C3847e d(Bundle bundle) {
        C0699e eVar = new C0699e();
        if (bundle.containsKey(c(0))) {
            eVar.c(bundle.getInt(c(0)));
        }
        if (bundle.containsKey(c(1))) {
            eVar.d(bundle.getInt(c(1)));
        }
        if (bundle.containsKey(c(2))) {
            eVar.f(bundle.getInt(c(2)));
        }
        if (bundle.containsKey(c(3))) {
            eVar.b(bundle.getInt(c(3)));
        }
        if (bundle.containsKey(c(4))) {
            eVar.e(bundle.getInt(c(4)));
        }
        return eVar.a();
    }

    public d b() {
        if (this.f46638f == null) {
            this.f46638f = new d();
        }
        return this.f46638f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3847e.class != obj.getClass()) {
            return false;
        }
        C3847e eVar = (C3847e) obj;
        if (this.f46633a == eVar.f46633a && this.f46634b == eVar.f46634b && this.f46635c == eVar.f46635c && this.f46636d == eVar.f46636d && this.f46637e == eVar.f46637e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f46633a) * 31) + this.f46634b) * 31) + this.f46635c) * 31) + this.f46636d) * 31) + this.f46637e;
    }

    private C3847e(int i10, int i11, int i12, int i13, int i14) {
        this.f46633a = i10;
        this.f46634b = i11;
        this.f46635c = i12;
        this.f46636d = i13;
        this.f46637e = i14;
    }
}
