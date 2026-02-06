package Qa;

import Qa.a;
import android.content.Context;
import android.os.AsyncTask;
import ya.C5288e;
import ya.C5289f;

final class b extends AsyncTask {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f52242a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a.C0800a f52243b;

    b(Context context, a.C0800a aVar) {
        this.f52242a = context;
        this.f52243b = aVar;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            a.a(this.f52242a);
            return 0;
        } catch (C5289f e10) {
            return Integer.valueOf(e10.b());
        } catch (C5288e e11) {
            return Integer.valueOf(e11.f62276a);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            this.f52243b.a();
            return;
        }
        this.f52243b.b(num.intValue(), a.f52238a.b(this.f52242a, num.intValue(), "pi"));
    }
}
