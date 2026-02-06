package B4;

import java.util.List;
import x4.C4155a;
import x4.n;

public class i implements o {

    /* renamed from: a  reason: collision with root package name */
    private final b f29793a;

    /* renamed from: b  reason: collision with root package name */
    private final b f29794b;

    public i(b bVar, b bVar2) {
        this.f29793a = bVar;
        this.f29794b = bVar2;
    }

    public boolean g() {
        if (!this.f29793a.g() || !this.f29794b.g()) {
            return false;
        }
        return true;
    }

    public C4155a h() {
        return new n(this.f29793a.h(), this.f29794b.h());
    }

    public List i() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}
