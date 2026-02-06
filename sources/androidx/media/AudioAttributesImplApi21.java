package androidx.media;

import android.media.AudioAttributes;

public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributes f17294a;

    /* renamed from: b  reason: collision with root package name */
    public int f17295b = -1;

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f17294a.equals(((AudioAttributesImplApi21) obj).f17294a);
    }

    public int hashCode() {
        return this.f17294a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f17294a;
    }
}
