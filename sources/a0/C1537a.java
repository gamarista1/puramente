package a0;

import android.util.SparseArray;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: a0.a  reason: case insensitive filesystem */
public final class C1537a {

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray f10553a;

    private C1537a(SparseArray sparseArray) {
        this.f10553a = sparseArray;
    }

    public final Object a(int i10) {
        return this.f10553a.get(i10);
    }

    public final void b(int i10, Object obj) {
        this.f10553a.put(i10, obj);
    }

    public C1537a(int i10) {
        this(new SparseArray(i10));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1537a(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
