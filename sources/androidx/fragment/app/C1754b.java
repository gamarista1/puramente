package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.T;
import androidx.lifecycle.C1790m;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.b  reason: case insensitive filesystem */
final class C1754b implements Parcelable {
    public static final Parcelable.Creator<C1754b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final int[] f16882a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList f16883b;

    /* renamed from: c  reason: collision with root package name */
    final int[] f16884c;

    /* renamed from: d  reason: collision with root package name */
    final int[] f16885d;

    /* renamed from: e  reason: collision with root package name */
    final int f16886e;

    /* renamed from: f  reason: collision with root package name */
    final String f16887f;

    /* renamed from: g  reason: collision with root package name */
    final int f16888g;

    /* renamed from: h  reason: collision with root package name */
    final int f16889h;

    /* renamed from: i  reason: collision with root package name */
    final CharSequence f16890i;

    /* renamed from: j  reason: collision with root package name */
    final int f16891j;

    /* renamed from: k  reason: collision with root package name */
    final CharSequence f16892k;

    /* renamed from: l  reason: collision with root package name */
    final ArrayList f16893l;

    /* renamed from: m  reason: collision with root package name */
    final ArrayList f16894m;

    /* renamed from: n  reason: collision with root package name */
    final boolean f16895n;

    /* renamed from: androidx.fragment.app.b$a */
    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public C1754b createFromParcel(Parcel parcel) {
            return new C1754b(parcel);
        }

        /* renamed from: b */
        public C1754b[] newArray(int i10) {
            return new C1754b[i10];
        }
    }

    C1754b(C1753a aVar) {
        int size = aVar.f16815c.size();
        this.f16882a = new int[(size * 6)];
        if (aVar.f16821i) {
            this.f16883b = new ArrayList(size);
            this.f16884c = new int[size];
            this.f16885d = new int[size];
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                T.a aVar2 = (T.a) aVar.f16815c.get(i11);
                int i12 = i10 + 1;
                this.f16882a[i10] = aVar2.f16832a;
                ArrayList arrayList = this.f16883b;
                C1769q qVar = aVar2.f16833b;
                arrayList.add(qVar != null ? qVar.mWho : null);
                int[] iArr = this.f16882a;
                iArr[i12] = aVar2.f16834c;
                iArr[i10 + 2] = aVar2.f16835d;
                iArr[i10 + 3] = aVar2.f16836e;
                int i13 = i10 + 5;
                iArr[i10 + 4] = aVar2.f16837f;
                i10 += 6;
                iArr[i13] = aVar2.f16838g;
                this.f16884c[i11] = aVar2.f16839h.ordinal();
                this.f16885d[i11] = aVar2.f16840i.ordinal();
            }
            this.f16886e = aVar.f16820h;
            this.f16887f = aVar.f16823k;
            this.f16888g = aVar.f16878v;
            this.f16889h = aVar.f16824l;
            this.f16890i = aVar.f16825m;
            this.f16891j = aVar.f16826n;
            this.f16892k = aVar.f16827o;
            this.f16893l = aVar.f16828p;
            this.f16894m = aVar.f16829q;
            this.f16895n = aVar.f16830r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    private void a(C1753a aVar) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 < this.f16882a.length) {
                T.a aVar2 = new T.a();
                int i12 = i10 + 1;
                aVar2.f16832a = this.f16882a[i10];
                if (J.L0(2)) {
                    Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i11 + " base fragment #" + this.f16882a[i12]);
                }
                aVar2.f16839h = C1790m.b.values()[this.f16884c[i11]];
                aVar2.f16840i = C1790m.b.values()[this.f16885d[i11]];
                int[] iArr = this.f16882a;
                int i13 = i10 + 2;
                if (iArr[i12] == 0) {
                    z10 = false;
                }
                aVar2.f16834c = z10;
                int i14 = iArr[i13];
                aVar2.f16835d = i14;
                int i15 = iArr[i10 + 3];
                aVar2.f16836e = i15;
                int i16 = i10 + 5;
                int i17 = iArr[i10 + 4];
                aVar2.f16837f = i17;
                i10 += 6;
                int i18 = iArr[i16];
                aVar2.f16838g = i18;
                aVar.f16816d = i14;
                aVar.f16817e = i15;
                aVar.f16818f = i17;
                aVar.f16819g = i18;
                aVar.f(aVar2);
                i11++;
            } else {
                aVar.f16820h = this.f16886e;
                aVar.f16823k = this.f16887f;
                aVar.f16821i = true;
                aVar.f16824l = this.f16889h;
                aVar.f16825m = this.f16890i;
                aVar.f16826n = this.f16891j;
                aVar.f16827o = this.f16892k;
                aVar.f16828p = this.f16893l;
                aVar.f16829q = this.f16894m;
                aVar.f16830r = this.f16895n;
                return;
            }
        }
    }

    public C1753a b(J j10) {
        C1753a aVar = new C1753a(j10);
        a(aVar);
        aVar.f16878v = this.f16888g;
        for (int i10 = 0; i10 < this.f16883b.size(); i10++) {
            String str = (String) this.f16883b.get(i10);
            if (str != null) {
                ((T.a) aVar.f16815c.get(i10)).f16833b = j10.h0(str);
            }
        }
        aVar.x(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f16882a);
        parcel.writeStringList(this.f16883b);
        parcel.writeIntArray(this.f16884c);
        parcel.writeIntArray(this.f16885d);
        parcel.writeInt(this.f16886e);
        parcel.writeString(this.f16887f);
        parcel.writeInt(this.f16888g);
        parcel.writeInt(this.f16889h);
        TextUtils.writeToParcel(this.f16890i, parcel, 0);
        parcel.writeInt(this.f16891j);
        TextUtils.writeToParcel(this.f16892k, parcel, 0);
        parcel.writeStringList(this.f16893l);
        parcel.writeStringList(this.f16894m);
        parcel.writeInt(this.f16895n ? 1 : 0);
    }

    C1754b(Parcel parcel) {
        this.f16882a = parcel.createIntArray();
        this.f16883b = parcel.createStringArrayList();
        this.f16884c = parcel.createIntArray();
        this.f16885d = parcel.createIntArray();
        this.f16886e = parcel.readInt();
        this.f16887f = parcel.readString();
        this.f16888g = parcel.readInt();
        this.f16889h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f16890i = (CharSequence) creator.createFromParcel(parcel);
        this.f16891j = parcel.readInt();
        this.f16892k = (CharSequence) creator.createFromParcel(parcel);
        this.f16893l = parcel.createStringArrayList();
        this.f16894m = parcel.createStringArrayList();
        this.f16895n = parcel.readInt() != 0;
    }
}
