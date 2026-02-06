package a8;

import U5.a;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: a8.a  reason: case insensitive filesystem */
public class C3140a implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    private static final String f36144e = b.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private int f36145a = 1;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f36146b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Map f36147c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map f36148d;

    /* renamed from: a8.a$a  reason: collision with other inner class name */
    class C0591a extends g {
        C0591a() {
        }

        public void b(Object obj, h hVar) {
            synchronized (C3140a.this.f36147c) {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject != null) {
                        String optString = jSONObject.optString("mode");
                        if (optString != null) {
                            String optString2 = jSONObject.optString("filename");
                            if (optString2 == null) {
                                throw new Exception("missing params.filename");
                            } else if (optString.equals("r")) {
                                hVar.a(Integer.valueOf(C3140a.this.c(optString2)));
                            } else {
                                throw new IllegalArgumentException("unsupported mode: " + optString);
                            }
                        } else {
                            throw new Exception("missing params.mode");
                        }
                    } else {
                        throw new Exception("params must be an object { mode: string, filename: string }");
                    }
                } catch (Exception e10) {
                    hVar.b(e10.toString());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: a8.a$b */
    class b extends g {
        b() {
        }

        public void b(Object obj, h hVar) {
            synchronized (C3140a.this.f36147c) {
                try {
                    if (obj instanceof Number) {
                        d dVar = (d) C3140a.this.f36147c.get(obj);
                        if (dVar != null) {
                            C3140a.this.f36147c.remove(obj);
                            dVar.a();
                            hVar.a("");
                        } else {
                            throw new Exception("invalid file handle, it might have timed out");
                        }
                    } else {
                        throw new Exception("params must be a file handle");
                    }
                } catch (Exception e10) {
                    hVar.b(e10.toString());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: a8.a$c */
    class c extends g {
        c() {
        }

        public void b(Object obj, h hVar) {
            synchronized (C3140a.this.f36147c) {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject != null) {
                        int optInt = jSONObject.optInt("file");
                        if (optInt != 0) {
                            int optInt2 = jSONObject.optInt("size");
                            if (optInt2 != 0) {
                                d dVar = (d) C3140a.this.f36147c.get(Integer.valueOf(optInt));
                                if (dVar != null) {
                                    hVar.a(dVar.d(optInt2));
                                } else {
                                    throw new Exception("invalid file handle, it might have timed out");
                                }
                            } else {
                                throw new Exception("invalid or missing read size");
                            }
                        } else {
                            throw new Exception("invalid or missing file handle");
                        }
                    } else {
                        throw new Exception("params must be an object { file: handle, size: number }");
                    }
                } catch (Exception e10) {
                    hVar.b(e10.toString());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: a8.a$d */
    private static class d {

        /* renamed from: a  reason: collision with root package name */
        private final FileInputStream f36152a;

        /* renamed from: b  reason: collision with root package name */
        private long f36153b = (System.currentTimeMillis() + 30000);

        public d(String str) {
            this.f36152a = new FileInputStream(str);
        }

        private void c() {
            this.f36153b = System.currentTimeMillis() + 30000;
        }

        public void a() {
            this.f36152a.close();
        }

        public boolean b() {
            if (System.currentTimeMillis() >= this.f36153b) {
                return true;
            }
            return false;
        }

        public String d(int i10) {
            c();
            byte[] bArr = new byte[i10];
            return Base64.encodeToString(bArr, 0, this.f36152a.read(bArr), 0);
        }
    }

    public C3140a() {
        HashMap hashMap = new HashMap();
        this.f36148d = hashMap;
        hashMap.put("fopen", new C0591a());
        hashMap.put("fclose", new b());
        hashMap.put("fread", new c());
    }

    /* access modifiers changed from: private */
    public int c(String str) {
        int i10 = this.f36145a;
        this.f36145a = i10 + 1;
        this.f36147c.put(Integer.valueOf(i10), new d(str));
        if (this.f36147c.size() == 1) {
            this.f36146b.postDelayed(this, 30000);
        }
        return i10;
    }

    public Map d() {
        return this.f36148d;
    }

    public void run() {
        synchronized (this.f36147c) {
            Iterator it = this.f36147c.values().iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.b()) {
                    it.remove();
                    try {
                        dVar.a();
                    } catch (IOException e10) {
                        String str = f36144e;
                        a.m(str, "closing expired file failed: " + e10.toString());
                    }
                }
            }
            if (!this.f36147c.isEmpty()) {
                this.f36146b.postDelayed(this, 30000);
            }
        }
    }
}
