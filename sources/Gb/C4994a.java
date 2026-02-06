package gb;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import ib.C5020g;
import ib.C5024k;
import ib.n;

/* renamed from: gb.a  reason: case insensitive filesystem */
public class C4994a extends Drawable implements n {

    /* renamed from: a  reason: collision with root package name */
    private b f60590a;

    /* renamed from: a */
    public C4994a mutate() {
        this.f60590a = new b(this.f60590a);
        return this;
    }

    public void draw(Canvas canvas) {
        b bVar = this.f60590a;
        if (bVar.f60592b) {
            bVar.f60591a.draw(canvas);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f60590a;
    }

    public int getOpacity() {
        return this.f60590a.f60591a.getOpacity();
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f60590a.f60591a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f60590a.f60591a.setState(iArr)) {
            onStateChange = true;
        }
        boolean b10 = C4995b.b(iArr);
        b bVar = this.f60590a;
        if (bVar.f60592b == b10) {
            return onStateChange;
        }
        bVar.f60592b = b10;
        return true;
    }

    public void setAlpha(int i10) {
        this.f60590a.f60591a.setAlpha(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f60590a.f60591a.setColorFilter(colorFilter);
    }

    public void setShapeAppearanceModel(C5024k kVar) {
        this.f60590a.f60591a.setShapeAppearanceModel(kVar);
    }

    public void setTint(int i10) {
        this.f60590a.f60591a.setTint(i10);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f60590a.f60591a.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f60590a.f60591a.setTintMode(mode);
    }

    public C4994a(C5024k kVar) {
        this(new b(new C5020g(kVar)));
    }

    /* renamed from: gb.a$b */
    static final class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        C5020g f60591a;

        /* renamed from: b  reason: collision with root package name */
        boolean f60592b;

        public b(C5020g gVar) {
            this.f60591a = gVar;
            this.f60592b = false;
        }

        /* renamed from: a */
        public C4994a newDrawable() {
            return new C4994a(new b(this));
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public b(b bVar) {
            this.f60591a = (C5020g) bVar.f60591a.getConstantState().newDrawable();
            this.f60592b = bVar.f60592b;
        }
    }

    private C4994a(b bVar) {
        this.f60590a = bVar;
    }
}
