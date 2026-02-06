package androidx.activity;

import android.content.res.Resources;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6798l;

public final class M {

    /* renamed from: e  reason: collision with root package name */
    public static final a f10777e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f10778a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10779b;

    /* renamed from: c  reason: collision with root package name */
    private final int f10780c;

    /* renamed from: d  reason: collision with root package name */
    private final C6798l f10781d;

    public static final class a {

        /* renamed from: androidx.activity.M$a$a  reason: collision with other inner class name */
        static final class C0207a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final C0207a f10782a = new C0207a();

            C0207a() {
                super(1);
            }

            /* renamed from: a */
            public final Boolean invoke(Resources resources) {
                boolean z10;
                C6496s.h(resources, "resources");
                if ((resources.getConfiguration().uiMode & 48) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ M b(a aVar, int i10, int i11, C6798l lVar, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                lVar = C0207a.f10782a;
            }
            return aVar.a(i10, i11, lVar);
        }

        public final M a(int i10, int i11, C6798l lVar) {
            C6496s.h(lVar, "detectDarkMode");
            return new M(i10, i11, 0, lVar, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ M(int i10, int i11, int i12, C6798l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, lVar);
    }

    public final int a() {
        return this.f10779b;
    }

    public final C6798l b() {
        return this.f10781d;
    }

    public final int c() {
        return this.f10780c;
    }

    public final int d(boolean z10) {
        if (z10) {
            return this.f10779b;
        }
        return this.f10778a;
    }

    public final int e(boolean z10) {
        if (this.f10780c == 0) {
            return 0;
        }
        if (z10) {
            return this.f10779b;
        }
        return this.f10778a;
    }

    private M(int i10, int i11, int i12, C6798l lVar) {
        this.f10778a = i10;
        this.f10779b = i11;
        this.f10780c = i12;
        this.f10781d = lVar;
    }
}
