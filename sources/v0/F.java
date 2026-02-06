package V0;

import Y.A1;
import kotlin.jvm.internal.DefaultConstructorMarker;

public interface F extends A1 {
    boolean e();

    public static final class a implements F {

        /* renamed from: a  reason: collision with root package name */
        private final Object f8167a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f8168b;

        public a(Object obj, boolean z10) {
            this.f8167a = obj;
            this.f8168b = z10;
        }

        public boolean e() {
            return this.f8168b;
        }

        public Object getValue() {
            return this.f8167a;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(Object obj, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i10 & 2) != 0 ? true : z10);
        }
    }
}
