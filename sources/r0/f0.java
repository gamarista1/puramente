package R0;

import android.text.StaticLayout;

final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public static final f0 f5531a = new f0();

    private f0() {
    }

    public static final boolean a(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static final void b(StaticLayout.Builder builder, int i10, int i11) {
        StaticLayout.Builder unused = builder.setLineBreakConfig(e0.a().setLineBreakStyle(i10).setLineBreakWordStyle(i11).build());
    }
}
