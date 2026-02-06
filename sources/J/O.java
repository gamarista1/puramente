package J;

import B0.b;
import B0.c;
import B0.d;
import B0.f;
import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.ui.platform.C1651m1;
import k0.i;
import kotlin.jvm.internal.C6498u;
import p0.e;
import yf.C6798l;

public abstract class O {

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f2901a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1228y f2902b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, C1228y yVar) {
            super(1);
            this.f2901a = eVar;
            this.f2902b = yVar;
        }

        public final Boolean a(KeyEvent keyEvent) {
            InputDevice device = keyEvent.getDevice();
            boolean z10 = false;
            if (device != null && device.supportsSource(513) && !device.isVirtual() && c.e(d.b(keyEvent), c.f765a.a()) && keyEvent.getSource() != 257) {
                if (O.c(keyEvent, 19)) {
                    z10 = this.f2901a.e(androidx.compose.ui.focus.d.f13315b.h());
                } else if (O.c(keyEvent, 20)) {
                    z10 = this.f2901a.e(androidx.compose.ui.focus.d.f13315b.a());
                } else if (O.c(keyEvent, 21)) {
                    z10 = this.f2901a.e(androidx.compose.ui.focus.d.f13315b.d());
                } else if (O.c(keyEvent, 22)) {
                    z10 = this.f2901a.e(androidx.compose.ui.focus.d.f13315b.g());
                } else if (O.c(keyEvent, 23)) {
                    C1651m1 h10 = this.f2902b.h();
                    if (h10 != null) {
                        h10.b();
                    }
                    z10 = true;
                }
            }
            return Boolean.valueOf(z10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((b) obj).f());
        }
    }

    public static final i b(i iVar, C1228y yVar, e eVar) {
        return androidx.compose.ui.input.key.a.b(iVar, new a(eVar, yVar));
    }

    /* access modifiers changed from: private */
    public static final boolean c(KeyEvent keyEvent, int i10) {
        if (f.b(d.a(keyEvent)) == i10) {
            return true;
        }
        return false;
    }
}
