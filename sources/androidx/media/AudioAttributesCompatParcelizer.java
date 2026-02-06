package androidx.media;

import androidx.versionedparcelable.a;

public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f17293a = (AudioAttributesImpl) aVar.v(audioAttributesCompat.f17293a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, a aVar) {
        aVar.x(false, false);
        aVar.M(audioAttributesCompat.f17293a, 1);
    }
}
