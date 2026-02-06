package V6;

import java.util.LinkedHashSet;

/* renamed from: V6.d  reason: case insensitive filesystem */
public final class C3077d {

    /* renamed from: a  reason: collision with root package name */
    private final int f34686a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkedHashSet f34687b;

    public C3077d(int i10) {
        this.f34686a = i10;
        this.f34687b = new LinkedHashSet(i10);
    }

    public final synchronized boolean a(Object obj) {
        try {
            if (this.f34687b.size() == this.f34686a) {
                LinkedHashSet linkedHashSet = this.f34687b;
                linkedHashSet.remove(linkedHashSet.iterator().next());
            }
            this.f34687b.remove(obj);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f34687b.add(obj);
    }

    public final synchronized boolean b(Object obj) {
        return this.f34687b.contains(obj);
    }
}
