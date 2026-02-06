package M;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.emoji2.text.f;
import kotlin.jvm.internal.C6494p;
import yf.C6798l;

public abstract class r0 {

    /* renamed from: a  reason: collision with root package name */
    private static C6798l f4255a = a.f4256a;

    /* synthetic */ class a extends C6494p implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f4256a = new a();

        a() {
            super(1, m0.class, "<init>", "<init>(Landroid/view/View;)V", 0);
        }

        /* renamed from: i */
        public final m0 invoke(View view) {
            return new m0(view);
        }
    }

    public static final q0 b() {
        return new C1260a();
    }

    public static final C6798l c() {
        return f4255a;
    }

    /* access modifiers changed from: private */
    public static final void d(EditorInfo editorInfo) {
        if (f.k()) {
            f.c().x(editorInfo);
        }
    }
}
