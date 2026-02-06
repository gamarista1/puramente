package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.C1790m;

final class P implements Parcelable {
    public static final Parcelable.Creator<P> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final String f16786a;

    /* renamed from: b  reason: collision with root package name */
    final String f16787b;

    /* renamed from: c  reason: collision with root package name */
    final boolean f16788c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f16789d;

    /* renamed from: e  reason: collision with root package name */
    final int f16790e;

    /* renamed from: f  reason: collision with root package name */
    final int f16791f;

    /* renamed from: g  reason: collision with root package name */
    final String f16792g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f16793h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f16794i;

    /* renamed from: j  reason: collision with root package name */
    final boolean f16795j;

    /* renamed from: k  reason: collision with root package name */
    final boolean f16796k;

    /* renamed from: l  reason: collision with root package name */
    final int f16797l;

    /* renamed from: m  reason: collision with root package name */
    final String f16798m;

    /* renamed from: n  reason: collision with root package name */
    final int f16799n;

    /* renamed from: o  reason: collision with root package name */
    final boolean f16800o;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public P createFromParcel(Parcel parcel) {
            return new P(parcel);
        }

        /* renamed from: b */
        public P[] newArray(int i10) {
            return new P[i10];
        }
    }

    P(C1769q qVar) {
        this.f16786a = qVar.getClass().getName();
        this.f16787b = qVar.mWho;
        this.f16788c = qVar.mFromLayout;
        this.f16789d = qVar.mInDynamicContainer;
        this.f16790e = qVar.mFragmentId;
        this.f16791f = qVar.mContainerId;
        this.f16792g = qVar.mTag;
        this.f16793h = qVar.mRetainInstance;
        this.f16794i = qVar.mRemoving;
        this.f16795j = qVar.mDetached;
        this.f16796k = qVar.mHidden;
        this.f16797l = qVar.mMaxState.ordinal();
        this.f16798m = qVar.mTargetWho;
        this.f16799n = qVar.mTargetRequestCode;
        this.f16800o = qVar.mUserVisibleHint;
    }

    /* access modifiers changed from: package-private */
    public C1769q a(C1777z zVar, ClassLoader classLoader) {
        C1769q a10 = zVar.a(classLoader, this.f16786a);
        a10.mWho = this.f16787b;
        a10.mFromLayout = this.f16788c;
        a10.mInDynamicContainer = this.f16789d;
        a10.mRestored = true;
        a10.mFragmentId = this.f16790e;
        a10.mContainerId = this.f16791f;
        a10.mTag = this.f16792g;
        a10.mRetainInstance = this.f16793h;
        a10.mRemoving = this.f16794i;
        a10.mDetached = this.f16795j;
        a10.mHidden = this.f16796k;
        a10.mMaxState = C1790m.b.values()[this.f16797l];
        a10.mTargetWho = this.f16798m;
        a10.mTargetRequestCode = this.f16799n;
        a10.mUserVisibleHint = this.f16800o;
        return a10;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f16786a);
        sb2.append(" (");
        sb2.append(this.f16787b);
        sb2.append(")}:");
        if (this.f16788c) {
            sb2.append(" fromLayout");
        }
        if (this.f16789d) {
            sb2.append(" dynamicContainer");
        }
        if (this.f16791f != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f16791f));
        }
        String str = this.f16792g;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f16792g);
        }
        if (this.f16793h) {
            sb2.append(" retainInstance");
        }
        if (this.f16794i) {
            sb2.append(" removing");
        }
        if (this.f16795j) {
            sb2.append(" detached");
        }
        if (this.f16796k) {
            sb2.append(" hidden");
        }
        if (this.f16798m != null) {
            sb2.append(" targetWho=");
            sb2.append(this.f16798m);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f16799n);
        }
        if (this.f16800o) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f16786a);
        parcel.writeString(this.f16787b);
        parcel.writeInt(this.f16788c ? 1 : 0);
        parcel.writeInt(this.f16789d ? 1 : 0);
        parcel.writeInt(this.f16790e);
        parcel.writeInt(this.f16791f);
        parcel.writeString(this.f16792g);
        parcel.writeInt(this.f16793h ? 1 : 0);
        parcel.writeInt(this.f16794i ? 1 : 0);
        parcel.writeInt(this.f16795j ? 1 : 0);
        parcel.writeInt(this.f16796k ? 1 : 0);
        parcel.writeInt(this.f16797l);
        parcel.writeString(this.f16798m);
        parcel.writeInt(this.f16799n);
        parcel.writeInt(this.f16800o ? 1 : 0);
    }

    P(Parcel parcel) {
        this.f16786a = parcel.readString();
        this.f16787b = parcel.readString();
        boolean z10 = false;
        this.f16788c = parcel.readInt() != 0;
        this.f16789d = parcel.readInt() != 0;
        this.f16790e = parcel.readInt();
        this.f16791f = parcel.readInt();
        this.f16792g = parcel.readString();
        this.f16793h = parcel.readInt() != 0;
        this.f16794i = parcel.readInt() != 0;
        this.f16795j = parcel.readInt() != 0;
        this.f16796k = parcel.readInt() != 0;
        this.f16797l = parcel.readInt();
        this.f16798m = parcel.readString();
        this.f16799n = parcel.readInt();
        this.f16800o = parcel.readInt() != 0 ? true : z10;
    }
}
