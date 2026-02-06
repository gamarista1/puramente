package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.C1577p;
import androidx.core.view.C1677a;
import androidx.core.view.C1680b0;
import i.C2037a;
import y1.C2930A;

public class CheckableImageButton extends C1577p implements Checkable {

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f55957g = {16842912};

    /* renamed from: d  reason: collision with root package name */
    private boolean f55958d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f55959e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f55960f;

    class a extends C1677a {
        a() {
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        public void onInitializeAccessibilityNodeInfo(View view, C2930A a10) {
            super.onInitializeAccessibilityNodeInfo(view, a10);
            a10.r0(CheckableImageButton.this.a());
            a10.s0(CheckableImageButton.this.isChecked());
        }
    }

    static class b extends F1.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        boolean f55962c;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            /* renamed from: c */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            boolean z10 = true;
            if (parcel.readInt() != 1) {
                z10 = false;
            }
            this.f55962c = z10;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f55962c ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2037a.f21283z);
    }

    public boolean a() {
        return this.f55959e;
    }

    public boolean isChecked() {
        return this.f55958d;
    }

    public int[] onCreateDrawableState(int i10) {
        if (!this.f55958d) {
            return super.onCreateDrawableState(i10);
        }
        int[] iArr = f55957g;
        return View.mergeDrawableStates(super.onCreateDrawableState(i10 + iArr.length), iArr);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f55962c);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f55962c = this.f55958d;
        return bVar;
    }

    public void setCheckable(boolean z10) {
        if (this.f55959e != z10) {
            this.f55959e = z10;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z10) {
        if (this.f55959e && this.f55958d != z10) {
            this.f55958d = z10;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z10) {
        this.f55960f = z10;
    }

    public void setPressed(boolean z10) {
        if (this.f55960f) {
            super.setPressed(z10);
        }
    }

    public void toggle() {
        setChecked(!this.f55958d);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f55959e = true;
        this.f55960f = true;
        C1680b0.o0(this, new a());
    }
}
