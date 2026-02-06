package u6;

import T5.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import j7.b;
import t6.C4046a;
import t6.C4047b;
import u6.C4089a;

/* renamed from: u6.c  reason: case insensitive filesystem */
public abstract class C4091c extends ImageView {

    /* renamed from: g  reason: collision with root package name */
    private static boolean f48608g = false;

    /* renamed from: a  reason: collision with root package name */
    private final C4089a.C0733a f48609a = new C4089a.C0733a();

    /* renamed from: b  reason: collision with root package name */
    private float f48610b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    private C4090b f48611c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f48612d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f48613e = false;

    /* renamed from: f  reason: collision with root package name */
    private Object f48614f = null;

    public C4091c(Context context) {
        super(context);
        c(context);
    }

    private void c(Context context) {
        try {
            if (b.d()) {
                b.a("DraweeView#init");
            }
            if (!this.f48612d) {
                boolean z10 = true;
                this.f48612d = true;
                this.f48611c = C4090b.c((C4047b) null, context);
                ColorStateList imageTintList = getImageTintList();
                if (imageTintList != null) {
                    setColorFilter(imageTintList.getDefaultColor());
                    if (!f48608g || context.getApplicationInfo().targetSdkVersion < 24) {
                        z10 = false;
                    }
                    this.f48613e = z10;
                    if (b.d()) {
                        b.b();
                    }
                } else if (b.d()) {
                    b.b();
                }
            } else if (b.d()) {
                b.b();
            }
        } catch (Throwable th2) {
            if (b.d()) {
                b.b();
            }
            throw th2;
        }
    }

    private void d() {
        Drawable drawable;
        boolean z10;
        if (this.f48613e && (drawable = getDrawable()) != null) {
            if (getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            drawable.setVisible(z10, false);
        }
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z10) {
        f48608g = z10;
    }

    /* access modifiers changed from: protected */
    public void a() {
        this.f48611c.i();
    }

    /* access modifiers changed from: protected */
    public void b() {
        this.f48611c.j();
    }

    /* access modifiers changed from: protected */
    public void e() {
        a();
    }

    /* access modifiers changed from: protected */
    public void f() {
        b();
    }

    public float getAspectRatio() {
        return this.f48610b;
    }

    public C4046a getController() {
        return this.f48611c.e();
    }

    public Object getExtraData() {
        return this.f48614f;
    }

    public C4047b getHierarchy() {
        return this.f48611c.f();
    }

    public Drawable getTopLevelDrawable() {
        return this.f48611c.g();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        e();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        f();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        d();
        e();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        C4089a.C0733a aVar = this.f48609a;
        aVar.f48600a = i10;
        aVar.f48601b = i11;
        C4089a.b(aVar, this.f48610b, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        C4089a.C0733a aVar2 = this.f48609a;
        super.onMeasure(aVar2.f48600a, aVar2.f48601b);
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        d();
        f();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f48611c.k(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        d();
    }

    public void setAspectRatio(float f10) {
        if (f10 != this.f48610b) {
            this.f48610b = f10;
            requestLayout();
        }
    }

    public void setController(C4046a aVar) {
        this.f48611c.n(aVar);
        super.setImageDrawable(this.f48611c.g());
    }

    public void setExtraData(Object obj) {
        this.f48614f = obj;
    }

    public void setHierarchy(C4047b bVar) {
        this.f48611c.o(bVar);
        super.setImageDrawable(this.f48611c.g());
    }

    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        c(getContext());
        this.f48611c.m();
        super.setImageBitmap(bitmap);
    }

    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        c(getContext());
        this.f48611c.m();
        super.setImageDrawable(drawable);
    }

    @Deprecated
    public void setImageResource(int i10) {
        c(getContext());
        this.f48611c.m();
        super.setImageResource(i10);
    }

    @Deprecated
    public void setImageURI(Uri uri) {
        c(getContext());
        this.f48611c.m();
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z10) {
        this.f48613e = z10;
    }

    public String toString() {
        String str;
        i.a b10 = i.b(this);
        C4090b bVar = this.f48611c;
        if (bVar != null) {
            str = bVar.toString();
        } else {
            str = "<no holder set>";
        }
        return b10.b("holder", str).toString();
    }
}
