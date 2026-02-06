package f7;

import T5.k;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.a;

public class E {

    /* renamed from: a  reason: collision with root package name */
    public final int f43423a;

    /* renamed from: b  reason: collision with root package name */
    public final int f43424b;

    /* renamed from: c  reason: collision with root package name */
    public final SparseIntArray f43425c;

    /* renamed from: d  reason: collision with root package name */
    public final int f43426d;

    /* renamed from: e  reason: collision with root package name */
    public final int f43427e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f43428f;

    /* renamed from: g  reason: collision with root package name */
    public final int f43429g;

    public E(int i10, int i11, SparseIntArray sparseIntArray) {
        this(i10, i11, sparseIntArray, 0, a.e.API_PRIORITY_OTHER, -1);
    }

    public E(int i10, int i11, SparseIntArray sparseIntArray, int i12, int i13, int i14) {
        k.i(i10 >= 0 && i11 >= i10);
        this.f43424b = i10;
        this.f43423a = i11;
        this.f43425c = sparseIntArray;
        this.f43426d = i12;
        this.f43427e = i13;
        this.f43429g = i14;
    }
}
