package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.O;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.q0;
import androidx.core.app.l;
import androidx.core.app.y;
import androidx.fragment.app.C1773v;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import f.C1956b;
import u1.i;
import x3.C2912d;
import x3.C2915g;

public abstract class d extends C1773v implements e, y.a {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private g mDelegate;
    private Resources mResources;

    class a implements C2912d.c {
        a() {
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            d.this.getDelegate().E(bundle);
            return bundle;
        }
    }

    class b implements C1956b {
        b() {
        }

        public void a(Context context) {
            g delegate = d.this.getDelegate();
            delegate.v();
            delegate.A(d.this.getSavedStateRegistry().b(d.DELEGATE_TAG));
        }
    }

    public d() {
        C();
    }

    private void C() {
        getSavedStateRegistry().h(DELEGATE_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    private void D() {
        f0.b(getWindow().getDecorView(), this);
        g0.b(getWindow().getDecorView(), this);
        C2915g.b(getWindow().getDecorView(), this);
        O.b(getWindow().getDecorView(), this);
    }

    private boolean E(KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        D();
        getDelegate().e(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().i(context));
    }

    public void closeOptionsMenu() {
        C1560a supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.g()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C1560a supportActionBar = getSupportActionBar();
        if (keyCode != 82 || supportActionBar == null || !supportActionBar.p(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public <T extends View> T findViewById(int i10) {
        return getDelegate().l(i10);
    }

    public g getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = g.j(this, this);
        }
        return this.mDelegate;
    }

    public C1561b getDrawerToggleDelegate() {
        return getDelegate().p();
    }

    public MenuInflater getMenuInflater() {
        return getDelegate().s();
    }

    public Resources getResources() {
        if (this.mResources == null && q0.c()) {
            this.mResources = new q0(this, super.getResources());
        }
        Resources resources = this.mResources;
        if (resources == null) {
            return super.getResources();
        }
        return resources;
    }

    public C1560a getSupportActionBar() {
        return getDelegate().u();
    }

    public Intent getSupportParentActivityIntent() {
        return l.a(this);
    }

    public void invalidateOptionsMenu() {
        getDelegate().w();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().z(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(y yVar) {
        yVar.d(this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        getDelegate().B();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (E(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        C1560a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.j() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    /* access modifiers changed from: protected */
    public void onNightModeChanged(int i10) {
    }

    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().C(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        getDelegate().D();
    }

    public void onPrepareSupportNavigateUpTaskStack(y yVar) {
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        getDelegate().F();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        getDelegate().G();
    }

    public void onSupportActionModeFinished(androidx.appcompat.view.b bVar) {
    }

    public void onSupportActionModeStarted(androidx.appcompat.view.b bVar) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
            y h10 = y.h(this);
            onCreateSupportNavigateUpTaskStack(h10);
            onPrepareSupportNavigateUpTaskStack(h10);
            h10.t();
            try {
                androidx.core.app.b.b(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        getDelegate().R(charSequence);
    }

    public androidx.appcompat.view.b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    public void openOptionsMenu() {
        C1560a supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.q()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i10) {
        D();
        getDelegate().K(i10);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().P(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z10) {
    }

    public void setTheme(int i10) {
        super.setTheme(i10);
        getDelegate().Q(i10);
    }

    public androidx.appcompat.view.b startSupportActionMode(b.a aVar) {
        return getDelegate().S(aVar);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().w();
    }

    public void supportNavigateUpTo(Intent intent) {
        l.e(this, intent);
    }

    public boolean supportRequestWindowFeature(int i10) {
        return getDelegate().J(i10);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return l.f(this, intent);
    }

    public void setContentView(View view) {
        D();
        getDelegate().L(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        D();
        getDelegate().M(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onLocalesChanged(i iVar) {
    }
}
