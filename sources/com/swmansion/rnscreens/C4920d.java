package com.swmansion.rnscreens;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.widget.Toolbar;
import com.facebook.react.modules.core.b;
import com.facebook.react.uimanager.C3415h0;
import kotlin.jvm.internal.C6496s;

/* renamed from: com.swmansion.rnscreens.d  reason: case insensitive filesystem */
public class C4920d extends Toolbar {

    /* renamed from: a  reason: collision with root package name */
    private final H f59782a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public boolean f59783b;

    /* renamed from: c  reason: collision with root package name */
    private final U7.a f59784c = new a(this);

    /* renamed from: com.swmansion.rnscreens.d$a */
    public static final class a extends U7.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4920d f59785a;

        a(C4920d dVar) {
            this.f59785a = dVar;
        }

        public void doFrame(long j10) {
            this.f59785a.f59783b = false;
            C4920d dVar = this.f59785a;
            dVar.measure(View.MeasureSpec.makeMeasureSpec(dVar.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.f59785a.getHeight(), Integer.MIN_VALUE));
            C4920d dVar2 = this.f59785a;
            dVar2.layout(dVar2.getLeft(), this.f59785a.getTop(), this.f59785a.getRight(), this.f59785a.getBottom());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4920d(Context context, H h10) {
        super(context);
        C6496s.h(context, "context");
        C6496s.h(h10, "config");
        this.f59782a = h10;
    }

    public final H getConfig() {
        return this.f59782a;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        if (getNavigationIcon() != null) {
            i14 = getContentInsetStartWithNavigation();
        } else {
            i14 = getContentInsetStart();
        }
        this.f59782a.a(i14, getContentInsetEnd());
    }

    public void requestLayout() {
        Integer num;
        Window window;
        WindowManager.LayoutParams attributes;
        super.requestLayout();
        Context context = getContext();
        C6496s.f(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        Activity currentActivity = ((C3415h0) context).getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
            num = null;
        } else {
            num = Integer.valueOf(attributes.softInputMode);
        }
        if (Build.VERSION.SDK_INT <= 29 && num != null && num.intValue() == 32 && !this.f59783b && this.f59784c != null) {
            this.f59783b = true;
            b.f40995f.a().k(b.a.NATIVE_ANIMATED_MODULE, this.f59784c);
        }
    }
}
