package m3;

import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6550c;

/* renamed from: m3.q  reason: case insensitive filesystem */
public final class C2218q extends C6550c {

    /* renamed from: b  reason: collision with root package name */
    private final int f24091b;

    /* renamed from: c  reason: collision with root package name */
    private final int f24092c;

    /* renamed from: d  reason: collision with root package name */
    private final List f24093d;

    public C2218q(int i10, int i11, List list) {
        C6496s.h(list, "items");
        this.f24091b = i10;
        this.f24092c = i11;
        this.f24093d = list;
    }

    public int a() {
        return this.f24091b + this.f24093d.size() + this.f24092c;
    }

    public Object get(int i10) {
        if (i10 >= 0 && i10 < this.f24091b) {
            return null;
        }
        int i11 = this.f24091b;
        if (i10 < this.f24093d.size() + i11 && i11 <= i10) {
            return this.f24093d.get(i10 - this.f24091b);
        }
        int size = this.f24091b + this.f24093d.size();
        if (i10 < size() && size <= i10) {
            return null;
        }
        throw new IndexOutOfBoundsException("Illegal attempt to access index " + i10 + " in ItemSnapshotList of size " + size());
    }
}
