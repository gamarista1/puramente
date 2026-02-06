package com.fasterxml.jackson.core.format;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.MergedStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class DataFormatMatcher {
    protected final byte[] _bufferedData;
    protected final int _bufferedLength;
    protected final int _bufferedStart;
    protected final JsonFactory _match;
    protected final MatchStrength _matchStrength;
    protected final InputStream _originalStream;

    protected DataFormatMatcher(InputStream inputStream, byte[] bArr, int i10, int i11, JsonFactory jsonFactory, MatchStrength matchStrength) {
        this._originalStream = inputStream;
        this._bufferedData = bArr;
        this._bufferedStart = i10;
        this._bufferedLength = i11;
        this._match = jsonFactory;
        this._matchStrength = matchStrength;
    }

    public JsonParser createParserWithMatch() {
        JsonFactory jsonFactory = this._match;
        if (jsonFactory == null) {
            return null;
        }
        if (this._originalStream == null) {
            return jsonFactory.createParser(this._bufferedData, this._bufferedStart, this._bufferedLength);
        }
        return jsonFactory.createParser(getDataStream());
    }

    public InputStream getDataStream() {
        if (this._originalStream == null) {
            return new ByteArrayInputStream(this._bufferedData, this._bufferedStart, this._bufferedLength);
        }
        return new MergedStream((IOContext) null, this._originalStream, this._bufferedData, this._bufferedStart, this._bufferedLength);
    }

    public JsonFactory getMatch() {
        return this._match;
    }

    public MatchStrength getMatchStrength() {
        MatchStrength matchStrength = this._matchStrength;
        if (matchStrength == null) {
            return MatchStrength.INCONCLUSIVE;
        }
        return matchStrength;
    }

    public String getMatchedFormatName() {
        return this._match.getFormatName();
    }

    public boolean hasMatch() {
        if (this._match != null) {
            return true;
        }
        return false;
    }
}
