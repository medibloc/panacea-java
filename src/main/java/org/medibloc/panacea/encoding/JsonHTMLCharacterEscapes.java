package org.medibloc.panacea.encoding;

import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.SerializedString;

// HTMLCharacterEscapes needs to be used to marshal objects to JSON when signing on transactions,
// because Go escapes problematic HTML characters in json.Marshal() by default (in tendermint/go-amino).
// If not, the transaction signature verification by panacea-core would be failed.
//
// References:
//   https://golang.org/pkg/encoding/json/#Encoder.SetEscapeHTML
//   http://www.cowtowncoder.com/blog/archives/2012/08/entry_476.html
//   https://github.com/curioswitch/curiostack/blob/b2bdff5b5533fc3da8dc2c61cb47f7cd51b33269/common/grpc/protobuf-jackson/src/main/java/org/curioswitch/common/protobuf/json/MessageMarshaller.java#L108
class JsonHTMLCharacterEscapes extends CharacterEscapes {
    private final int[] asciiEscapes;
    private static final SerializedString HTML_ESCAPED_LEFT_ANGLE_BRACKET = new SerializedString("\\u003c");
    private static final SerializedString HTML_ESCAPED_RIGHT_ANGLE_BRACKET = new SerializedString("\\u003e");
    private static final SerializedString HTML_ESCAPED_AMPERSAND = new SerializedString("\\u0026");

    JsonHTMLCharacterEscapes() {
        // start with set of characters known to require escaping (double-quote, backslash etc)
        int[] esc = CharacterEscapes.standardAsciiEscapesForJSON();
        // and force escaping of a few others:
        esc['<'] = CharacterEscapes.ESCAPE_CUSTOM;
        esc['>'] = CharacterEscapes.ESCAPE_CUSTOM;
        esc['&'] = CharacterEscapes.ESCAPE_CUSTOM;
        asciiEscapes = esc;
    }

    // this method gets called for character codes 0 - 127
    @Override
    public int[] getEscapeCodesForAscii() {
        return asciiEscapes;
    }

    // and this for others; we don't need anything special here
    @Override
    public SerializableString getEscapeSequence(int ch) {
        switch (ch) {
            case '<':
                return HTML_ESCAPED_LEFT_ANGLE_BRACKET;
            case '>':
                return HTML_ESCAPED_RIGHT_ANGLE_BRACKET;
            case '&':
                return HTML_ESCAPED_AMPERSAND;
            default:
                return null;
        }
    }
}
