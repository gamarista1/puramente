package Y;

import androidx.collection.B;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qf.g;

/* renamed from: Y.u  reason: case insensitive filesystem */
public abstract class C1515u {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Object f10179a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final C f10180b = new a();

    /* renamed from: Y.u$a */
    public static final class a implements C {
        a() {
        }
    }

    public static final C1508q a(C1483f fVar, r rVar) {
        return new C1513t(rVar, fVar, (g) null, 4, (DefaultConstructorMarker) null);
    }

    public static final V0 b(C1483f fVar, r rVar) {
        return new C1513t(rVar, fVar, (g) null, 4, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public static final void f(B b10, int i10, int i11) {
        int a10 = b10.a(i10);
        b10.m(i10, b10.a(i11));
        b10.m(i11, a10);
    }

    /* access modifiers changed from: private */
    public static final void g(List list, int i10, int i11) {
        Object obj = list.get(i10);
        list.set(i10, list.get(i11));
        list.set(i11, obj);
    }
}
