package xd;

import android.content.Context;
import android.widget.FrameLayout;
import com.facebook.react.uimanager.H;
import com.facebook.react.uimanager.Q;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class f extends FrameLayout implements Q {

    /* renamed from: a  reason: collision with root package name */
    public static final a f62254a = new a((DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(context);
        C6496s.h(context, "context");
    }

    public H getPointerEvents() {
        return H.BOX_NONE;
    }
}
