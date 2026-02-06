package S0;

import R0.C1346c;
import android.text.SegmentFinder;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f5822a = new a();

    /* renamed from: S0.a$a  reason: collision with other inner class name */
    public static final class C0140a extends SegmentFinder {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f5823a;

        C0140a(f fVar) {
            this.f5823a = fVar;
        }

        public int nextEndBoundary(int i10) {
            return this.f5823a.c(i10);
        }

        public int nextStartBoundary(int i10) {
            return this.f5823a.a(i10);
        }

        public int previousEndBoundary(int i10) {
            return this.f5823a.d(i10);
        }

        public int previousStartBoundary(int i10) {
            return this.f5823a.b(i10);
        }
    }

    private a() {
    }

    public final SegmentFinder a(f fVar) {
        return C1346c.a(new C0140a(fVar));
    }
}
