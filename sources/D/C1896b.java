package d;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import d.C1895a;

/* renamed from: d.b  reason: case insensitive filesystem */
public class C1896b implements Parcelable {
    public static final Parcelable.Creator<C1896b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final boolean f19389a = false;

    /* renamed from: b  reason: collision with root package name */
    final Handler f19390b = null;

    /* renamed from: c  reason: collision with root package name */
    C1895a f19391c;

    /* renamed from: d.b$a */
    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public C1896b createFromParcel(Parcel parcel) {
            return new C1896b(parcel);
        }

        /* renamed from: b */
        public C1896b[] newArray(int i10) {
            return new C1896b[i10];
        }
    }

    /* renamed from: d.b$b  reason: collision with other inner class name */
    class C0337b extends C1895a.C0335a {
        C0337b() {
        }

        public void n0(int i10, Bundle bundle) {
            C1896b bVar = C1896b.this;
            Handler handler = bVar.f19390b;
            if (handler != null) {
                handler.post(new c(i10, bundle));
            } else {
                bVar.a(i10, bundle);
            }
        }
    }

    /* renamed from: d.b$c */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final int f19393a;

        /* renamed from: b  reason: collision with root package name */
        final Bundle f19394b;

        c(int i10, Bundle bundle) {
            this.f19393a = i10;
            this.f19394b = bundle;
        }

        public void run() {
            C1896b.this.a(this.f19393a, this.f19394b);
        }
    }

    C1896b(Parcel parcel) {
        this.f19391c = C1895a.C0335a.a(parcel.readStrongBinder());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            try {
                if (this.f19391c == null) {
                    this.f19391c = new C0337b();
                }
                parcel.writeStrongBinder(this.f19391c.asBinder());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(int i10, Bundle bundle) {
    }
}
