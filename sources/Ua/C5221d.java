package ua;

import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* renamed from: ua.d  reason: case insensitive filesystem */
public final /* synthetic */ class C5221d implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ C5221d f61673a = new C5221d();

    private /* synthetic */ C5221d() {
    }

    public final int compare(Object obj, Object obj2) {
        Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
        return ((Scope) obj).o0().compareTo(((Scope) obj2).o0());
    }
}
