package Mg;

import io.branch.rnbranch.RNBranchModule;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f64145a;

    public static final class a extends g {

        /* renamed from: b  reason: collision with root package name */
        public static final a f64146b = new a();

        private a() {
            super(false, (DefaultConstructorMarker) null);
        }
    }

    public static final class b extends g {

        /* renamed from: b  reason: collision with root package name */
        private final String f64147b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(false, (DefaultConstructorMarker) null);
            C6496s.h(str, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
            this.f64147b = str;
        }
    }

    public static final class c extends g {

        /* renamed from: b  reason: collision with root package name */
        public static final c f64148b = new c();

        private c() {
            super(true, (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ g(boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10);
    }

    public final boolean a() {
        return this.f64145a;
    }

    private g(boolean z10) {
        this.f64145a = z10;
    }
}
