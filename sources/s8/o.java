package s8;

import android.text.SpannableStringBuilder;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class o {

    /* renamed from: d  reason: collision with root package name */
    public static final a f48100d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f48101a;

    /* renamed from: b  reason: collision with root package name */
    private final int f48102b;

    /* renamed from: c  reason: collision with root package name */
    public final j f48103c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public o(int i10, int i11, j jVar) {
        C6496s.h(jVar, "what");
        this.f48101a = i10;
        this.f48102b = i11;
        this.f48103c = jVar;
    }

    public final void a(SpannableStringBuilder spannableStringBuilder, int i10) {
        int i11;
        C6496s.h(spannableStringBuilder, "builder");
        if (i10 >= 0) {
            if (this.f48101a == 0) {
                i11 = 18;
            } else {
                i11 = 34;
            }
            int i12 = 255 - i10;
            if (i12 < 0) {
                U5.a.I("SetSpanOperation", "Text tree size exceeded the limit, styling may become unpredictable");
            }
            spannableStringBuilder.setSpan(this.f48103c, this.f48101a, this.f48102b, ((Math.max(i12, 0) << 16) & 16711680) | (i11 & -16711681));
            return;
        }
        throw new IllegalStateException("Check failed.");
    }
}
