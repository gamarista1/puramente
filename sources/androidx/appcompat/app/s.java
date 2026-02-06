package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.O;
import androidx.activity.r;
import androidx.appcompat.view.b;
import androidx.core.view.C1714t;
import androidx.lifecycle.f0;
import i.C2037a;
import x3.C2915g;

public abstract class s extends r implements e {

    /* renamed from: d  reason: collision with root package name */
    private g f11099d;

    /* renamed from: e  reason: collision with root package name */
    private final C1714t.a f11100e = new r(this);

    public s(Context context, int i10) {
        super(context, f(context, i10));
        g e10 = e();
        e10.Q(f(context, i10));
        e10.A((Bundle) null);
    }

    private static int f(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C2037a.f21280w, typedValue, true);
        return typedValue.resourceId;
    }

    private void g() {
        f0.b(getWindow().getDecorView(), this);
        C2915g.b(getWindow().getDecorView(), this);
        O.b(getWindow().getDecorView(), this);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e().e(view, layoutParams);
    }

    public void dismiss() {
        super.dismiss();
        e().B();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C1714t.e(this.f11100e, getWindow().getDecorView(), this, keyEvent);
    }

    public g e() {
        if (this.f11099d == null) {
            this.f11099d = g.k(this, this);
        }
        return this.f11099d;
    }

    public View findViewById(int i10) {
        return e().l(i10);
    }

    /* access modifiers changed from: package-private */
    public boolean h(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean i(int i10) {
        return e().J(i10);
    }

    public void invalidateOptionsMenu() {
        e().w();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        e().v();
        super.onCreate(bundle);
        e().A(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        e().G();
    }

    public void onSupportActionModeFinished(b bVar) {
    }

    public void onSupportActionModeStarted(b bVar) {
    }

    public b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    public void setContentView(int i10) {
        g();
        e().K(i10);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().R(charSequence);
    }

    public void setContentView(View view) {
        g();
        e().L(view);
    }

    public void setTitle(int i10) {
        super.setTitle(i10);
        e().R(getContext().getString(i10));
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g();
        e().M(view, layoutParams);
    }
}
