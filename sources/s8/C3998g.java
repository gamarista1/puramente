package s8;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.n0;
import com.facebook.react.views.view.h;
import kotlin.jvm.internal.C6496s;

/* renamed from: s8.g  reason: case insensitive filesystem */
public final class C3998g extends ClickableSpan implements j {

    /* renamed from: a  reason: collision with root package name */
    private final int f48096a;

    public C3998g(int i10) {
        this.f48096a = i10;
    }

    public void onClick(View view) {
        C6496s.h(view, "view");
        Context context = view.getContext();
        C6496s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        EventDispatcher c10 = n0.c(reactContext, this.f48096a);
        if (c10 != null) {
            c10.h(new h(n0.e(reactContext), this.f48096a));
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        C6496s.h(textPaint, "ds");
    }
}
