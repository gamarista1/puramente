package o7;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import androidx.fragment.app.C1769q;
import kotlin.jvm.internal.C6496s;

public final class B {

    /* renamed from: a  reason: collision with root package name */
    private C1769q f47095a;

    /* renamed from: b  reason: collision with root package name */
    private Fragment f47096b;

    public B(C1769q qVar) {
        C6496s.h(qVar, "fragment");
        this.f47095a = qVar;
    }

    public final Activity a() {
        C1769q qVar = this.f47095a;
        if (qVar == null) {
            Fragment fragment = this.f47096b;
            if (fragment != null) {
                return fragment.getActivity();
            }
            return null;
        } else if (qVar != null) {
            return qVar.getActivity();
        } else {
            return null;
        }
    }

    public final Fragment b() {
        return this.f47096b;
    }

    public final C1769q c() {
        return this.f47095a;
    }

    public final void d(Intent intent, int i10) {
        C1769q qVar = this.f47095a;
        if (qVar == null) {
            Fragment fragment = this.f47096b;
            if (fragment != null) {
                fragment.startActivityForResult(intent, i10);
            }
        } else if (qVar != null) {
            qVar.startActivityForResult(intent, i10);
        }
    }

    public B(Fragment fragment) {
        C6496s.h(fragment, "fragment");
        this.f47096b = fragment;
    }
}
