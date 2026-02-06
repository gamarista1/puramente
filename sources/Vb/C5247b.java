package vb;

import android.text.TextUtils;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import xb.C5276a;

/* renamed from: vb.b  reason: case insensitive filesystem */
public class C5247b {

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f61745g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h  reason: collision with root package name */
    static final DateFormat f61746h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a  reason: collision with root package name */
    private final String f61747a;

    /* renamed from: b  reason: collision with root package name */
    private final String f61748b;

    /* renamed from: c  reason: collision with root package name */
    private final String f61749c;

    /* renamed from: d  reason: collision with root package name */
    private final Date f61750d;

    /* renamed from: e  reason: collision with root package name */
    private final long f61751e;

    /* renamed from: f  reason: collision with root package name */
    private final long f61752f;

    public C5247b(String str, String str2, String str3, Date date, long j10, long j11) {
        this.f61747a = str;
        this.f61748b = str2;
        this.f61749c = str3;
        this.f61750d = date;
        this.f61751e = j10;
        this.f61752f = j11;
    }

    static C5247b a(C5276a.C0916a aVar) {
        String str = aVar.f62204d;
        if (str == null) {
            str = "";
        }
        return new C5247b(aVar.f62202b, String.valueOf(aVar.f62203c), str, new Date(aVar.f62213m), aVar.f62205e, aVar.f62210j);
    }

    static C5247b b(Map map) {
        String str;
        g(map);
        try {
            Date parse = f61746h.parse((String) map.get("experimentStartTime"));
            long parseLong = Long.parseLong((String) map.get("triggerTimeoutMillis"));
            long parseLong2 = Long.parseLong((String) map.get("timeToLiveMillis"));
            String str2 = (String) map.get("experimentId");
            String str3 = (String) map.get("variantId");
            if (map.containsKey("triggerEvent")) {
                str = (String) map.get("triggerEvent");
            } else {
                str = "";
            }
            return new C5247b(str2, str3, str, parse, parseLong, parseLong2);
        } catch (ParseException e10) {
            throw new C5246a("Could not process experiment: parsing experiment start time failed.", e10);
        } catch (NumberFormatException e11) {
            throw new C5246a("Could not process experiment: one of the durations could not be converted into a long.", e11);
        }
    }

    private static void g(Map map) {
        ArrayList arrayList = new ArrayList();
        for (String str : f61745g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new C5246a(String.format("The following keys are missing from the experiment info map: %s", new Object[]{arrayList}));
        }
    }

    /* access modifiers changed from: package-private */
    public String c() {
        return this.f61747a;
    }

    /* access modifiers changed from: package-private */
    public long d() {
        return this.f61750d.getTime();
    }

    /* access modifiers changed from: package-private */
    public String e() {
        return this.f61748b;
    }

    /* access modifiers changed from: package-private */
    public C5276a.C0916a f(String str) {
        String str2;
        C5276a.C0916a aVar = new C5276a.C0916a();
        aVar.f62201a = str;
        aVar.f62213m = d();
        aVar.f62202b = this.f61747a;
        aVar.f62203c = this.f61748b;
        if (TextUtils.isEmpty(this.f61749c)) {
            str2 = null;
        } else {
            str2 = this.f61749c;
        }
        aVar.f62204d = str2;
        aVar.f62205e = this.f61751e;
        aVar.f62210j = this.f61752f;
        return aVar;
    }
}
