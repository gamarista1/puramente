package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import i.i;

public class d extends ContextWrapper {

    /* renamed from: f  reason: collision with root package name */
    private static Configuration f11144f;

    /* renamed from: a  reason: collision with root package name */
    private int f11145a;

    /* renamed from: b  reason: collision with root package name */
    private Resources.Theme f11146b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f11147c;

    /* renamed from: d  reason: collision with root package name */
    private Configuration f11148d;

    /* renamed from: e  reason: collision with root package name */
    private Resources f11149e;

    public d(Context context, int i10) {
        super(context);
        this.f11145a = i10;
    }

    private Resources b() {
        if (this.f11149e == null) {
            Configuration configuration = this.f11148d;
            if (configuration == null || (Build.VERSION.SDK_INT >= 26 && e(configuration))) {
                this.f11149e = super.getResources();
            } else {
                this.f11149e = createConfigurationContext(this.f11148d).getResources();
            }
        }
        return this.f11149e;
    }

    private void d() {
        boolean z10;
        if (this.f11146b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f11146b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f11146b.setTo(theme);
            }
        }
        f(this.f11146b, this.f11145a, z10);
    }

    private static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f11144f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f11144f = configuration2;
        }
        return configuration.equals(f11144f);
    }

    public void a(Configuration configuration) {
        if (this.f11149e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f11148d == null) {
            this.f11148d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f11145a;
    }

    /* access modifiers changed from: protected */
    public void f(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f11147c == null) {
            this.f11147c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f11147c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f11146b;
        if (theme != null) {
            return theme;
        }
        if (this.f11145a == 0) {
            this.f11145a = i.f21431d;
        }
        d();
        return this.f11146b;
    }

    public void setTheme(int i10) {
        if (this.f11145a != i10) {
            this.f11145a = i10;
            d();
        }
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f11146b = theme;
    }
}
