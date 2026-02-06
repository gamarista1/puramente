package s0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: s0.a  reason: case insensitive filesystem */
public abstract class C2579a {

    /* renamed from: b  reason: collision with root package name */
    public static final d f25780b = new d((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final C2579a f25781c = new C0432a(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});

    /* renamed from: d  reason: collision with root package name */
    private static final C2579a f25782d = new c(new float[]{0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f});

    /* renamed from: e  reason: collision with root package name */
    private static final C2579a f25783e = new b(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f});

    /* renamed from: a  reason: collision with root package name */
    private final float[] f25784a;

    /* renamed from: s0.a$a  reason: collision with other inner class name */
    public static final class C0432a extends C2579a {
        C0432a(float[] fArr) {
            super(fArr, (DefaultConstructorMarker) null);
        }

        public String toString() {
            return "Bradford";
        }
    }

    /* renamed from: s0.a$b */
    public static final class b extends C2579a {
        b(float[] fArr) {
            super(fArr, (DefaultConstructorMarker) null);
        }

        public String toString() {
            return "Ciecat02";
        }
    }

    /* renamed from: s0.a$c */
    public static final class c extends C2579a {
        c(float[] fArr) {
            super(fArr, (DefaultConstructorMarker) null);
        }

        public String toString() {
            return "VonKries";
        }
    }

    /* renamed from: s0.a$d */
    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2579a a() {
            return C2579a.f25781c;
        }

        private d() {
        }
    }

    public /* synthetic */ C2579a(float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }

    public final float[] b() {
        return this.f25784a;
    }

    private C2579a(float[] fArr) {
        this.f25784a = fArr;
    }
}
