package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.appcompat.view.b;
import i.j;

/* renamed from: androidx.appcompat.app.a  reason: case insensitive filesystem */
public abstract class C1560a {
    public boolean g() {
        return false;
    }

    public abstract boolean h();

    public abstract void i(boolean z10);

    public abstract int j();

    public abstract Context k();

    public boolean l() {
        return false;
    }

    public void m(Configuration configuration) {
    }

    /* access modifiers changed from: package-private */
    public void n() {
    }

    public abstract boolean o(int i10, KeyEvent keyEvent);

    public boolean p(KeyEvent keyEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(boolean z10);

    public abstract void s(boolean z10);

    public abstract void t(Drawable drawable);

    public abstract void u(boolean z10);

    public abstract void v(CharSequence charSequence);

    public abstract void w(CharSequence charSequence);

    public b x(b.a aVar) {
        return null;
    }

    /* renamed from: androidx.appcompat.app.a$a  reason: collision with other inner class name */
    public static class C0210a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f10976a = 8388627;

        public C0210a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f21649t);
            this.f10976a = obtainStyledAttributes.getInt(j.f21654u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0210a(int i10, int i11) {
            super(i10, i11);
        }

        public C0210a(C0210a aVar) {
            super(aVar);
            this.f10976a = aVar.f10976a;
        }

        public C0210a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
