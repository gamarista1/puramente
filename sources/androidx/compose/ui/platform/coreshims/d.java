package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;
import java.util.Objects;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final Object f13700a;

    /* renamed from: b  reason: collision with root package name */
    private final View f13701b;

    private static class a {
        static Bundle a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }

    private static class b {
        static AutofillId a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j10) {
            return contentCaptureSession.newAutofillId(autofillId, j10);
        }

        static ViewStructure b(ContentCaptureSession contentCaptureSession, View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        static ViewStructure c(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j10) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j10);
        }

        static void d(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        public static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    private static class c {
        static void a(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
            contentCaptureSession.notifyViewsAppeared(list);
        }
    }

    private d(ContentCaptureSession contentCaptureSession, View view) {
        this.f13700a = contentCaptureSession;
        this.f13701b = view;
    }

    public static d f(ContentCaptureSession contentCaptureSession, View view) {
        return new d(contentCaptureSession, view);
    }

    public AutofillId a(long j10) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession a10 = c.a(this.f13700a);
        b a11 = e.a(this.f13701b);
        Objects.requireNonNull(a11);
        return b.a(a10, a11.a(), j10);
    }

    public f b(AutofillId autofillId, long j10) {
        if (Build.VERSION.SDK_INT >= 29) {
            return f.i(b.c(c.a(this.f13700a), autofillId, j10));
        }
        return null;
    }

    public void c(AutofillId autofillId, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.e(c.a(this.f13700a), autofillId, charSequence);
        }
    }

    public void d(List list) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            c.a(c.a(this.f13700a), list);
        } else if (i10 >= 29) {
            ViewStructure b10 = b.b(c.a(this.f13700a), this.f13701b);
            a.a(b10).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            b.d(c.a(this.f13700a), b10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                b.d(c.a(this.f13700a), (ViewStructure) list.get(i11));
            }
            ViewStructure b11 = b.b(c.a(this.f13700a), this.f13701b);
            a.a(b11).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            b.d(c.a(this.f13700a), b11);
        }
    }

    public void e(long[] jArr) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            ContentCaptureSession a10 = c.a(this.f13700a);
            b a11 = e.a(this.f13701b);
            Objects.requireNonNull(a11);
            b.f(a10, a11.a(), jArr);
        } else if (i10 >= 29) {
            ViewStructure b10 = b.b(c.a(this.f13700a), this.f13701b);
            a.a(b10).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            b.d(c.a(this.f13700a), b10);
            ContentCaptureSession a12 = c.a(this.f13700a);
            b a13 = e.a(this.f13701b);
            Objects.requireNonNull(a13);
            b.f(a12, a13.a(), jArr);
            ViewStructure b11 = b.b(c.a(this.f13700a), this.f13701b);
            a.a(b11).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            b.d(c.a(this.f13700a), b11);
        }
    }
}
