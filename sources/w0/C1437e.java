package W0;

import D0.P;
import Q0.L;
import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import q0.C2423i;
import r0.C2466S;
import r0.M1;
import yf.C6798l;

/* renamed from: W0.e  reason: case insensitive filesystem */
public final class C1437e {

    /* renamed from: a  reason: collision with root package name */
    private final P f8554a;

    /* renamed from: b  reason: collision with root package name */
    private final C1452u f8555b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f8556c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f8557d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f8558e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f8559f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f8560g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f8561h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f8562i;

    /* renamed from: j  reason: collision with root package name */
    private Q f8563j;

    /* renamed from: k  reason: collision with root package name */
    private L f8564k;

    /* renamed from: l  reason: collision with root package name */
    private I f8565l;

    /* renamed from: m  reason: collision with root package name */
    private C6798l f8566m = b.f8573a;

    /* renamed from: n  reason: collision with root package name */
    private C2423i f8567n;

    /* renamed from: o  reason: collision with root package name */
    private C2423i f8568o;

    /* renamed from: p  reason: collision with root package name */
    private final CursorAnchorInfo.Builder f8569p = new CursorAnchorInfo.Builder();

    /* renamed from: q  reason: collision with root package name */
    private final float[] f8570q = M1.c((float[]) null, 1, (DefaultConstructorMarker) null);

    /* renamed from: r  reason: collision with root package name */
    private final Matrix f8571r = new Matrix();

    public C1437e(P p10, C1452u uVar) {
        this.f8554a = p10;
        this.f8555b = uVar;
    }

    private final void c() {
        if (this.f8555b.a()) {
            this.f8566m.invoke(M1.a(this.f8570q));
            this.f8554a.p(this.f8570q);
            C2466S.a(this.f8571r, this.f8570q);
            C1452u uVar = this.f8555b;
            CursorAnchorInfo.Builder builder = this.f8569p;
            Q q10 = this.f8563j;
            C6496s.e(q10);
            I i10 = this.f8565l;
            C6496s.e(i10);
            L l10 = this.f8564k;
            C6496s.e(l10);
            Matrix matrix = this.f8571r;
            C2423i iVar = this.f8567n;
            C6496s.e(iVar);
            C2423i iVar2 = this.f8568o;
            C6496s.e(iVar2);
            uVar.e(C1436d.b(builder, q10, i10, l10, matrix, iVar, iVar2, this.f8559f, this.f8560g, this.f8561h, this.f8562i));
            this.f8558e = false;
        }
    }

    public final void a() {
        synchronized (this.f8556c) {
            this.f8563j = null;
            this.f8565l = null;
            this.f8564k = null;
            this.f8566m = a.f8572a;
            this.f8567n = null;
            this.f8568o = null;
            C6514M m10 = C6514M.f71813a;
        }
    }

    public final void b(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        synchronized (this.f8556c) {
            try {
                this.f8559f = z12;
                this.f8560g = z13;
                this.f8561h = z14;
                this.f8562i = z15;
                if (z10) {
                    this.f8558e = true;
                    if (this.f8563j != null) {
                        c();
                    }
                }
                this.f8557d = z11;
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(Q q10, I i10, L l10, C6798l lVar, C2423i iVar, C2423i iVar2) {
        synchronized (this.f8556c) {
            try {
                this.f8563j = q10;
                this.f8565l = i10;
                this.f8564k = l10;
                this.f8566m = lVar;
                this.f8567n = iVar;
                this.f8568o = iVar2;
                if (!this.f8558e) {
                    if (this.f8557d) {
                    }
                    C6514M m10 = C6514M.f71813a;
                }
                c();
                C6514M m102 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: W0.e$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f8572a = new a();

        a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((M1) obj).r());
            return C6514M.f71813a;
        }

        public final void a(float[] fArr) {
        }
    }

    /* renamed from: W0.e$b */
    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f8573a = new b();

        b() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((M1) obj).r());
            return C6514M.f71813a;
        }

        public final void a(float[] fArr) {
        }
    }
}
