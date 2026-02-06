package U;

import Ef.m;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2544x0;
import r0.C2550z0;

final class v extends RippleDrawable {

    /* renamed from: e  reason: collision with root package name */
    public static final a f6314e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f6315a;

    /* renamed from: b  reason: collision with root package name */
    private C2544x0 f6316b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f6317c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6318d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f6319a = new b();

        private b() {
        }

        public final void a(RippleDrawable rippleDrawable, int i10) {
            rippleDrawable.setRadius(i10);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public v(boolean r5) {
        /*
            r4 = this;
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1 = 0
            if (r5 == 0) goto L_0x0010
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r3 = -1
            r2.<init>(r3)
            goto L_0x0011
        L_0x0010:
            r2 = r1
        L_0x0011:
            r4.<init>(r0, r1, r2)
            r4.f6315a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U.v.<init>(boolean):void");
    }

    private final long a(long j10, float f10) {
        if (Build.VERSION.SDK_INT < 28) {
            f10 *= (float) 2;
        }
        return C2544x0.o(j10, m.g(f10, 1.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null);
    }

    public final void b(long j10, float f10) {
        boolean z10;
        long a10 = a(j10, f10);
        C2544x0 x0Var = this.f6316b;
        if (x0Var == null) {
            z10 = false;
        } else {
            z10 = C2544x0.q(x0Var.y(), a10);
        }
        if (!z10) {
            this.f6316b = C2544x0.k(a10);
            setColor(ColorStateList.valueOf(C2550z0.k(a10)));
        }
    }

    public final void c(int i10) {
        Integer num = this.f6317c;
        if (num == null || num.intValue() != i10) {
            this.f6317c = Integer.valueOf(i10);
            b.f6319a.a(this, i10);
        }
    }

    public Rect getDirtyBounds() {
        if (!this.f6315a) {
            this.f6318d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f6318d = false;
        return dirtyBounds;
    }

    public boolean isProjected() {
        return this.f6318d;
    }
}
