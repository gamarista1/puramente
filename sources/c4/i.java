package C4;

import B4.d;
import B4.h;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private final a f29945a;

    /* renamed from: b  reason: collision with root package name */
    private final h f29946b;

    /* renamed from: c  reason: collision with root package name */
    private final d f29947c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f29948d;

    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public i(a aVar, h hVar, d dVar, boolean z10) {
        this.f29945a = aVar;
        this.f29946b = hVar;
        this.f29947c = dVar;
        this.f29948d = z10;
    }

    public a a() {
        return this.f29945a;
    }

    public h b() {
        return this.f29946b;
    }

    public d c() {
        return this.f29947c;
    }

    public boolean d() {
        return this.f29948d;
    }
}
