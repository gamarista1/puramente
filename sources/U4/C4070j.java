package u4;

import A4.e;
import H4.f;
import H4.l;
import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import j.C2115a;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipInputStream;

/* renamed from: u4.j  reason: case insensitive filesystem */
public class C4070j extends AppCompatImageView {

    /* renamed from: n  reason: collision with root package name */
    private static final String f48496n = "j";
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static final P f48497o = new C4067g();

    /* renamed from: a  reason: collision with root package name */
    private final P f48498a = new d(this);

    /* renamed from: b  reason: collision with root package name */
    private final P f48499b = new c(this);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public P f48500c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f48501d = 0;

    /* renamed from: e  reason: collision with root package name */
    private final L f48502e = new L();

    /* renamed from: f  reason: collision with root package name */
    private String f48503f;

    /* renamed from: g  reason: collision with root package name */
    private int f48504g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f48505h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f48506i = false;

    /* renamed from: j  reason: collision with root package name */
    private boolean f48507j = true;

    /* renamed from: k  reason: collision with root package name */
    private final Set f48508k = new HashSet();

    /* renamed from: l  reason: collision with root package name */
    private final Set f48509l = new HashSet();

    /* renamed from: m  reason: collision with root package name */
    private W f48510m;

    /* renamed from: u4.j$a */
    private static class a extends View.BaseSavedState {
        public static final Parcelable.Creator<a> CREATOR = new C0732a();

        /* renamed from: a  reason: collision with root package name */
        String f48511a;

        /* renamed from: b  reason: collision with root package name */
        int f48512b;

        /* renamed from: c  reason: collision with root package name */
        float f48513c;

        /* renamed from: d  reason: collision with root package name */
        boolean f48514d;

        /* renamed from: e  reason: collision with root package name */
        String f48515e;

        /* renamed from: f  reason: collision with root package name */
        int f48516f;

        /* renamed from: g  reason: collision with root package name */
        int f48517g;

        /* renamed from: u4.j$a$a  reason: collision with other inner class name */
        class C0732a implements Parcelable.Creator {
            C0732a() {
            }

            /* renamed from: a */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel, (C4069i) null);
            }

