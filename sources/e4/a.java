package E4;

import H4.f;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private final HttpURLConnection f30626a;

    public a(HttpURLConnection httpURLConnection) {
        this.f30626a = httpURLConnection;
    }

    private String a(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb2.append(readLine);
                    sb2.append(10);
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb2.toString();
    }

    public String W() {
        return this.f30626a.getContentType();
    }

    public InputStream Y() {
        return this.f30626a.getInputStream();
    }

    public String Y0() {
        try {
            if (m0()) {
                return null;
            }
            return "Unable to fetch " + this.f30626a.getURL() + ". Failed with " + this.f30626a.getResponseCode() + "\n" + a(this.f30626a);
        } catch (IOException e10) {
            f.d("get error failed ", e10);
            return e10.getMessage();
        }
    }

    public void close() {
        this.f30626a.disconnect();
    }

    public boolean m0() {
        try {
            if (this.f30626a.getResponseCode() / 100 == 2) {
                return true;
            }
            return false;
        } catch (IOException unused) {
            return false;
        }
    }
}
