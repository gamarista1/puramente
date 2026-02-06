package Y;

import kotlin.jvm.internal.C6496s;

/* renamed from: Y.a1  reason: case insensitive filesystem */
public final class C1470a1 {

    /* renamed from: a  reason: collision with root package name */
    private final C1500m f9928a;

    private /* synthetic */ C1470a1(C1500m mVar) {
        this.f9928a = mVar;
    }

    public static final /* synthetic */ C1470a1 a(C1500m mVar) {
        return new C1470a1(mVar);
    }

    public static boolean c(C1500m mVar, Object obj) {
        if ((obj instanceof C1470a1) && C6496s.c(mVar, ((C1470a1) obj).f())) {
            return true;
        }
        return false;
    }

    public static int d(C1500m mVar) {
        return mVar.hashCode();
    }

    public static String e(C1500m mVar) {
        return "SkippableUpdater(composer=" + mVar + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f9928a, obj);
    }

    public final /* synthetic */ C1500m f() {
        return this.f9928a;
    }

    public int hashCode() {
        return d(this.f9928a);
    }

    public String toString() {
        return e(this.f9928a);
    }

    public static C1500m b(C1500m mVar) {
        return mVar;
    }
}
