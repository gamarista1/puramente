package G5;

import Sg.C5541d;
import Sg.m;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.facebook.I;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import mf.C6559l;
import org.json.JSONArray;
import org.json.JSONObject;
import t7.C4049a;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f31501a = new j();

    private j() {
    }

    public static final File a() {
        Class<j> cls = j.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            File file = new File(I.l().getFilesDir(), "facebook_ml/");
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            return null;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final Map c(File file) {
        int i10;
        File file2 = file;
        Class<j> cls = j.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(file2, "file");
            try {
                FileInputStream fileInputStream = new FileInputStream(file2);
                int available = fileInputStream.available();
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                byte[] bArr = new byte[available];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                if (available < 4) {
                    return null;
                }
                int i11 = 0;
                ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, 4);
                wrap.order(ByteOrder.LITTLE_ENDIAN);
                int i12 = wrap.getInt();
                int i13 = i12 + 4;
                if (available < i13) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(new String(bArr, 4, i12, C5541d.f65029b));
                JSONArray names = jSONObject.names();
                int length = names.length();
                String[] strArr = new String[length];
                for (int i14 = 0; i14 < length; i14++) {
                    strArr[i14] = names.getString(i14);
                }
                C6559l.K(strArr);
                HashMap hashMap = new HashMap();
                int i15 = 0;
                while (i15 < length) {
                    String str = strArr[i15];
                    if (str == null) {
                        i10 = i11;
                    } else {
                        JSONArray jSONArray = jSONObject.getJSONArray(str);
                        int length2 = jSONArray.length();
                        int[] iArr = new int[length2];
                        int i16 = 1;
                        while (i11 < length2) {
                            int i17 = jSONArray.getInt(i11);
                            iArr[i11] = i17;
                            i16 *= i17;
                            i11++;
                        }
                        int i18 = i16 * 4;
                        int i19 = i13 + i18;
                        if (i19 > available) {
                            return null;
                        }
                        ByteBuffer wrap2 = ByteBuffer.wrap(bArr, i13, i18);
                        wrap2.order(ByteOrder.LITTLE_ENDIAN);
                        a aVar = new a(iArr);
                        i10 = 0;
                        wrap2.asFloatBuffer().get(aVar.a(), 0, i16);
                        hashMap.put(str, aVar);
                        i13 = i19;
                    }
                    i15++;
                    i11 = i10;
                }
                return hashMap;
            } catch (Exception unused) {
                return null;
            }
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public final String b(String str) {
        int i10;
        boolean z10;
        if (C4049a.d(this)) {
            return null;
        }
        try {
            C6496s.h(str, "str");
            int length = str.length() - 1;
            int i11 = 0;
            boolean z11 = false;
            while (true) {
                if (i11 > length) {
                    break;
                }
                if (!z11) {
                    i10 = i11;
                } else {
                    i10 = length;
                }
                if (C6496s.i(str.charAt(i10), 32) <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z11) {
                    if (!z10) {
                        z11 = true;
                    } else {
                        i11++;
                    }
                } else if (!z10) {
                    break;
                } else {
                    length--;
                }
            }
            String join = TextUtils.join(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, (String[]) new m("\\s+").g(str.subSequence(i11, length + 1).toString(), 0).toArray(new String[0]));
            C6496s.g(join, "join(\" \", strArray)");
            return join;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    public final int[] d(String str, int i10) {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            C6496s.h(str, "texts");
            int[] iArr = new int[i10];
            String b10 = b(str);
            Charset forName = Charset.forName(Constants.ENCODING);
            C6496s.g(forName, "forName(\"UTF-8\")");
            byte[] bytes = b10.getBytes(forName);
            C6496s.g(bytes, "this as java.lang.String).getBytes(charset)");
            for (int i11 = 0; i11 < i10; i11++) {
                if (i11 < bytes.length) {
                    iArr[i11] = bytes[i11] & 255;
                } else {
                    iArr[i11] = 0;
                }
            }
            return iArr;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }
}