            /* renamed from: b */
            public a[] newArray(int i10) {
                return new a[i10];
            }
        }

        /* synthetic */ a(Parcel parcel, C4069i iVar) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f48511a);
            parcel.writeFloat(this.f48513c);
            parcel.writeInt(this.f48514d ? 1 : 0);
            parcel.writeString(this.f48515e);
            parcel.writeInt(this.f48516f);
            parcel.writeInt(this.f48517g);
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }

        private a(Parcel parcel) {
            super(parcel);
            this.f48511a = parcel.readString();
            this.f48513c = parcel.readFloat();
            this.f48514d = parcel.readInt() != 1 ? false : true;
            this.f48515e = parcel.readString();
            this.f48516f = parcel.readInt();
            this.f48517g = parcel.readInt();
        }
    }

    /* renamed from: u4.j$b */
    private enum b {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    /* renamed from: u4.j$c */
    private static class c implements P {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference f48525a;

        public c(C4070j jVar) {
            this.f48525a = new WeakReference(jVar);
        }

        /* renamed from: a */
        public void onResult(Throwable th2) {
            P p10;
            C4070j jVar = (C4070j) this.f48525a.get();
            if (jVar != null) {
                if (jVar.f48501d != 0) {
                    jVar.setImageResource(jVar.f48501d);
                }
                if (jVar.f48500c == null) {
                    p10 = C4070j.f48497o;
                } else {
                    p10 = jVar.f48500c;
                }
                p10.onResult(th2);
            }
        }
    }

    /* renamed from: u4.j$d */
    private static class d implements P {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference f48526a;

        public d(C4070j jVar) {
            this.f48526a = new WeakReference(jVar);
        }

        /* renamed from: a */
        public void onResult(C4071k kVar) {
            C4070j jVar = (C4070j) this.f48526a.get();
            if (jVar != null) {
                jVar.setComposition(kVar);
            }
        }
    }

    public C4070j(Context context) {
        super(context);
        r((AttributeSet) null, Y.f48444a);
    }

    private void E() {
        boolean s10 = s();
        setImageDrawable((Drawable) null);
        setImageDrawable(this.f48502e);
        if (s10) {
            this.f48502e.B0();
        }
    }

    private void G(float f10, boolean z10) {
        if (z10) {
            this.f48508k.add(b.SET_PROGRESS);
        }
        this.f48502e.b1(f10);
    }

    private void m() {
        W w10 = this.f48510m;
        if (w10 != null) {
            w10.k(this.f48498a);
            this.f48510m.j(this.f48499b);
        }
    }

    private void n() {
        this.f48502e.v();
    }

    private W p(String str) {
        if (isInEditMode()) {
            return new W(new C4066f(this, str), true);
        }
        if (this.f48507j) {
            return C4080u.l(getContext(), str);
        }
        return C4080u.m(getContext(), str, (String) null);
    }

    private W q(int i10) {
        if (isInEditMode()) {
            return new W(new C4068h(this, i10), true);
        }
        if (this.f48507j) {
            return C4080u.w(getContext(), i10);
        }
        return C4080u.x(getContext(), i10, (String) null);
    }

    private void r(AttributeSet attributeSet, int i10) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, Z.f48445a, i10, 0);
        this.f48507j = obtainStyledAttributes.getBoolean(Z.f48448d, true);
        boolean hasValue = obtainStyledAttributes.hasValue(Z.f48460p);
        boolean hasValue2 = obtainStyledAttributes.hasValue(Z.f48455k);
        boolean hasValue3 = obtainStyledAttributes.hasValue(Z.f48465u);
        if (!hasValue || !hasValue2) {
            if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(Z.f48460p, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(Z.f48455k);
                if (string2 != null) {
                    setAnimation(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(Z.f48465u)) != null) {
                setAnimationFromUrl(string);
            }
            setFallbackResource(obtainStyledAttributes.getResourceId(Z.f48454j, 0));
            if (obtainStyledAttributes.getBoolean(Z.f48447c, false)) {
                this.f48506i = true;
            }
            if (obtainStyledAttributes.getBoolean(Z.f48458n, false)) {
                this.f48502e.d1(-1);
            }
            if (obtainStyledAttributes.hasValue(Z.f48463s)) {
                setRepeatMode(obtainStyledAttributes.getInt(Z.f48463s, 1));
            }
            if (obtainStyledAttributes.hasValue(Z.f48462r)) {
                setRepeatCount(obtainStyledAttributes.getInt(Z.f48462r, -1));
            }
            if (obtainStyledAttributes.hasValue(Z.f48464t)) {
                setSpeed(obtainStyledAttributes.getFloat(Z.f48464t, 1.0f));
            }
            if (obtainStyledAttributes.hasValue(Z.f48450f)) {
                setClipToCompositionBounds(obtainStyledAttributes.getBoolean(Z.f48450f, true));
            }
            if (obtainStyledAttributes.hasValue(Z.f48449e)) {
                setClipTextToBoundingBox(obtainStyledAttributes.getBoolean(Z.f48449e, false));
            }
            if (obtainStyledAttributes.hasValue(Z.f48452h)) {
                setDefaultFontFileExtension(obtainStyledAttributes.getString(Z.f48452h));
            }
            setImageAssetsFolder(obtainStyledAttributes.getString(Z.f48457m));
            G(obtainStyledAttributes.getFloat(Z.f48459o, 0.0f), obtainStyledAttributes.hasValue(Z.f48459o));
            o(obtainStyledAttributes.getBoolean(Z.f48453i, false));
            if (obtainStyledAttributes.hasValue(Z.f48451g)) {
                b0 b0Var = new b0(C2115a.a(getContext(), obtainStyledAttributes.getResourceId(Z.f48451g, -1)).getDefaultColor());
                k(new e("**"), T.f48398K, new I4.c(b0Var));
            }
            if (obtainStyledAttributes.hasValue(Z.f48461q)) {
                int i11 = Z.f48461q;
                a0 a0Var = a0.AUTOMATIC;
                int i12 = obtainStyledAttributes.getInt(i11, a0Var.ordinal());
                if (i12 >= a0.values().length) {
                    i12 = a0Var.ordinal();
                }
                setRenderMode(a0.values()[i12]);
            }
            if (obtainStyledAttributes.hasValue(Z.f48446b)) {
                int i13 = Z.f48446b;
                C4061a aVar = C4061a.AUTOMATIC;
                int i14 = obtainStyledAttributes.getInt(i13, aVar.ordinal());
                if (i14 >= a0.values().length) {
                    i14 = aVar.ordinal();
                }
                setAsyncUpdates(C4061a.values()[i14]);
            }
            setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(Z.f48456l, false));
            if (obtainStyledAttributes.hasValue(Z.f48466v)) {
                setUseCompositionFrameRate(obtainStyledAttributes.getBoolean(Z.f48466v, false));
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
    }

    private void setCompositionTask(W w10) {
        U e10 = w10.e();
        L l10 = this.f48502e;
        if (e10 == null || l10 != getDrawable() || l10.J() != e10.b()) {
            this.f48508k.add(b.SET_ANIMATION);
            n();
            m();
            this.f48510m = w10.d(this.f48498a).c(this.f48499b);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ U t(String str) {
        if (this.f48507j) {
            return C4080u.n(getContext(), str);
        }
        return C4080u.o(getContext(), str, (String) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ U u(int i10) {
        if (this.f48507j) {
            return C4080u.y(getContext(), i10);
        }
        return C4080u.z(getContext(), i10, (String) null);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void v(Throwable th2) {
        if (l.k(th2)) {
            f.d("Unable to load composition.", th2);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th2);
    }

    public void A(InputStream inputStream, String str) {
        setCompositionTask(C4080u.p(inputStream, str));
    }

    public void B(ZipInputStream zipInputStream, String str) {
        setCompositionTask(C4080u.D(zipInputStream, str));
    }

    public void C(String str, String str2) {
        A(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void D(String str, String str2) {
        setCompositionTask(C4080u.B(getContext(), str, str2));
    }

    public void F(int i10, int i11) {
        this.f48502e.U0(i10, i11);
    }

    public C4061a getAsyncUpdates() {
        return this.f48502e.E();
    }

    public boolean getAsyncUpdatesEnabled() {
        return this.f48502e.F();
    }

    public boolean getClipTextToBoundingBox() {
        return this.f48502e.H();
    }

    public boolean getClipToCompositionBounds() {
        return this.f48502e.I();
    }

    public C4071k getComposition() {
        Drawable drawable = getDrawable();
        L l10 = this.f48502e;
        if (drawable == l10) {
            return l10.J();
        }
        return null;
    }

    public long getDuration() {
        C4071k composition = getComposition();
        if (composition != null) {
            return (long) composition.d();
        }
        return 0;
    }

    public int getFrame() {
        return this.f48502e.M();
    }

    public String getImageAssetsFolder() {
        return this.f48502e.O();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f48502e.Q();
    }

    public float getMaxFrame() {
        return this.f48502e.S();
    }

    public float getMinFrame() {
        return this.f48502e.T();
    }

    public X getPerformanceTracker() {
        return this.f48502e.U();
    }

    public float getProgress() {
        return this.f48502e.V();
    }

    public a0 getRenderMode() {
        return this.f48502e.W();
    }

    public int getRepeatCount() {
        return this.f48502e.X();
    }

    public int getRepeatMode() {
        return this.f48502e.Y();
    }

    public float getSpeed() {
        return this.f48502e.Z();
    }

    public void i(Animator.AnimatorListener animatorListener) {
        this.f48502e.q(animatorListener);
    }

    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof L) && ((L) drawable).W() == a0.SOFTWARE) {
            this.f48502e.invalidateSelf();
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        L l10 = this.f48502e;
        if (drawable2 == l10) {
            super.invalidateDrawable(l10);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean j(S s10) {
        C4071k composition = getComposition();
        if (composition != null) {
            s10.a(composition);
        }
        return this.f48509l.add(s10);
    }

    public void k(e eVar, Object obj, I4.c cVar) {
        this.f48502e.r(eVar, obj, cVar);
    }

    public void l() {
        this.f48506i = false;
        this.f48508k.add(b.PLAY_OPTION);
        this.f48502e.u();
    }

    public void o(boolean z10) {
        this.f48502e.A(M.MergePathsApi19, z10);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.f48506i) {
            this.f48502e.y0();
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i10;
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        this.f48503f = aVar.f48511a;
        Set set = this.f48508k;
        b bVar = b.SET_ANIMATION;
        if (!set.contains(bVar) && !TextUtils.isEmpty(this.f48503f)) {
            setAnimation(this.f48503f);
        }
        this.f48504g = aVar.f48512b;
        if (!this.f48508k.contains(bVar) && (i10 = this.f48504g) != 0) {
            setAnimation(i10);
        }
        if (!this.f48508k.contains(b.SET_PROGRESS)) {
            G(aVar.f48513c, false);
        }
        if (!this.f48508k.contains(b.PLAY_OPTION) && aVar.f48514d) {
            x();
        }
        if (!this.f48508k.contains(b.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(aVar.f48515e);
        }
        if (!this.f48508k.contains(b.SET_REPEAT_MODE)) {
            setRepeatMode(aVar.f48516f);
        }
        if (!this.f48508k.contains(b.SET_REPEAT_COUNT)) {
            setRepeatCount(aVar.f48517g);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f48511a = this.f48503f;
        aVar.f48512b = this.f48504g;
        aVar.f48513c = this.f48502e.V();
        aVar.f48514d = this.f48502e.e0();
        aVar.f48515e = this.f48502e.O();
        aVar.f48516f = this.f48502e.Y();
        aVar.f48517g = this.f48502e.X();
        return aVar;
    }

    public boolean s() {
        return this.f48502e.d0();
    }

    public void setAnimation(int i10) {
        this.f48504g = i10;
        this.f48503f = null;
        setCompositionTask(q(i10));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        C(str, (String) null);
    }

    public void setAnimationFromUrl(String str) {
        W w10;
        if (this.f48507j) {
            w10 = C4080u.A(getContext(), str);
        } else {
            w10 = C4080u.B(getContext(), str, (String) null);
        }
        setCompositionTask(w10);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.f48502e.E0(z10);
    }

    public void setAsyncUpdates(C4061a aVar) {
        this.f48502e.F0(aVar);
    }

    public void setCacheComposition(boolean z10) {
        this.f48507j = z10;
    }

    public void setClipTextToBoundingBox(boolean z10) {
        this.f48502e.G0(z10);
    }

    public void setClipToCompositionBounds(boolean z10) {
        this.f48502e.H0(z10);
    }

    public void setComposition(C4071k kVar) {
        if (C4065e.f48481a) {
            String str = f48496n;
            Log.v(str, "Set Composition \n" + kVar);
        }
        this.f48502e.setCallback(this);
        this.f48505h = true;
        boolean I02 = this.f48502e.I0(kVar);
        if (this.f48506i) {
            this.f48502e.y0();
        }
        this.f48505h = false;
        if (getDrawable() != this.f48502e || I02) {
            if (!I02) {
                E();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (S a10 : this.f48509l) {
                a10.a(kVar);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.f48502e.J0(str);
    }

    public void setFailureListener(P p10) {
        this.f48500c = p10;
    }

    public void setFallbackResource(int i10) {
        this.f48501d = i10;
    }

    public void setFontAssetDelegate(C4062b bVar) {
        this.f48502e.K0(bVar);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.f48502e.L0(map);
    }

    public void setFrame(int i10) {
        this.f48502e.M0(i10);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.f48502e.N0(z10);
    }

    public void setImageAssetDelegate(C4063c cVar) {
        this.f48502e.O0(cVar);
    }

    public void setImageAssetsFolder(String str) {
        this.f48502e.P0(str);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f48504g = 0;
        this.f48503f = null;
        m();
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        this.f48504g = 0;
        this.f48503f = null;
        m();
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i10) {
        this.f48504g = 0;
        this.f48503f = null;
        m();
        super.setImageResource(i10);
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.f48502e.Q0(z10);
    }

    public void setMaxFrame(int i10) {
        this.f48502e.R0(i10);
    }

    public void setMaxProgress(float f10) {
        this.f48502e.T0(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.f48502e.V0(str);
    }

    public void setMinFrame(int i10) {
        this.f48502e.W0(i10);
    }

    public void setMinProgress(float f10) {
        this.f48502e.Y0(f10);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        this.f48502e.Z0(z10);
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        this.f48502e.a1(z10);
    }

    public void setProgress(float f10) {
        G(f10, true);
    }

    public void setRenderMode(a0 a0Var) {
        this.f48502e.c1(a0Var);
    }

    public void setRepeatCount(int i10) {
        this.f48508k.add(b.SET_REPEAT_COUNT);
        this.f48502e.d1(i10);
    }

    public void setRepeatMode(int i10) {
        this.f48508k.add(b.SET_REPEAT_MODE);
        this.f48502e.e1(i10);
    }

    public void setSafeMode(boolean z10) {
        this.f48502e.f1(z10);
    }

    public void setSpeed(float f10) {
        this.f48502e.g1(f10);
    }

    public void setTextDelegate(c0 c0Var) {
        this.f48502e.h1(c0Var);
    }

    public void setUseCompositionFrameRate(boolean z10) {
        this.f48502e.i1(z10);
    }

    public void unscheduleDrawable(Drawable drawable) {
        L l10;
        if (!this.f48505h && drawable == (l10 = this.f48502e) && l10.d0()) {
            w();
        } else if (!this.f48505h && (drawable instanceof L)) {
            L l11 = (L) drawable;
            if (l11.d0()) {
                l11.x0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void w() {
        this.f48506i = false;
        this.f48502e.x0();
    }

    public void x() {
        this.f48508k.add(b.PLAY_OPTION);
        this.f48502e.y0();
    }

    public void y() {
        this.f48508k.add(b.PLAY_OPTION);
        this.f48502e.B0();
    }

    public void z() {
        this.f48502e.C0();
    }

    public void setMaxFrame(String str) {
        this.f48502e.S0(str);
    }

    public void setMinFrame(String str) {
        this.f48502e.X0(str);
    }

    public void setAnimation(String str) {
        this.f48503f = str;
        this.f48504g = 0;
        setCompositionTask(p(str));
    }
}
