package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.collection.C1587a;

class b extends a {

    /* renamed from: d  reason: collision with root package name */
    private final SparseIntArray f18485d;

    /* renamed from: e  reason: collision with root package name */
    private final Parcel f18486e;

    /* renamed from: f  reason: collision with root package name */
    private final int f18487f;

    /* renamed from: g  reason: collision with root package name */
    private final int f18488g;

    /* renamed from: h  reason: collision with root package name */
    private final String f18489h;

    /* renamed from: i  reason: collision with root package name */
    private int f18490i;

    /* renamed from: j  reason: collision with root package name */
    private int f18491j;

    /* renamed from: k  reason: collision with root package name */
    private int f18492k;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1587a(), new C1587a(), new C1587a());
    }

    public void A(byte[] bArr) {
        if (bArr != null) {
            this.f18486e.writeInt(bArr.length);
            this.f18486e.writeByteArray(bArr);
            return;
        }
        this.f18486e.writeInt(-1);
    }

    /* access modifiers changed from: protected */
    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f18486e, 0);
    }

    public void E(int i10) {
        this.f18486e.writeInt(i10);
    }

    public void G(Parcelable parcelable) {
        this.f18486e.writeParcelable(parcelable, 0);
    }

    public void I(String str) {
        this.f18486e.writeString(str);
    }

    public void a() {
        int i10 = this.f18490i;
        if (i10 >= 0) {
            int i11 = this.f18485d.get(i10);
            int dataPosition = this.f18486e.dataPosition();
            this.f18486e.setDataPosition(i11);
            this.f18486e.writeInt(dataPosition - i11);
            this.f18486e.setDataPosition(dataPosition);
        }
    }

    /* access modifiers changed from: protected */
    public a b() {
        Parcel parcel = this.f18486e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f18491j;
        if (i10 == this.f18487f) {
            i10 = this.f18488g;
        }
        int i11 = i10;
        return new b(parcel, dataPosition, i11, this.f18489h + "  ", this.f18482a, this.f18483b, this.f18484c);
    }

    public boolean g() {
        if (this.f18486e.readInt() != 0) {
            return true;
        }
        return false;
    }

    public byte[] i() {
        int readInt = this.f18486e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f18486e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f18486e);
    }

    public boolean m(int i10) {
        while (this.f18491j < this.f18488g) {
            int i11 = this.f18492k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f18486e.setDataPosition(this.f18491j);
            int readInt = this.f18486e.readInt();
            this.f18492k = this.f18486e.readInt();
            this.f18491j += readInt;
        }
        if (this.f18492k == i10) {
            return true;
        }
        return false;
    }

    public int o() {
        return this.f18486e.readInt();
    }

    public Parcelable q() {
        return this.f18486e.readParcelable(getClass().getClassLoader());
    }

    public String s() {
        return this.f18486e.readString();
    }

    public void w(int i10) {
        a();
        this.f18490i = i10;
        this.f18485d.put(i10, this.f18486e.dataPosition());
        E(0);
        E(i10);
    }

    public void y(boolean z10) {
        this.f18486e.writeInt(z10 ? 1 : 0);
    }

    private b(Parcel parcel, int i10, int i11, String str, C1587a aVar, C1587a aVar2, C1587a aVar3) {
        super(aVar, aVar2, aVar3);
        this.f18485d = new SparseIntArray();
        this.f18490i = -1;
        this.f18492k = -1;
        this.f18486e = parcel;
        this.f18487f = i10;
        this.f18488g = i11;
        this.f18491j = i10;
        this.f18489h = str;
    }
}
