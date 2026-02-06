package Fe;

import android.content.Context;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.amazon.a.a.o.b.f;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;

/* renamed from: Fe.c  reason: case insensitive filesystem */
public abstract class C3014c {

    /* renamed from: a  reason: collision with root package name */
    private static String f31020a = "bnc_no_value";

    public static String a() {
        return f31020a;
    }

    public static void b(Context context, String str, long j10, long j11, String str2, Boolean bool, Long l10, Long l11) {
        String str3 = str;
        long j12 = j10;
        long j13 = j11;
        String str4 = str2;
        E G10 = E.G(context);
        if (!TextUtils.isEmpty(str2)) {
            G10.y0(str4);
            if (str4.equals(y.Meta_Install_Referrer.b())) {
                G10.P0(bool.booleanValue());
            }
        }
        if (j12 > 0) {
            G10.S0("bnc_referrer_click_ts", j12);
        }
        if (j13 > 0) {
            G10.S0("bnc_install_begin_ts", j13);
        }
        if (str3 != null) {
            try {
                String decode = URLDecoder.decode(str, Constants.ENCODING);
                HashMap hashMap = new HashMap();
                String[] split = decode.split("&");
                G10.x0(decode);
                for (String str5 : split) {
                    if (!TextUtils.isEmpty(str5)) {
                        String[] split2 = str5.split((str5.contains(f.f37530b) || !str5.contains("-")) ? f.f37530b : "-");
                        if (split2.length > 1) {
                            hashMap.put(URLDecoder.decode(split2[0], Constants.ENCODING), URLDecoder.decode(split2[1], Constants.ENCODING));
                        }
                    }
                }
                y yVar = y.LinkClickID;
                if (hashMap.containsKey(yVar.b())) {
                    String str6 = (String) hashMap.get(yVar.b());
                    f31020a = str6;
                    G10.R0(str6);
                }
                y yVar2 = y.IsFullAppConv;
                if (hashMap.containsKey(yVar2.b())) {
                    y yVar3 = y.ReferringLink;
                    if (hashMap.containsKey(yVar3.b())) {
                        G10.O0(Boolean.parseBoolean((String) hashMap.get(yVar2.b())));
                        G10.w0((String) hashMap.get(yVar3.b()));
                    }
                }
                y yVar4 = y.GoogleSearchInstallReferrer;
                if (hashMap.containsKey(yVar4.b())) {
                    G10.I0((String) hashMap.get(yVar4.b()));
                }
                if (hashMap.containsValue(y.PlayAutoInstalls.b())) {
                    Context context2 = context;
                    C3026o.e(context, hashMap);
                }
            } catch (UnsupportedEncodingException e10) {
                C3023l.m("Caught UnsupportedEncodingException " + e10.getMessage());
            } catch (IllegalArgumentException e11) {
                C3023l.m("Caught IllegalArgumentException " + e11.getMessage());
            }
        }
        if (l10 != null && l10.longValue() > 0) {
            G10.S0("bnc_install_begin_server_ts", l10.longValue());
        }
        if (l11 != null && l11.longValue() > 0) {
            G10.S0("bnc_referrer_click_server_ts", l11.longValue());
        }
    }
}
