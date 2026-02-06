package androidx.compose.ui.platform;

import io.intercom.android.sdk.models.AttributeType;
import kotlin.jvm.internal.C6496s;

/* renamed from: androidx.compose.ui.platform.b  reason: case insensitive filesystem */
public abstract class C1616b implements C1631g {

    /* renamed from: a  reason: collision with root package name */
    protected String f13687a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f13688b = new int[2];

    /* access modifiers changed from: protected */
    public final int[] c(int i10, int i11) {
        if (i10 < 0 || i11 < 0 || i10 == i11) {
            return null;
        }
        int[] iArr = this.f13688b;
        iArr[0] = i10;
        iArr[1] = i11;
        return iArr;
    }

    /* access modifiers changed from: protected */
    public final String d() {
        String str = this.f13687a;
        if (str != null) {
            return str;
        }
        C6496s.v(AttributeType.TEXT);
        return null;
    }

    public void e(String str) {
        f(str);
    }

    /* access modifiers changed from: protected */
    public final void f(String str) {
        this.f13687a = str;
    }
}
