package androidx.core.view;

import android.os.Build;
import android.view.ScrollFeedbackProvider;
import android.view.View;

public class M {

    /* renamed from: a  reason: collision with root package name */
    private final d f16021a;

    private static class b implements d {

        /* renamed from: a  reason: collision with root package name */
        private final ScrollFeedbackProvider f16022a;

        b(View view) {
            this.f16022a = ScrollFeedbackProvider.createProvider(view);
        }

        public void a(int i10, int i11, int i12, boolean z10) {
            this.f16022a.onScrollLimit(i10, i11, i12, z10);
        }

        public void b(int i10, int i11, int i12, int i13) {
            this.f16022a.onScrollProgress(i10, i11, i12, i13);
        }
    }

    private static class c implements d {
        private c() {
        }

        public void a(int i10, int i11, int i12, boolean z10) {
        }

        public void b(int i10, int i11, int i12, int i13) {
        }
    }

    private interface d {
        void a(int i10, int i11, int i12, boolean z10);

        void b(int i10, int i11, int i12, int i13);
    }

    private M(View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f16021a = new b(view);
        } else {
            this.f16021a = new c();
        }
    }

    public static M a(View view) {
        return new M(view);
    }

    public void b(int i10, int i11, int i12, boolean z10) {
        this.f16021a.a(i10, i11, i12, z10);
    }

    public void c(int i10, int i11, int i12, int i13) {
        this.f16021a.b(i10, i11, i12, i13);
    }
}
