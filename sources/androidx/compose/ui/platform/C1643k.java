package androidx.compose.ui.platform;

import Q0.C1321d;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;

/* renamed from: androidx.compose.ui.platform.k  reason: case insensitive filesystem */
public final class C1643k implements C1638i0 {

    /* renamed from: a  reason: collision with root package name */
    private final ClipboardManager f13764a;

    public C1643k(ClipboardManager clipboardManager) {
        this.f13764a = clipboardManager;
    }

    public void a(C1321d dVar) {
        this.f13764a.setPrimaryClip(ClipData.newPlainText("plain text", C1646l.b(dVar)));
    }

    public C1321d b() {
        ClipData primaryClip = this.f13764a.getPrimaryClip();
        CharSequence charSequence = null;
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        if (itemAt != null) {
            charSequence = itemAt.getText();
        }
        return C1646l.a(charSequence);
    }

    public boolean c() {
        ClipDescription primaryClipDescription = this.f13764a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1643k(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "clipboard"
            java.lang.Object r2 = r2.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.content.ClipboardManager"
            kotlin.jvm.internal.C6496s.f(r2, r0)
            android.content.ClipboardManager r2 = (android.content.ClipboardManager) r2
            r1.<init>((android.content.ClipboardManager) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C1643k.<init>(android.content.Context):void");
    }
}
