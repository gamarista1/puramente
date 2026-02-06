package kc;

import com.adjust.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import ub.C5230g;

/* renamed from: kc.c  reason: case insensitive filesystem */
public class C5065c {

    /* renamed from: a  reason: collision with root package name */
    private File f60937a;

    /* renamed from: b  reason: collision with root package name */
    private final C5230g f60938b;

    /* renamed from: kc.c$a */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C5065c(C5230g gVar) {
        this.f60938b = gVar;
    }

    private File a() {
        if (this.f60937a == null) {
            synchronized (this) {
                try {
                    if (this.f60937a == null) {
                        File filesDir = this.f60938b.m().getFilesDir();
                        this.f60937a = new File(filesDir, "PersistedInstallation." + this.f60938b.s() + ".json");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f60937a;
    }

    private JSONObject c() {
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            fileInputStream = new FileInputStream(a());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    fileInputStream.close();
                    return jSONObject;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public C5066d b(C5066d dVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", dVar.d());
            jSONObject.put("Status", dVar.g().ordinal());
            jSONObject.put("AuthToken", dVar.b());
            jSONObject.put("RefreshToken", dVar.f());
            jSONObject.put("TokenCreationEpochInSecs", dVar.h());
            jSONObject.put("ExpiresInSecs", dVar.c());
            jSONObject.put("FisError", dVar.e());
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f60938b.m().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes(Constants.ENCODING));
            fileOutputStream.close();
            if (createTempFile.renameTo(a())) {
                return dVar;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        } catch (IOException | JSONException unused) {
        }
    }

    public C5066d d() {
        JSONObject c10 = c();
        String optString = c10.optString("Fid", (String) null);
        int optInt = c10.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = c10.optString("AuthToken", (String) null);
        String optString3 = c10.optString("RefreshToken", (String) null);
        long optLong = c10.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = c10.optLong("ExpiresInSecs", 0);
        return C5066d.a().d(optString).g(a.values()[optInt]).b(optString2).f(optString3).h(optLong).c(optLong2).e(c10.optString("FisError", (String) null)).a();
    }
}
