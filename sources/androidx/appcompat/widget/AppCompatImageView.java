package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

public class AppCompatImageView extends ImageView {
    private final C1566e mBackgroundTintHelper;
    private boolean mHasLevel;
    private final C1578q mImageHelper;

    public AppCompatImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1566e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.b();
        }
        C1578q qVar = this.mImageHelper;
        if (qVar != null) {
            qVar.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1566e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1566e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C1578q qVar = this.mImageHelper;
        if (qVar != null) {
            return qVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C1578q qVar = this.mImageHelper;
        if (qVar != null) {
            return qVar.e();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        if (!this.mImageHelper.f() || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1566e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1566e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C1578q qVar = this.mImageHelper;
        if (qVar != null) {
            qVar.c();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        C1578q qVar = this.mImageHelper;
        if (!(qVar == null || drawable == null || this.mHasLevel)) {
            qVar.h(drawable);
        }
        super.setImageDrawable(drawable);
        C1578q qVar2 = this.mImageHelper;
        if (qVar2 != null) {
            qVar2.c();
            if (!this.mHasLevel) {
                this.mImageHelper.b();
            }
        }
    }

    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.mHasLevel = true;
    }

    public void setImageResource(int i10) {
        C1578q qVar = this.mImageHelper;
        if (qVar != null) {
            qVar.i(i10);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C1578q qVar = this.mImageHelper;
        if (qVar != null) {
            qVar.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1566e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1566e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C1578q qVar = this.mImageHelper;
        if (qVar != null) {
            qVar.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C1578q qVar = this.mImageHelper;
        if (qVar != null) {
            qVar.k(mode);
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i10) {
        super(d0.b(context), attributeSet, i10);
        this.mHasLevel = false;
        c0.a(this, getContext());
        C1566e eVar = new C1566e(this);
        this.mBackgroundTintHelper = eVar;
        eVar.e(attributeSet, i10);
        C1578q qVar = new C1578q(this);
        this.mImageHelper = qVar;
        qVar.g(attributeSet, i10);
    }
}
