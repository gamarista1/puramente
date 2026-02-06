package xd;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.uimanager.H;
import com.facebook.react.uimanager.N;
import com.facebook.react.uimanager.Q;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import zd.C5314a;

public final class e extends ViewGroup implements N, Q {

    /* renamed from: a  reason: collision with root package name */
    public static final a f62253a = new a((DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(Context context, float f10) {
        super(context);
        C6496s.h(context, "context");
        setBackgroundColor(-16777216);
        setAlpha(f10);
    }

    private final boolean getBlockGestures() {
        return !C5314a.b(getAlpha(), 0.0f, 0.0f, 2, (Object) null);
    }

    public H getPointerEvents() {
        if (getBlockGestures()) {
            return H.AUTO;
        }
        return H.NONE;
    }

    public boolean interceptsTouchEvent(float f10, float f11) {
        return getBlockGestures();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getBlockGestures()) {
            callOnClick();
        }
        return getBlockGestures();
    }

    public int reactTagForTouch(float f10, float f11) {
        throw new IllegalStateException("[RNScreens] DimmingView should never be asked for the view tag!");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
