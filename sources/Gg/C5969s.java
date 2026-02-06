package gg;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wg.C6769e;

/* renamed from: gg.s  reason: case insensitive filesystem */
public abstract class C5969s {

    /* renamed from: a  reason: collision with root package name */
    public static final b f67811a = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final d f67812b = new d(C6769e.BOOLEAN);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final d f67813c = new d(C6769e.CHAR);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final d f67814d = new d(C6769e.BYTE);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final d f67815e = new d(C6769e.SHORT);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final d f67816f = new d(C6769e.INT);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final d f67817g = new d(C6769e.FLOAT);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final d f67818h = new d(C6769e.LONG);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final d f67819i = new d(C6769e.DOUBLE);

    /* renamed from: gg.s$a */
    public static final class a extends C5969s {

        /* renamed from: j  reason: collision with root package name */
        private final C5969s f67820j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C5969s sVar) {
            super((DefaultConstructorMarker) null);
            C6496s.h(sVar, "elementType");
            this.f67820j = sVar;
        }

        public final C5969s i() {
            return this.f67820j;
        }
    }

    /* renamed from: gg.s$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            return C5969s.f67812b;
        }

        public final d b() {
            return C5969s.f67814d;
        }

        public final d c() {
            return C5969s.f67813c;
        }

        public final d d() {
            return C5969s.f67819i;
        }

        public final d e() {
            return C5969s.f67817g;
        }

        public final d f() {
            return C5969s.f67816f;
        }

        public final d g() {
            return C5969s.f67818h;
        }

        public final d h() {
            return C5969s.f67815e;
        }

        private b() {
        }
    }

    /* renamed from: gg.s$c */
    public static final class c extends C5969s {

        /* renamed from: j  reason: collision with root package name */
        private final String f67821j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super((DefaultConstructorMarker) null);
            C6496s.h(str, "internalName");
            this.f67821j = str;
        }

        public final String i() {
            return this.f67821j;
        }
    }

    /* renamed from: gg.s$d */
    public static final class d extends C5969s {

        /* renamed from: j  reason: collision with root package name */
        private final C6769e f67822j;

        public d(C6769e eVar) {
            super((DefaultConstructorMarker) null);
            this.f67822j = eVar;
        }

        public final C6769e i() {
            return this.f67822j;
        }
    }

    public /* synthetic */ C5969s(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public String toString() {
        return C5971u.f67823a.d(this);
    }

    private C5969s() {
    }
}
