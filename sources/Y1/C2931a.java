package y1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: y1.a  reason: case insensitive filesystem */
public final class C2931a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    private final int f28629a;

    /* renamed from: b  reason: collision with root package name */
    private final C2930A f28630b;

    /* renamed from: c  reason: collision with root package name */
    private final int f28631c;

    public C2931a(int i10, C2930A a10, int i11) {
        this.f28629a = i10;
        this.f28630b = a10;
        this.f28631c = i11;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f28629a);
        this.f28630b.i0(this.f28631c, bundle);
    }
}
