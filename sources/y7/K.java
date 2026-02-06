package y7;

import Cf.c;
import Ef.i;
import Ef.m;
import Sg.C5541d;
import android.os.Bundle;
import android.util.Base64;
import com.facebook.C3286a;
import com.facebook.C3459v;
import com.facebook.I;
import com.facebook.M;
import com.facebook.T;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import yf.C6798l;

public final class K {

    /* renamed from: a  reason: collision with root package name */
    public static final K f49617a = new K();

    private K() {
    }

    public static final M a(String str, String str2, String str3) {
        C6496s.h(str, "authorizationCode");
        C6496s.h(str2, "redirectUri");
        C6496s.h(str3, "codeVerifier");
        Bundle bundle = new Bundle();
        bundle.putString("code", str);
        bundle.putString("client_id", I.m());
        bundle.putString("redirect_uri", str2);
        bundle.putString("code_verifier", str3);
        M x10 = M.f39311n.x((C3286a) null, "oauth/access_token", (M.b) null);
        x10.I(T.GET);
        x10.J(bundle);
        return x10;
    }

    public static final String b(String str, C4195a aVar) {
        C6496s.h(str, "codeVerifier");
        C6496s.h(aVar, "codeChallengeMethod");
        if (!d(str)) {
            throw new C3459v("Invalid Code Verifier.");
        } else if (aVar == C4195a.PLAIN) {
            return str;
        } else {
            try {
                byte[] bytes = str.getBytes(C5541d.f65033f);
                C6496s.g(bytes, "this as java.lang.String).getBytes(charset)");
                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                instance.update(bytes, 0, bytes.length);
                String encodeToString = Base64.encodeToString(instance.digest(), 11);
                C6496s.g(encodeToString, "{\n      // try to genera… or Base64.NO_WRAP)\n    }");
                return encodeToString;
            } catch (Exception e10) {
                throw new C3459v((Throwable) e10);
            }
        }
    }

    public static final String c() {
        int q10 = m.q(new i(43, 128), c.f62630a);
        List L02 = C6565s.L0(C6565s.L0(C6565s.L0(C6565s.L0(C6565s.K0(C6565s.I0(new Ef.c('a', 'z'), new Ef.c('A', 'Z')), new Ef.c('0', '9')), '-'), '.'), '_'), '~');
        ArrayList arrayList = new ArrayList(q10);
        for (int i10 = 0; i10 < q10; i10++) {
            Character ch2 = (Character) C6565s.M0(L02, c.f62630a);
            ch2.charValue();
            arrayList.add(ch2);
        }
        return C6565s.x0(arrayList, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null);
    }

    public static final boolean d(String str) {
        if (str == null || str.length() == 0 || str.length() < 43 || str.length() > 128) {
            return false;
        }
        return new Sg.m("^[-._~A-Za-z0-9]+$").d(str);
    }
}
