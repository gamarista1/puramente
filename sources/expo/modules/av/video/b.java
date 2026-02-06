package expo.modules.av.video;

import ae.C4464a;
import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.support.v4.media.session.c;
import android.view.Window;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

public class b extends Dialog {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Handler f60306a = new Handler();

    /* renamed from: b  reason: collision with root package name */
    private Runnable f60307b = new a(this);

    /* renamed from: c  reason: collision with root package name */
    private FrameLayout f60308c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public WeakReference f60309d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final g f60310e;

    /* renamed from: f  reason: collision with root package name */
    private final FrameLayout f60311f;

    /* renamed from: g  reason: collision with root package name */
    private WeakReference f60312g;

    private static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference f60313a;

        a(b bVar) {
            this.f60313a = new WeakReference(bVar);
        }

        public void run() {
            boolean z10;
            Md.b bVar;
            b bVar2 = (b) this.f60313a.get();
            if (bVar2 != null) {
                Window window = bVar2.getWindow();
                if (window != null) {
                    if (!bVar2.f60310e.getStatus().containsKey("isPlaying") || !bVar2.f60310e.getStatus().getBoolean("isPlaying")) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    C4464a aVar = (C4464a) bVar2.f60309d.get();
                    if (aVar != null) {
                        bVar = aVar.p();
                    } else {
                        bVar = null;
                    }
                    if (bVar != null) {
                        c.a(bVar.b(Qd.b.class));
                        if (!z10) {
                            window.addFlags(128);
                        } else {
                            window.addFlags(128);
                        }
                    }
                }
                bVar2.f60306a.postDelayed(this, 200);
            }
        }
    }

    b(Context context, g gVar, C4464a aVar) {
        super(context, 16973834);
        this.f60309d = new WeakReference(aVar);
        setCancelable(false);
        this.f60310e = gVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f60311f = frameLayout;
        setContentView(frameLayout, d());
    }

    private FrameLayout.LayoutParams d() {
        return new FrameLayout.LayoutParams(-1, -1);
    }

    public void dismiss() {
        this.f60310e.setOverridingUseNativeControls((Boolean) null);
        c cVar = (c) this.f60312g.get();
        if (cVar != null) {
            cVar.c();
        }
        super.dismiss();
    }

    /* access modifiers changed from: package-private */
    public void e(c cVar) {
        this.f60312g = new WeakReference(cVar);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c cVar = (c) this.f60312g.get();
        if (cVar != null) {
            cVar.a();
        }
        this.f60310e.setOverridingUseNativeControls(Boolean.TRUE);
        this.f60306a.post(this.f60307b);
    }

    public void onBackPressed() {
        super.onBackPressed();
        if (isShowing()) {
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        FrameLayout frameLayout = (FrameLayout) this.f60310e.getParent();
        this.f60308c = frameLayout;
        frameLayout.removeView(this.f60310e);
        this.f60311f.addView(this.f60310e, d());
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        this.f60306a.removeCallbacks(this.f60307b);
        this.f60311f.removeView(this.f60310e);
        this.f60308c.addView(this.f60310e, d());
        this.f60308c.requestLayout();
        this.f60308c = null;
        super.onStop();
        c cVar = (c) this.f60312g.get();
        if (cVar != null) {
            cVar.b();
        }
    }

    public void show() {
        c cVar = (c) this.f60312g.get();
        if (cVar != null) {
            cVar.d();
        }
        super.show();
    }
}
